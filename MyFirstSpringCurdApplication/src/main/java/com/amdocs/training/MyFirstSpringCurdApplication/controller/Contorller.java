package com.amdocs.training.MyFirstSpringCurdApplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.training.MyFirstSpringCurdApplication.entity.Employee;
import com.amdocs.training.MyFirstSpringCurdApplication.services.EmployeeServices;

@RestController
@RequestMapping("/api")
public class Contorller {
	
	private EmployeeServices employeeServices;
	
	//contruction injection.
	public  Contorller (EmployeeServices employeeServices) //we will get through by spring ioc.
	{
		this.employeeServices = employeeServices;
	}
	
	
	
	
	@GetMapping("/employee")
    public List<Employee>findAll() {
    	return employeeServices.findAll();
    }
	
	@GetMapping("/employee/{id}")
		public Employee findById(@PathVariable int id) {
		    Employee emp=employeeServices.findById(id);
	        
		    if(emp==null) {
		    	throw new EmployeeNotFoundException("Employee id"+ id +"Not Found!!!");
		    }
		    
		    return emp;
	}
	
	@PostMapping("/employee")
	public Employee insertEmployee(@RequestBody Employee employee) {
		Employee emp=employeeServices.insertEmployee(employee);
		return emp;
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee emp=employeeServices.updateEmployee(employee);
		return emp;
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteById(@PathVariable int id) {
		employeeServices.deleteById(id);
		   
	}
	
}



