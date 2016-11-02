package com.fastpan.web.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class FirstDemo {
 
    /**
     * 通过GET方式发起http请求
     */
	
	public static void main(String[] args) {
		//new FirstDemo().requestByGetMethod();
		new FirstDemo().requestByPostMethod();
	}
  
    public void requestByGetMethod(){
    	
    	System.setProperty("http.proxyHost", "proxy.neuedu.com");   
		System.setProperty("http.proxyPort", "8080"); 
        //创建默认的httpClient实例
        CloseableHttpClient httpClient = getHttpClient();
        try {
            //用get方法发送http请求
            HttpGet get = new HttpGet("http://sendcloud.sohu.com/webapi/mail.send.json?api_user=jichg1986_test_T0JHIe&api_key=ZAMBmexA65kFvXgZ&from=test@test.com&fromname=来自测试发送&subject=测试&html=这是一封测试邮件&to=84362484@qq.com;joe@ifaxin.com&cc=bida@ifaxin.com&bcc=lianzimi@ifaxin.com&replyto=reply@test.com&label=89071&resp_email_id=true");
            System.out.println("执行get请求:...."+get.getURI());
            CloseableHttpResponse httpResponse = null;
            //发送get请求
            httpResponse = httpClient.execute(get);
            try{
                //response实体
                HttpEntity entity = httpResponse.getEntity();
                if (null != entity){
                    System.out.println("响应状态码:"+ httpResponse.getStatusLine());
                    System.out.println("-------------------------------------------------");
                    System.out.println("响应内容:" + EntityUtils.toString(entity));
                    System.out.println("-------------------------------------------------");                    
                }
            }
            finally{
                httpResponse.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try{
                closeHttpClient(httpClient);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
 
    }
    
    /**
     * POST方式发起http请求
     */
    
    public void requestByPostMethod(){
        CloseableHttpClient httpClient = getHttpClient();
        try {
            HttpPost post = new HttpPost("http://sendcloud.sohu.com/webapi/mail.send.json");          //这里用上本机的某个工程做测试
            //创建参数列表
            List<NameValuePair> list = new ArrayList<NameValuePair>();
           list.add(new BasicNameValuePair("api_user", "jichg1986_test_T0JHIe"));
           list.add(new BasicNameValuePair("api_key", "ZAMBmexA65kFvXgZ"));
           list.add(new BasicNameValuePair("from", "84362484@qq.com"));
           list.add(new BasicNameValuePair("fromname", "11"));
           list.add(new BasicNameValuePair("subject", "22"));
           list.add(new BasicNameValuePair("html", "<html><body><h2>Hello World!</h2></body></html>"));
          // list.add(new BasicNameValuePair("to", "jichg1986@163.com"));
          // list.add(new BasicNameValuePair("cc", "bida@ifaxin.com"));
          // list.add(new BasicNameValuePair("bcc", "lianzimi@ifaxin.com"));
           list.add(new BasicNameValuePair("replyto", "84362484@qq.com"));
           list.add(new BasicNameValuePair("label", "89071"));
           list.add(new BasicNameValuePair("resp_email_id", "true"));
           list.add(new BasicNameValuePair("x_smtpapi", "{\"to\":[\"84362484@qq.com\"]}"));
            //url格式编码
            UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list,"UTF-8");
            post.setEntity(uefEntity);
            
          /*  List<NameValuePair> nvps = new ArrayList<NameValuePair>();  
            if(map!=null){  
                for (Entry<String, String> entry : map.entrySet()) {  
                    nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));  
                }  
            }  */
            
           // post.setHeader("Content-type", "application/x-www-form-urlencoded");
            //post.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            System.out.println("POST 请求...." + post.getURI());
            //执行请求
            CloseableHttpResponse httpResponse = httpClient.execute(post);
            try{
                HttpEntity entity = httpResponse.getEntity();
                if (null != entity){
                    System.out.println("-------------------------------------------------------");
                    System.out.println(EntityUtils.toString(uefEntity));
                    System.out.println("-------------------------------------------------------");
                }
            } finally{
                httpResponse.close();
            }
             
        } catch( UnsupportedEncodingException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                closeHttpClient(httpClient);                
            } catch(Exception e){
                e.printStackTrace();
            }
        }
         
    }
    private CloseableHttpClient getHttpClient(){
        return HttpClients.createDefault();
    }
     
    private void closeHttpClient(CloseableHttpClient client) throws IOException{
        if (client != null){
            client.close();
        }
    }
} 
