package com.fastpan.web.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fastpan.dao.pojo.test.Test;
import com.fastpan.facade.test.TestFacede;


@Controller
public class TestWeb {
	@Autowired
	TestFacede TestFacede;
	
	@RequestMapping("test")
	@ResponseBody
	public Object test(){
		TestFacede.deleteTest(new Test());;
		System.out.println("����control�ķ���");
		return "come";
	}
}
