package com.fastpan.service.test;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		int j = testMapper.delete(new Test(2,"22"));
		
		System.out.println("增加的方法"+i+","+"删除的方法"+j);
	}
	
}
