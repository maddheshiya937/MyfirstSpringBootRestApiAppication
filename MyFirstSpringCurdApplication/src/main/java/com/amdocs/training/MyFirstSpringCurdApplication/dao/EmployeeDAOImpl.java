package com.amdocs.training.MyFirstSpringCurdApplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amdocs.training.MyFirstSpringCurdApplication.entity.Employee;

@Repository//->this tells to spring boot that this class will we use as dao class in this application.
public class EmployeeDAOImpl implements EmployeeDAO {
    
	private EntityManager entityManager;
	
	//controller injection --->this will create the link between database to doa funtion.
	public EmployeeDAOImpl(EntityManager theEntityManager) {
		
		this.entityManager=theEntityManager;
	}
	
	//@Transactional  //this annotation is required in every dao funtion
	@Override
	public List<Employee> findAll()
	{
	    // Getting the current session of Hibernate
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		//Query<Employee> theQuery = currentSession.createQuery("From Employee",Employee.class);
		
		Query<Employee> theQuery = currentSession.createQuery("From Employee",Employee.class);
		
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
		
	}
     
	//@Transactional
	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee= currentSession.get(Employee.class, id);
		return employee;
	}

	//@Transactional
	@Override
	public Employee insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);
		return employee;
	}

	//@Transactional
	@Override
	public Employee updateEmployee(Employee employee ) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);
		return employee;
		//return null;
	}
	
	//@Transactional
	public void deleteById(int id)
	{
	    // Getting the current session of Hibernate
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> theQuery = currentSession.createQuery("delete From Employee where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		
	}

}
