package com.faunjoe.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.faunjoe.mybatis.demo.Test;

public class MybatisUtils {
	public static SqlSessionFactory getFactory() {
		String resource = "conf.xml";
		InputStream is = Test.class.getClassLoader().getResourceAsStream(
				resource);

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		return factory;
	}
}
