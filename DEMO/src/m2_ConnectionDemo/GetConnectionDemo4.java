package m2_ConnectionDemo;

import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GetConnectionDemo4 {

	// 不加 static 的話, 可以拉到 main 方法裡面
	
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		String userName = "thermos";
		String password = "12345678";
		
		String customerTypeID = JOptionPane.showInputDialog("CustomerTypeID");
		String customerDesc = JOptionPane.showInputDialog("customerDesc");
		
		// String selectProducts="SELECT * FROM Products";
		String insertCC="INSERT INTO [dbo].[CustomerDemographics]"
						+ "([CustomerTypeID],[CustomerDesc])"
						+ "VALUES('"+customerTypeID+"','"+customerDesc+"')";	// 目標陳述句
		// 把以下放到 scanner 會刪除整個資料庫 
			// (SQL injection SQL 注入)
			// CC','DD');DELETE CustomerDemographics;--
		
		try (Connection conn = DriverManager.getConnection(url, userName, password)){  // 3 建立起一個連線, 用 conn 連線物件
			
			System.out.println(insertCC);
			Statement stmt = conn.createStatement();  
			
			boolean count = stmt.execute(insertCC);
			// true 有結果集 rs
			// false 沒有結果集
			
			// int count = stmt.executeUpdate(insertCC);
			// count 單一語句新增的筆數
			
			System.out.println("新增了"+count+"筆");
			
			System.out.println("連線成功");

		} catch (SQLException e) {
 
			e.printStackTrace();
		} 

	}

}
