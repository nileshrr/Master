package edu.jsp.springcoreannotation.dto;

import org.springframework.stereotype.Component;

@Component
public class Bird {
	public void fly() {
		System.out.println("bird is flying!!!");
	}

}
