package jcg.dao;

import jcg.bean.TbUser;

public class TbUserDAOImpl {
	/**
	 * 
	 * @param tbUser ��ǰ����
	 * @return  һ��int���͵� ����1�ɹ�  ����0 ʧ�ܣ�
	 */
	public TbUser login(TbUser tbUser) {

		return BaseDAO.sqlsession.selectOne("login", tbUser);

	}
}

