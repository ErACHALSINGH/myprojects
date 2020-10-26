package com.arit.project2.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.arit.project2.entity.Employee;

@Repository
public class EmployeeDAOHBImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHBImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee",Employee.class);
		List<Employee> employees = query.getResultList();
		return employees;
	}


	@Override
	public Employee findById(int e_id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteById(int e_id) {
		// TODO Auto-generated method stub
		
	}

}
