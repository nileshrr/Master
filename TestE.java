package edu.jsp.springcoreannotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.springcoreannotation.dto.Car;

public class TestE {

	public static void main(String[] args) {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
Car car =(Car) applicationContext.getBean("car");
car.diplay();
	
	}

}
