package edu.jsp.springcoreannotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.springcoreannotation.dto.Employee;

public class Testc {

	public static void main(String[] args) {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
Employee employee = (Employee) applicationContext.getBean("emp");
employee.display(); 
	}

}
