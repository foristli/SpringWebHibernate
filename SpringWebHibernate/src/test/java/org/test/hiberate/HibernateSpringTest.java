package org.test.hiberate;

import org.junit.runner.RunWith;
import org.learn.hibernate.dao.GroupHibernateDao;
import org.learn.hibernate.entity.Employee;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/SpringHibernate.xml"})
public class HibernateSpringTest {
	
	@Autowired
    private GroupHibernateDao groupHibernateDao;
	
	@Ignore
    public void testAdd() {
        Employee group = new Employee();
        group.setName("amity");
        group.setSalary(3000);
        group.setAge(34);
        groupHibernateDao.groupAdd(group);

    }
	
	@Test
	public void testSelect()
	{
		Employee group=groupHibernateDao.groupSelect(2);
		System.out.println(group);
	}
	
	@Test
	public void testgetAll()
	{
		List<Employee> lst=groupHibernateDao.getAllEmployee();
		for(Employee one:lst)
		{
			System.out.println(lst.toString());
		}
	}

}
