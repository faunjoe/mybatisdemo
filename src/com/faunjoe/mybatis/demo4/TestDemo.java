package com.faunjoe.mybatis.demo4;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.faunjoe.mybatis.bean.Classes;
import com.faunjoe.mybatis.util.MybatisUtils;

public class TestDemo {
	
	@Test
	public void testGetClass() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo4.ClassMapper.getClass";
		
		Classes classes = session.selectOne(statement, 1);
		
		session.close();
		System.out.println(classes);
	}
	
	@Test
	public void testGetClass2() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo4.ClassMapper.getClass2";
		
		Classes classes = session.selectOne(statement, 1);
		
		session.close();
		System.out.println(classes);
	}
}
