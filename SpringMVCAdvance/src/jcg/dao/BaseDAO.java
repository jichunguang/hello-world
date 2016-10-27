package jcg.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDAO {
	public static SqlSession sqlsession;
	
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream("jcg/xml/mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
			sqlsession=sqlSessionFactory.openSession();
			System.out.println("ok1111");
			System.out.println("ok1111");
			System.out.println("ok1111");
			System.out.println("ok1111");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
