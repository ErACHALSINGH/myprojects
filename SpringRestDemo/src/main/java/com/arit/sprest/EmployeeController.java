package com.arit.sprest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	Employee g1 = new Employee(101, "Pradeep Beniwal", "Admin");
	Employee g2 = new Employee(102, "Beniwal", "Manager");
	Employee g3 = new Employee(103, "Pradeep", "Dev");
	
	ArrayList<Employee> gr = new ArrayList<Employee>();

	@RequestMapping("/emps")
	public ArrayList<Employee> greeting() {
		gr.add(g1);
		gr.add(g2);
		gr.add(g3);
		return gr;
	}
	
	@GetMapping("/emps/{id}")
	public Employee handler(@PathVariable long id) {
		gr.add(g1);
		gr.add(g2);
		gr.add(g3);
		
		for(Employee e: gr) {
			if(e.getId() == id)
				return e;
		}
		
		return null;
	}
}
