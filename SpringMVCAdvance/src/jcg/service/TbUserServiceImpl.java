package jcg.service;

import jcg.bean.TbUser;
import jcg.dao.TbUserDAOImpl;

public class TbUserServiceImpl {
	private TbUserDAOImpl tbUserDAOImpl;

	public TbUserDAOImpl getTbUserDAOImpl() {
		return tbUserDAOImpl;
	}

	public void setTbUserDAOImpl(TbUserDAOImpl tbUserDAOImpl) {
		this.tbUserDAOImpl = tbUserDAOImpl;
	}
	
	public  TbUser login(TbUser tbUser){
		
		
		return tbUserDAOImpl.login(tbUser);
	}
	
}
