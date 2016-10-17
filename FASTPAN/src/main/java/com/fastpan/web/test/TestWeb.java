package com.fastpan.web.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	/**
	 * 测试ModelMap
	 * @param map
	 * @return
	 */
	@RequestMapping("test2")
	public String test2(ModelMap map){
		
		System.out.println("11");
		map.addAttribute("1", "2");
		
		return "index";
		
		
	}
	
	@RequestMapping("test3")
	public ModelAndView test3(Test test,HttpServletRequest request){
		ModelAndView map = new ModelAndView();
		System.out.println("11");
		System.out.println("request的值"+request.getParameter("name"));
		
		System.out.println("传过去的值"+test.getName());
		map.addObject("list", TestFacede.test());
		map.addObject("test", test);
		map.setViewName("index");
		return map;
		
		
	}
}
