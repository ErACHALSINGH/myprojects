package com.arit.project2.dao;

import java.util.List;
import com.arit.project2.entity.Employee;

public interface EmployeeDAO {

 public	List<Employee> findAll();
 public Employee findById(int eid);
 public void save(Employee emp);
 public void deleteById(int eid);
	
}
