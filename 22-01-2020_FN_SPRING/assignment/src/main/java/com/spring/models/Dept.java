package com.spring.models;
import java.util.HashMap;
import java.util.Map;

public class Dept {
   private int dept_id;
   private String dept_name;
   private HashMap<Integer,Employee>emp_dept;
   
public Dept(int dept_id, String dept_name, HashMap<Integer, Employee> emp_dept) {
	super();
	this.dept_id = dept_id;
	this.dept_name = dept_name;
	this.emp_dept = emp_dept;
}
public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public void display() {
	for(Map.Entry me: emp_dept.entrySet()) {
		System.out.println(me.getKey() + "   "+ me.getValue());
	}
}
   
}