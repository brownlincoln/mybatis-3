package com.chris.intro;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MyBatisDemo{
	
	@Test
	public void testUse()  throws IOException{
		InputStream inputStream = Resources
				.getResourceAsStream("com/chris/intro/mybatis-config-chris.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		try {
			User user = null;
			Map map = session.selectOne("com.chris.intro.UserMapper.selectUser", 1);
			System.out.println(map);
			System.out.println(user);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testUserWithResultMap()  throws IOException{
		InputStream inputStream = Resources
				.getResourceAsStream("com/chris/intro/mybatis-config-chris.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		try {
			List<User> users = session.selectList("com.chris.intro.UserMapper.selectUserList", 2);
			System.out.println(users);
		} finally {
			session.close();
		}
	}
}
