package org.learn.basic.controller;

import java.util.List;

import org.learn.mybatis.dao.EmployeeDao;
import org.learn.mybatis.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello(ModelAndView mv)
	{
		mv.addObject("msg","this message from Controller");
		return "test";
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String UserList(ModelMap map)
	{
		List<Employee> lis=dao.getAllEmployee();
		for(Employee tmp:lis)
		{
			System.out.println(tmp);
		}
		map.addAttribute("msg","this message from Hello");
		map.addAttribute("coms",lis);
		return "list";
	}
}
