package com.amdocs.training.MyFirstSpringCurdApplication.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestDbConnection {
	
	String connectionUrl="jdbc:mysql://localhost:3306/employeeTable";
	String jdbcDriver ="com.mysql.cj.jdbc.Driver";
	String userName="root";
	String passWord="Nit@5720";
	
	@GetMapping("/testdb")
	public String testdb() {
		try {
			Class.forName(jdbcDriver);
			Connection con=DriverManager.getConnection(connectionUrl, userName, passWord);
			return "Connected Succefully";
			
	   }catch(Exception e) {
		   e.printStackTrace();
		   return "Uable to connected database";
	   }
	}

}
