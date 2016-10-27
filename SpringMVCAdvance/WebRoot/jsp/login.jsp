<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'index.jsp' starting page</title>
    

<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
function changeimg()
{
 
var myimg = document.getElementById("code"); 
now = new Date(); 
myimg.src="<%=path %>/jsp/makeCertPic.jsp?code="+now.getTime();

} 
</script>

<script type="text/javascript">




	<%
		Cookie remeber = null;
		Cookie[] cookie = request.getCookies();
		
		if(cookie!=null&&cookie.length>0){
			for(Cookie cookie1:cookie ){
				if(cookie1.getName().equals("remeber")){
				remeber=cookie1;
				
				}
			
			}
		
		}
	
	
	%>


$(document).ready(function(){
	
	if("${msg}"==1){
		document.getElementById("disply").innerHTML="验证码错误";
		document.getElementById("disply").style.display="block";
	}
	if("${msg}"==0){
		document.getElementById("disply").innerHTML="用户名或密码错误";
		document.getElementById("disply").style.display="block";
	}
	

	

});

 function noNullCheck(){
	
	var  username = document.getElementById("name").value;
	var  password = document.getElementById("pwd").value;
	
	if(username==""){
	document.getElementById("disply").innerHTML="用户名不能为空";
	document.getElementById("disply").style.display="block";
	return false;
	}
	if(password==""){
	document.getElementById("disply").innerHTML="密码不能为空";
	document.getElementById("disply").style.display="block";
	return false;
	}
	
}  

function endMsg(){
	document.getElementById("disply").style.display="none";

}
	

</script>	

    <style type="text/css">
.width {
	width: 200px;margin-left: 60;margin-top: 2
}

.up{border:1px solid gray;width:80px;height:30px;margin-left: 200;margin-top: 8;font-size: 17;

}

#disply{color: red;margin-top:-225;margin-left: 400
}
#name{
margin-top: 310;width: 300px ;height: 48;margin-left: 270;font-size: 27;
}
#pwd{
margin-top: 23;width: 300px ;height: 48;margin-left: 270;font-size: 27;
}

#first{

width: 100%;
height:100%;

background: url(C:\Documents and Settings\Administrator\桌面\我要查看的项目\SpringMVCAdvance\WebRoot\img\neu33.png) center top no-repeat;
margin:0 inherit;
overflow:hidden
}
#code{
style="width:55px;height:55px; margin-top: 500;border: 1px solid gray;
}

#ok{
margin-top:30;
margin-left:10;
}

</style>


  </head>
  
  <body style="text-align:center">
  <div id ="first" >
    <form action="login" method="post" onsubmit="return noNullCheck()" >
    
    
    	
    	
    			
<div ><input type="text" id="name" name="username" class="width" onclick="endMsg()" value="<%=remeber==null?"":remeber.getValue() %>"/></div>
    			
    		
    		
    		<div><input type="password" id="pwd" name="pwd" " class="width" onclick="endMsg()"/></div>
    		
    		  
    			<div>  
    		 		 <input type="text" name="certCode1"  id="certCode1" class="up" />
    		 		<img id="code" src="<%=path %>/jsp/makeCertPic.jsp">
              	 <a href="javascript:changeimg()" >换一张 </a></div>
              	  <span id="ccc"></span>
              	    
              	   
           
      <div> <input type="checkbox" name="checkbox"  value="yes"  class="width"  <%=remeber==null?"": "checked" %>/>
      
      <div  id="ok"><input type="submit" value="登陆"/>
    	&nbsp;&nbsp;&nbsp;
    	<a href ="" >注册</a></div>
    	
      
      </div>
            
           
    	
    	
    	
    	
    	
    	
    	<span class="disply" id="disply" ></span>
    	
    </form>
    </div>
  </body>
</html>
    
    
    
