package edu.jsp.springcoreannotation.dto;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  (value="emp")
public class Employee {
	@Value (value="maheshvari")
	private String name;
	@Value (value="50000.00")
	private double salary;
	
	public void display() {
		System.out.println("Employee name = "+name);
		System.out.println("Employee salary = "+salary);
	}

}
