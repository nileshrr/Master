package edu.jsp.springcoreannotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.springcoreannotation.dto.Person;

public class TestD {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Person person =(Person)applicationContext.getBean("myPerson");
		person.display();

	}

}
