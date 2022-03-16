package M2_ConnectionDemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnectionDemo3 {
	
	public static void main(String[] args) {
		String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		String userName="123";
		String password="123456";
		
		String selectProducts="SELECT * FROM Products"; //目標陳述句

		
		try (Connection conn =  DriverManager.getConnection(url, userName, password)){
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(selectProducts);
			while(rs.next()) {
				for (int i = 1; i<=10; i++) {
					System.out.printf("%20s||",rs.getString(i));
				}
				System.out.println();
			}
			System.out.println("連線成功");
	
		} catch(SQLException e) {
			e.printStackTrace();
		}
		}
	} 
	


