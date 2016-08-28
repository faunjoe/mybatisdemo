package com.faunjoe.mybatis.demo3;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.faunjoe.mybatis.bean.Order;
import com.faunjoe.mybatis.util.MybatisUtils;

public class TestDemo {
	@Test
	public void testGetOrder() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo3.orderMapper.getOrder";
		
		Order order = session.selectOne(statement, 1);
		
		session.close();
		System.out.println(order);
	}
	
	@Test
	public void testGetOrder2() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo3.orderMapper.getOrder2";
		
		Order order = session.selectOne(statement, 2);
		
		session.close();
		System.out.println(order);
	}
}
