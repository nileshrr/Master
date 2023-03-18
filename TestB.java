package edu.jsp.springcoreannotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.springcoreannotation.dto.Bird;

public class TestB {

	public static void main(String[] args) {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
      Bird bird = (Bird)applicationContext.getBean("bird");
      bird.fly();
      
	}

}
