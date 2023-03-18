package edu.jsp.springcoreannotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.springcoreannotation.dto.Cow;

public class TestA {

	public static void main(String[] args) {
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		  Cow cow = (Cow)applicationContext.getBean("cow");//downcasting 
		  cow.print();

	}

}
