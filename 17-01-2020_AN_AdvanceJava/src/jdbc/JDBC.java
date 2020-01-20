package jdbc;
import java.util.ArrayList;
import java.sql.*;
public class JDBC {
	public static void main(String args[]){
		ArrayList<EmployeeDept>arr=new ArrayList<>();
		try{  
		Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/employee";
                String user="root";
                String password="viaks@1262";  
		Connection con=DriverManager.getConnection(url,user,password);  
		String query="{CALL join_procedure()}";
		CallableStatement stmt=con.prepareCall(query);  
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()) {
			EmployeeDept ed=new EmployeeDepartment(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getString("Designation"),rs.getString("salary"),rs.getInt("dep_id"),rs.getString("dep_name"));
			arr.add(ed);
		} 
		for(EmployeeDept e:arr) {
			System.out.println(e);
		}
		con.close();  
		}catch(Exception e){ System.out.println(e.toString());}  
		}
}
