package jcg.dao;

import jcg.bean.TbUser;

public class TbUserDAOImpl {
	/**
	 * 
	 * @param tbUser 当前对象！
	 * @return  一个int类型的 返回1成功  返回0 失败！
	 */
	public TbUser login(TbUser tbUser) {

		return BaseDAO.sqlsession.selectOne("login", tbUser);

	}
}

