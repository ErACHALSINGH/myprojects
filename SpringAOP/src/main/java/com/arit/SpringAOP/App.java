package com.arit.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arit.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ct = new ClassPathXmlApplicationContext("springaop.xml");
    	EmployeeService esrv = ct.getBean("empService",EmployeeService.class);
		/*
		 * System.out.println(esrv.getTrainee().getName());
		 * System.out.println(esrv.getTrainer().getName());
		 */
    	
		/* esrv.getTrainee().setName("test"); */
    	esrv.getTrainee().getName();
  
    }
}
