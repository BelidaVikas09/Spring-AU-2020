package com.spring.demo;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.config.Appconfig;
import com.spring.models.Dept;
//import com.spring.services.EmployeeService;
import com.spring.models.Employee;
import com.spring.models.Point;
import com.spring.services.*;
@ComponentScan(basePackages="com.spring.models")
public class Main {
   public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
        System.out.println("------------------------------1.GET ALL EMPLOYEES USING SERVICES--------------------------------------");
		EmployeeService empser=context.getBean(EmployeeService.class);
		List<Employee>emp=empser.getAllEmployees();
		System.out.println(emp);
		System.out.println("------------------------------2.MAP USING CONSTRUCTOR DI--------------------------------------");
    	Dept dep = (Dept)context.getBean(Dept.class);
        dep.display();
		System.out.println("------------------------------3.POINT CLASS INJECTION USING PROPERTY FILE--------------------------------------");
ApplicationContext pointContext = new AnnotationConfigApplicationContext(Appconfig.class);
    	
    	Point p=(Point) pointContext.getBean("point");
        System.out.println(p.getX()+"  "+p.getY());
   }
}
