package com.spring.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.models.Employee;


@Service
public class EmployeeService {
	 private List<Employee>employees=Arrays.asList(
    		 new Employee("Vikas",312,1000000),
    		 new Employee("Virat",18,1000000),
    		 new Employee("Sachin",10,100000)
    		 );
     
     public List<Employee> getAllEmployees(){
    	
    	 return employees;
     }
}
