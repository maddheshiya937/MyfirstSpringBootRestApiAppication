package com.amdocs.training.MyFirstSpringCurdApplication.controller;

public class EmployeeErrorResponse {
    private int status;
    private String message;
    private long timeStammp;
	  
      
    public EmployeeErrorResponse() {
		
		// TODO Auto-generated constructor stub
	}


	public EmployeeErrorResponse(int status, String message, long l) {
		//super();
		this.status = status;
		this.message = message;
		this.timeStammp = l;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "EmployeeErrorResponse [status=" + status + ", message=" + message + ", timeStammp=" + timeStammp + "]";
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public long getTimeStammp() {
		return timeStammp;
	}


	public void setTimeStammp(int timeStammp) {
		this.timeStammp = timeStammp;
	}
	  
	   
	   
      
      
}
