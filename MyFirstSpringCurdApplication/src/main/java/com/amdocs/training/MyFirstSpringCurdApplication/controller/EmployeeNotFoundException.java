package com.amdocs.training.MyFirstSpringCurdApplication.controller;

public class EmployeeNotFoundException extends RuntimeException {
	
	  public EmployeeNotFoundException() {
		  
	  }
	  
	  public EmployeeNotFoundException(String err) {
			super(err);
	   }
		  
	  

}
