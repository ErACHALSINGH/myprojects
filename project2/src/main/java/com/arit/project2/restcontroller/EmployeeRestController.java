package com.arit.project2.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arit.project2.dao.EmployeeDAO;
import com.arit.project2.entity.Employee;

@RestController
@RequestMapping("/rest")
public class EmployeeRestController {
	
	private EmployeeDAO empDao;
	
	@Autowired
	public EmployeeRestController(EmployeeDAO emDao) {
		this.empDao = emDao;
	}
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return empDao.findAll();
	}

}
