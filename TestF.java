package edu.jsp.springcoreannotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.springcoreannotation.dto.Mobile;

public class TestF {

	public static void main(String[] args) {
   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
   Mobile mobile = (Mobile) applicationContext.getBean("mobile");
    mobile.doCall();
	}

}
