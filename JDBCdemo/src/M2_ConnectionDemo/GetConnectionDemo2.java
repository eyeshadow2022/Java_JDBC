package M2_ConnectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class GetConnectionDemo2 {
	
	public static void main(String[] args) {
		String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		String userName="123";
		String password="123456";
				
	
		
		try (Connection conn =  DriverManager.getConnection(url, userName, password);
				Scanner sc=new Scanner(System.in)){
			System.out.println("連線成功");
	
		} catch(SQLException e) {
			e.printStackTrace();
		} 
	}

}
