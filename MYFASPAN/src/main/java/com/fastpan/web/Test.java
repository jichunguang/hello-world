package com.fastpan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	@RequestMapping("test")
	@ResponseBody
	public Object test(){
		System.out.println("����control�ķ���");
		return "come";
	}
}
