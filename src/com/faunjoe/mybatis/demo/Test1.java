package com.faunjoe.mybatis.demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.faunjoe.mybatis.bean.User;

public class Test1 {
	public static void main(String[] args) throws IOException {
		String resource = "conf.xml"; 
		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = factory.openSession();
		
		String statement = "com.faunjoe.mybatis.demo.userMapper"+".getUser";
		
		User user = session.selectOne(statement, 2);
		System.out.println(user);
	}
}
