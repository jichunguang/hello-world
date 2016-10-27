package jcg.service;

import java.util.List;



import jcg.bean.ClassInfo;
import jcg.dao.ClassInfoDAOImpl;


public class ClassInfoServiceImpl {
	private ClassInfoDAOImpl classInfoDAOImpl;

	public ClassInfoDAOImpl getClassInfoDAOImpl() {
		return classInfoDAOImpl;
	}

	public void setClassInfoDAOImpl(ClassInfoDAOImpl classInfoDAOImpl) {
		this.classInfoDAOImpl = classInfoDAOImpl;
	}

	// 查询所有班级信息！
	public List<ClassInfo> query() {

		return classInfoDAOImpl.query();
	}

	// 根据ajax 判断fullname
	public List<ClassInfo> checkclassInfoFullname(String str) {

		return classInfoDAOImpl.checkClassFullName(str);

	}

	// 根据ajax 判断easyName
	public List<ClassInfo> checkclassinfoEasyName(String str) {

		return classInfoDAOImpl.checkClassEasyName(str);
	}

	// 通过Id 查对象！
	public ClassInfo queryById(Integer id) {
		return classInfoDAOImpl.queryById(id);
	}

	// 增加
	public void add(ClassInfo classInfo) {

		classInfoDAOImpl.add(classInfo);
	}

	// 删除
	public void delete(Integer id) {
		classInfoDAOImpl.delete(id);
	}

	// 改
	public void update(ClassInfo classInfo) {
		classInfoDAOImpl.update(classInfo);

	}

}
