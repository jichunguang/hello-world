package jcg.dao;

import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;



import jcg.bean.ClassInfo;

public class ClassInfoDAOImpl {
	//查询所有
	public List<ClassInfo> query(){
		
		return BaseDAO.sqlsession.selectList("queryAll",ClassInfo.class);
		
	}
	//ajax 检查全名；
	public List<ClassInfo>  checkClassFullName(String str){
		
		return BaseDAO.sqlsession.selectList("ajaxQueryClassFullName",str);
		
	}
	//ajax检查简称；
	public List<ClassInfo> checkClassEasyName(String str){
		
		return BaseDAO.sqlsession.selectList("ajaxQueryClassEasyName",str);
	}
	//通过ID查询
	public  ClassInfo  queryById(Integer id){
		
		return BaseDAO.sqlsession.selectOne("queryById", id);
	}
	//修改！数据
	public void update(ClassInfo classInfo){
		
		BaseDAO.sqlsession.update("update",classInfo);
		BaseDAO.sqlsession.commit();
	}
	//删除
	public  void delete(Integer id ){
		
		BaseDAO.sqlsession.delete("delete", id);
		BaseDAO.sqlsession.commit();
	}
	//增加
	public  void add(ClassInfo classInfo){
		
		BaseDAO.sqlsession.insert("add", classInfo);
		BaseDAO.sqlsession.commit();
	}
	
}

