package jcg.controller;

import java.util.List;

import jcg.bean.ClassInfo;
import jcg.service.ClassInfoServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassInfoController {

	//私有化ClassInfo
	private ClassInfoServiceImpl classInfoServiceImpl;
	
	public ClassInfoServiceImpl getClassInfoServiceImpl() {
		return classInfoServiceImpl;
	}

	public void setClassInfoServiceImpl(ClassInfoServiceImpl classInfoServiceImpl) {
		this.classInfoServiceImpl = classInfoServiceImpl;
	}
	
	//互取全部数据；
	@RequestMapping("/query")
	public String query(ModelMap modelMap){
		//classInfoServiceImpl.add(new ClassInfo(1,"3333-33-33 16:16:02","3333","3333",1,"3333-3-3","3333-1-1",1));
		//classInfoServiceImpl.delete(45);
		//classInfoServiceImpl.update(new ClassInfo(46,1,"1111-11-11 16:16:02","1111","1111",1,"1111-1-1","1111-1-1",1));
			//ClassInfo c = classInfoServiceImpl.queryById(46);
		//List<ClassInfo> list= classInfoServiceImpl.checkclassInfoFullname("3333");
		//List<ClassInfo> list= classInfoServiceImpl.checkclassinfoEasyName("1111");
		List<ClassInfo> list = classInfoServiceImpl.query();
		for(ClassInfo c:list){
			
		modelMap.addAttribute("list", list);
			System.out.println(c);
		}
		return "queryAllClassInfo";
	}
}
