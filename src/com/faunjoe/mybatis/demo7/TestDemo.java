package com.faunjoe.mybatis.demo7;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.faunjoe.mybatis.util.MybatisUtils;

public class TestDemo {
	@Test
	public void testGetUser() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.faunjoe.mybatis.demo7.userMapper.getUserCount";
		
		Map<String, Integer> parameterMap = new HashMap<String, Integer>();
		parameterMap.put("sexid", 1);
		parameterMap.put("usercount", -1);
		
		
		session.selectOne(statement, parameterMap);
		
		Integer result = parameterMap.get("usercount");
		System.out.println(result);
		
		session.close();
	}
}
