package m2_ConnectionDemo;

import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GetConnectionDemo5 {

	// 不加 static 的話, 可以拉到 main 方法裡面
	
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		String userName = "thermos";
		String password = "12345678";
		
		String selectProducts = "SELECT [EmployeeID]\r\n"
				+ "      ,[LastName]\r\n"
				+ "      ,[FirstName]\r\n"
				+ "      ,[Title]\r\n"
				+ "      ,[BirthDate]\r\n"
				+ "      ,[HireDate]\r\n"
				+ "      ,[Address]\r\n"
				+ "      ,[City]\r\n"
				+ "      ,[Country]\r\n"
				+ "      ,[HomePhone]\r\n"
				+ "  FROM [Northwind].[dbo].[Employees]";
		
		try (Connection conn = DriverManager.getConnection(url, userName, password)){  
			// 3 建立起一個連線, 用 conn 連線物件
			
			// System.out.println(insertCC);
			Statement stmt = conn.createStatement();   // 編寫 
			
			boolean count = stmt.execute(selectProducts);  // 提供 executeQuery 方法
			ResultSet rs = stmt.getResultSet(); // 取得結果集
			while(rs.next()) {
				System.out.println(rs.getString("EmployeeID"));
				System.out.println(rs.getString("LastName"));
				System.out.println(rs.getString("FirstName"));
				System.out.println(rs.getString("Title"));
				System.out.println(rs.getString("BirthDate"));
				System.out.println(rs.getString("HireDate"));
				System.out.println(rs.getString("Address"));
				System.out.println(rs.getString("City"));
				System.out.println(rs.getString("Country"));
				System.out.println(rs.getString("HomePhone"));
			}
			
			System.out.println("新增了"+count+"筆");
			
			System.out.println("連線成功");

		} catch (SQLException e) {
 
			e.printStackTrace();
		} 

	}

}
