

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Createdb {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password ="Sugu@A0021";
		try {
			Connection connect = DriverManager.getConnection(url, username, password);
			String sql="CREATE DATABASE JDBC";
			Statement stmt = connect.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Statement got executed");
			
		}
		catch(SQLException e){
			System.out.println("Program is Showing Error");
			e.printStackTrace();
		}

	}

}
