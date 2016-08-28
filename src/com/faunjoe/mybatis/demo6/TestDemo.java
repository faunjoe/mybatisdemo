package com.faunjoe.mybatis.demo6;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.faunjoe.mybatis.bean.ConditionUser;
import com.faunjoe.mybatis.bean.User;
import com.faunjoe.mybatis.util.MybatisUtils;

public class TestDemo {
	@Test
	public void testGetUser() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo6.userMapper.getUser";
		
		String name = "o";
		name = null;
		
		ConditionUser parameter = new ConditionUser("%"+name+"%", 13, 18);
		List<User> list = session.selectList(statement, parameter);
		System.out.println(list);
		
		
		session.close();
	}
}
