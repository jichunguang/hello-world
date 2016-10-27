package jcg.dao;

import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;



import jcg.bean.ClassInfo;

public class ClassInfoDAOImpl {
	//��ѯ����
	public List<ClassInfo> query(){
		
		return BaseDAO.sqlsession.selectList("queryAll",ClassInfo.class);
		
	}
	//ajax ���ȫ����
	public List<ClassInfo>  checkClassFullName(String str){
		
		return BaseDAO.sqlsession.selectList("ajaxQueryClassFullName",str);
		
	}
	//ajax����ƣ�
	public List<ClassInfo> checkClassEasyName(String str){
		
		return BaseDAO.sqlsession.selectList("ajaxQueryClassEasyName",str);
	}
	//ͨ��ID��ѯ
	public  ClassInfo  queryById(Integer id){
		
		return BaseDAO.sqlsession.selectOne("queryById", id);
	}
	//�޸ģ�����
	public void update(ClassInfo classInfo){
		
		BaseDAO.sqlsession.update("update",classInfo);
		BaseDAO.sqlsession.commit();
	}
	//ɾ��
	public  void delete(Integer id ){
		
		BaseDAO.sqlsession.delete("delete", id);
		BaseDAO.sqlsession.commit();
	}
	//����
	public  void add(ClassInfo classInfo){
		
		BaseDAO.sqlsession.insert("add", classInfo);
		BaseDAO.sqlsession.commit();
	}
	
}

