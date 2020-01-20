package jdbc;

public class EmployeeDept{
	private int emp_id,sal,dep_id;
	private String emp_name;;
	private String Designation;
	private String Department;
	
	EmployeeDept(int employee_id,String employee_name,String job_name,int salary,int department_id,String department){
		this.emp_id=employee_id;
		this.emp_name=employee_name;
		this.Designation=job_name;
		this.sal=salary;
		this.dep_id=department_id;
		this.Department=department;
	}
	void set_emp_id(int val) {
		this.emp_id=val;
	}
	int get_emp_id() {
		return this.emp_id;
	}
	void set_emp_name(String val) {
		this.emp_name=val;
	}
	String get_emp_name() {
		return this.emp_name;
	}
	void set_Designation(String val) {
		this.Designation=val;
	}
	String get_Designation() {
		return this.Designation;
	}
	void set_salary(int val) {
		this.sal=val;
	}
	int get_salary() {
		return this.sal;
	}
	void set_dep_id(int val) {
		this.dep_id=val;
	}
	int get_dep_id() {
		return this.dep_id;
	}
	void set_department(String val) {
		this.Department=val;
	}
	String get_department() {
		return this.Department;
	}
	
	@Override
	public String toString() {
		return "Employee id:"+this.emp_id+" Employee Name:"+this.emp_name+" Job Name:"+this.Designation+" Employee Salary:"+this.sal+" Department id:"+this.dep_id+" Department:"+this.Department;
	}
	
}
