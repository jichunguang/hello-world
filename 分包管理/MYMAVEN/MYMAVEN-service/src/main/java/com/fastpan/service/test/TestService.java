package com.fastpan.service.test;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fastpan.dao.mapper.test.TestMapper;
import com.fastpan.dao.pojo.test.Test;
import com.fastpan.facade.test.TestFacede;




@Service
public class TestService implements TestFacede{

@Autowired
TestMapper testMapper;
	/**
	 * 测试调用数据库OK
	 */
	@Override
	public List<Test> test() {
		// TODO Auto-generated method stub
		System.out.println("111111service");
		List<Test> list = testMapper.queryob();
		
		//int	y = testMapper.insertTest(new Test(1,"2"));
		
		//List<Test> list = testMapper.selectAll();
	//	System.out.println(i);
	//	System.out.println("受影响的函数"+y);
		System.out.println("长度"+list.size());
		
		for(Test test:list){
			System.out.println("对象"+test);
		}
		
		return list;
	}
	/**
	 * 测试事务OK
	 */
	@Override
	public void deleteTest(Test test){
		int i = testMapper.insertTest(new Test(1,"22"));
		int j = testMapper.delete(new Test(1,"22"));
		
		System.out.println("增加的方法"+i+","+"删除的方法"+j);
	}
	
	/**
	 * 测试文件上传
	 */
	// 上传水单
	@Override
	public void upLoadBankReceipt(Test test, CommonsMultipartFile file) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String date = simpleDateFormat.format(new Date());
		File file1 = new File(getPath("picturePath.properties") + "\\" + "ID：" + test.getId() + "\\" + date + "上传文件");

		if (!file1.exists()) {
			file1.mkdirs();
		}

		Boolean flag = inputAndOutput(file, file1.toString());
		System.out.println("是否成功"+flag);
		

	}

	// 工具：上传
	
	public boolean inputAndOutput(CommonsMultipartFile file, String path) {
		System.out.println("路径" + path);
		try {
			InputStream is = file.getInputStream();
			OutputStream os = new FileOutputStream(new File(path, file.getOriginalFilename()));
			int len = 0;

			byte[] buffer = new byte[1024];
			while ((len = is.read(buffer)) != -1) {
				os.write(buffer, 0, len);
				os.flush();
			}
			os.close();
			is.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

	// 工具：获取文件中的路径
	
	public String getPath(String propertie) {
		Properties properties = new Properties();
		String path = Thread.currentThread().getContextClassLoader().getResource(propertie).getPath();
		try {
			properties.load(new FileInputStream(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path1 = properties.getProperty("path");

		return path1;
	}
}
