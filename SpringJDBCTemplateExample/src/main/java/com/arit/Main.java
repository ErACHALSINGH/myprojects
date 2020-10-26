package com.arit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arit.model.Person;
import com.arit.spring.config.AppConfig;
import com.arit.spring.dao.PersonDAO;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDAO personDAO = context.getBean(PersonDAO.class);

		System.out.println("List of persons:");

		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}

//		System.out.println("\nGet person with ID 5");
//
//		Person personById = personDAO.getPersonById(5L);
//		System.out.println(personById);

//		System.out.println("\nCreating person: ");
//		Person person = new Person(27, "vikas", "pathak");
//		System.out.println(person);
//		personDAO.createPerson(person);
//		System.out.println("\nList of person is:");
//
//		for (Person p : personDAO.getAllPersons()) {
//			System.out.println(p);
//		}
//
//		System.out.println("\nDeleting person with ID 5");
//		personDAO.deletePerson(personById);
//
//		System.out.println("\nUpdate person with ID 4");
//
//		Person updatePerson = personDAO.getPersonById(4L);
//		updatePerson.setLastName("pathan");
//		personDAO.updatePerson(updatePerson);
//
//		System.out.println("\nList of person is:");
//		for (Person p : personDAO.getAllPersons()) {
//			System.out.println(p);
//		}

		context.close();
	}
}
