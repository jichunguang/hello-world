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

	// ��ѯ���а༶��Ϣ��
	public List<ClassInfo> query() {

		return classInfoDAOImpl.query();
	}

	// ����ajax �ж�fullname
	public List<ClassInfo> checkclassInfoFullname(String str) {

		return classInfoDAOImpl.checkClassFullName(str);

	}

	// ����ajax �ж�easyName
	public List<ClassInfo> checkclassinfoEasyName(String str) {

		return classInfoDAOImpl.checkClassEasyName(str);
	}

	// ͨ��Id �����
	public ClassInfo queryById(Integer id) {
		return classInfoDAOImpl.queryById(id);
	}

	// ����
	public void add(ClassInfo classInfo) {

		classInfoDAOImpl.add(classInfo);
	}

	// ɾ��
	public void delete(Integer id) {
		classInfoDAOImpl.delete(id);
	}

	// ��
	public void update(ClassInfo classInfo) {
		classInfoDAOImpl.update(classInfo);

	}

}
