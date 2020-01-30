package com.mockito.dbtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DbConnection {
 
  private Connection dbConnection;
 
  public void getDBConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "vikas@1262");
  }
 
  public int executeQuery(String query) throws ClassNotFoundException, SQLException {
    return dbConnection.createStatement().executeUpdate(query);
  }
}