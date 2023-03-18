package edu.jsp.springcoreannotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value ="myPerson")
public class Person {
	private String name;
	private int age;
	
	
	
	public Person(@Value (value = "Poonam p") String name,@Value (value = "30")int  age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Person Name = "+name);
		System.out.println("Person Age = "+age);
	}

}
