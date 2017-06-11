package com.chris.limit;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class MyBatisDemo{
	//private static final Logger logger = LogManager.getLogger("MyBatisDemo");
	@Test
	public void testCustomer()  throws IOException{
		InputStream inputStream = Resources
				.getResourceAsStream("com/chris/limit/mybatis-config-tpcc.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		try {
			List<Customer> customers = session.selectList("com.chris.limit.CustomerMapper.selectUserById", 20);
			System.out.println(customers);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testCustomerLimit()  throws IOException{
		InputStream inputStream = Resources
				.getResourceAsStream("com/chris/limit/mybatis-config-tpcc.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		RowBounds rowBounds = new RowBounds(100, 10);
		try {
			//logger.info("query info about customer");
			List<Customer> customers = session.selectList("com.chris.limit.CustomerMapper.selectUsersDiscount", 0.3, rowBounds);
			for(Customer c: customers) {
				System.out.println(c);
			}
		} finally {
			session.close();
		}
	}
}
