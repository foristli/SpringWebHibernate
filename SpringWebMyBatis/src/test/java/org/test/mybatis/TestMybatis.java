package org.test.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.learn.mybatis.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:SpringMybatis.xml" }) 
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMybatis extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private EmployeeDao userDao;
	
	
	@Test
	public void test1()
	{
		int num=userDao.selectCount();
		System.out.println(num);
		System.out.println(userDao.getAllEmployee().size());
		System.out.println(userDao.getEmployeeByPage(2, 4).size());
	}

}
