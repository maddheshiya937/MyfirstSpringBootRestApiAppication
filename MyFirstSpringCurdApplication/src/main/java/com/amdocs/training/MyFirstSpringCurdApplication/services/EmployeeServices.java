package com.amdocs.training.MyFirstSpringCurdApplication.services;

import java.util.List;

import com.amdocs.training.MyFirstSpringCurdApplication.entity.Employee;

public interface EmployeeServices {
	public List<Employee> findAll();
    public Employee findById(int id);
	public Employee insertEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteById(int id);

}
