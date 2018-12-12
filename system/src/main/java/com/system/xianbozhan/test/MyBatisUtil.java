package com.system.xianbozhan.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	public static SqlSessionFactory getSqlSessionFactory() {
		//获得环境配置文件流
		InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream("mybatis.xml");
		//创建sqlsessionFactory工厂
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
		System.out.println(sf);
		return sf;
	}
	
	public static SqlSession getSession() {
		return getSqlSessionFactory().openSession(true);
	}
	
	public static SqlSession getSqlSession(boolean autoCommit) {
		return getSqlSessionFactory().openSession(autoCommit);
	}

}
