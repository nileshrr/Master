package edu.jsp.springcoreannotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component (value="car")
public class Car {
private String brand;
private String model;
private double prise;


@Value (value="TaTa")
public void setBrand(String brand) {
	this.brand = brand;
	
	
}
@Value (value="Nexon")
public void setModel(String model) {
	this.model = model;
}
@Value (value="1400000.00")
public void setPrise(double prise) {
	this.prise = prise;
}
public void diplay() {
	System.out.println("Car brand = "+brand);
	System.out.println("Car Model = "+model);
	System.out.println("Car Price  = "+prise);
}






}
