package com.amdocs.training.MyFirstSpringCurdApplication.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amdocs.training.MyFirstSpringCurdApplication.dao.EmployeeDAO;
import com.amdocs.training.MyFirstSpringCurdApplication.entity.Employee;
@Service
public class EmployeeServiesImpl implements EmployeeServices{

	private EmployeeDAO employeeDAO;
	
	
	public  EmployeeServiesImpl (EmployeeDAO employeeDAO)
	{
		this.employeeDAO = employeeDAO;
	} 
	
	@Transactional
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Transactional
	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(id);
	}
    
	@Transactional
	@Override
	public Employee insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp=employeeDAO.insertEmployee(employee);
		return emp;
		
	}
    
	@Transactional
	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp=employeeDAO.updateEmployee(employee);
		return emp;
	}
	
	@Transactional
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeDAO.deleteById(id);
		
	}

}
