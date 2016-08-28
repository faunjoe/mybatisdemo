package com.faunjoe.mybatis.demo1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.faunjoe.mybatis.bean.User;
import com.faunjoe.mybatis.util.MybatisUtils;

public class TestDemo {
	@Test
	public void testAdd() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession();
		
		String statement = "com.faunjoe.mybatis.demo1.userMapper.addUser";
		int insert = session.insert(statement , new User(-1, "KK", 23));
		//提交
		session.commit();
		
		session.close();
		
		System.out.println(insert);
	}
	
	@Test
	public void testUpate() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo1.userMapper.updateUser";
		
		int update = session.update(statement, new User(4, "KK444", 25));
		
		session.close();
		System.out.println(update);
	}
	
	@Test
	public void testDelete() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo1.userMapper.deleteUser";
		
		int delete = session.delete(statement, 4);
		
		session.close();
		System.out.println(delete);
	}
	
	@Test
	public void testGetUser() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo1.userMapper.getUser";
		
		User user = session.selectOne(statement, 1);
		
		session.close();
		System.out.println(user);
	}
	
	@Test
	public void testGetAll() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo1.userMapper.getAllUsers";
		
		List<User> list = session.selectList(statement);
		
		session.close();
		System.out.println(list);
	}
}
