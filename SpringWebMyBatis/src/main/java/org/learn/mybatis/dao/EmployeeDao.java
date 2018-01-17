package org.learn.mybatis.dao;

import java.util.List;

import org.learn.mybatis.entity.Employee;

@MyBatisRepository
public interface EmployeeDao {

	public List<Employee> getAllEmployee();
	public List<Employee>  getEmployeeByPage(int start,int end);
	public int selectCount();
}
