package com.wp.employeeapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.wp.employeeapp.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	// Load configuration from the persistence.xml file
    	
    	// Create EntityManagerFactory
    	
    	EntityManagerFactory eFactory = Persistence.createEntityManagerFactory("employee-persistence");
    	
    	// Create EntityManager
    	
    	EntityManager em = eFactory.createEntityManager();
    	
    	// Create EntityTransaction
    	
    	EntityTransaction trx = em.getTransaction();
    	
    	
    	// Insert a new Employee
    	
//    	Employee emp1 = new Employee(0,"Rohit Dutta","rohit@yahoo.com",46400);
//    	Employee emp2 = new Employee(0,"Harsh Kumar","harsh@yahoo.com",61200);
//    	trx.begin();
//    	em.persist(emp1);
//    	em.persist(emp2);
//    	trx.commit();;
    	
    	
    	// Fetch an Employee
    	
//    	Employee employee = em.find(Employee.class, 5);
//    	System.out.println(employee);
    	
    	
    	// Delete an Employee
    	
//    	Employee employee = em.find(Employee.class, 5);
//    	
//    	trx.begin();
//    	
//    	em.remove(employee);
//    	
//    	trx.commit();
    	
    	
    	// Fetching all the records
    	
//    	TypedQuery<Employee> findAllQuery = em.createQuery("from Employee",Employee.class);
//    	List<Employee> employees = findAllQuery.getResultList();
//    	
//    	employees.forEach(e->System.out.println(e));
    	
    	// Fetching employee using email
    	
//    	TypedQuery<Employee> findByEmailQuery = em.createQuery("from Employee where email=:email",Employee.class);
//    	findByEmailQuery.setParameter("email","harsh@yahoo.com");
//    	Employee emp = findByEmailQuery.getSingleResult();
//    	
//    	System.out.println(emp);
    	
    	// Update an Employee
    	
//    	trx.begin();
//    	TypedQuery<Employee> findByEmailQuery = em.createQuery("from Employee where email=:email",Employee.class);
//    	findByEmailQuery.setParameter("email","harsh@yahoo.com");
//    	Employee emp = findByEmailQuery.getSingleResult();
//    	// Increasing the salary by 10000
//    	emp.setSalary(emp.getSalary()+10000);
//    	trx.commit();
    	
    	
    	
    }
}
