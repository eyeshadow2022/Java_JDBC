package M2_ConnectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GetConnectionDemo4 {
	
	public static void main(String[] args) {
		String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		String userName="123";
		String password="123456";
		
		String customerTypeID = JOptionPane.showInputDialog("CustomerTypeID");
		String customerDesc = JOptionPane.showInputDialog("CustomerDesc");
		
//		String selectProducts =  [EmployeeID]
//			      ,[LastName]
//			      ,[FirstName]
//			      ,[Title]
//			      ,[BirthDate]
//			      ,[HireDate]
//			      ,[Address]
//			      ,[City]
//			      ,[Country]
//			      ,[HomePhone]
		
		String insertCC="INSERT INTO [dbo].[CustomerDemographics]"
				+ "([CustomerTypeID] ,[CustomerDesc])"
				+ "VALUES ('"+customerTypeID+"','"+customerTypeID+"')";
		
		try (Connection conn =  DriverManager.getConnection(url, userName, password)){
			
//			System.out.println(insertCC);
			Statement stmt = conn.createStatement();
			
//			boolean count = stmt.execute(selectProducts);
//			ResultSet rs = stmt.getResultSet();
//			while(rs.next()) {
//				System.out.println(rs.getString("EmployeeID"));
//				System.out.println(rs.getString("LastName"));
//				System.out.println(rs.getString("FirstName"));
//				System.out.println(rs.getString("Title"));
//				System.out.println(rs.getString("BirthDate"));
//				System.out.println(rs.getString("HireDate"));
//				System.out.println(rs.getString("Address"));
//				System.out.println(rs.getString("City"));
//				System.out.println(rs.getString("Country"));
//				System.out.println(rs.getString("HomePhone"));
//			}
			//true => 有結果集rs
			//false => 沒有結果集
			
//			System.out.println("新增了"+count+"筆");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
		} 
	}


