package edu.jsp.springcoreannotation.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Mobile {
	@Autowired
	private Sim sim;
	
	public void doCall() {
		System.out.println("Calling From Mobile");
		sim.connected();
	}
	

}
