package com.wp.collectionframework;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class SetBasics {

	public static void main(String[] args) {
		
//		Set<Integer> items = new HashSet<>();
//		
//		items.add(10);
//		items.add(26);
//		items.add(15);
//		items.add(17);
//		items.add(25);
//		items.add(10);
//		
//		System.out.println(items);
		
		Comparator<Employee> sortByName = (emp1, emp2)-> 
											emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
	
		
		Set<Employee> employees = new TreeSet<>((emp1, emp2)-> 
		emp1.getEmployeeName().compareTo(emp2.getEmployeeName()));
		
		Employee e1 = new Employee(1001,"Yash",LocalDate.of(2020, 10, 15),54000);
		Employee e2 = new Employee(1002,"Harsh",LocalDate.of(2021, 11, 10),47700);
		Employee e3 = new Employee(1003,"Priyanka",LocalDate.of(2019, 2, 3),74000);
		Employee e4 = new Employee(1001,"Yash",LocalDate.of(2020, 10, 15),54000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e1);
		employees.add(e1);
		employees.add(e1);
		employees.add(e1);
		employees.add(e1);
		
		// Find employee with an ID 1003
		
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(e1.getEmployeeId(), e1);
		employeeMap.put(e2.getEmployeeId(), e2);
		employeeMap.put(e3.getEmployeeId(), e3);
		
		
		int id = 1002;
		Employee employee = employeeMap.get(id);
		
//		for(Employee emp:employees) {
//			if(emp.getEmployeeId()==id) {
//				employee = emp;
//				break;
//			}
//		}
		System.out.println(employee);
		
	}
	
	
}
