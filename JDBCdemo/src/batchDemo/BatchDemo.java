package batchDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) {
		
		
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String user="123";
		String pwd="123456";
		String sql="INSERT INTO [dbo].[Shippers]"
				+ "   ([CompanyName],[Phone])"
				+ "   VALUES (,)";
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd)){
			Statement stmt = conn.createStatement();
			stmt.addBatch("INSERT INTO [dbo].[Shippers]"
					+ "   ([CompanyName],[Phone])"
					+ "   VALUES ('ABC',0946825137)");			
			stmt.addBatch("INSERT INTO [dbo].[Shippers]"
					+ "   ([CompanyName],[Phone])"
					+ "   VALUES ('DEF',0978541236)");			
			stmt.addBatch("INSERT INTO [dbo].[Shippers]"
					+ "   ([CompanyName],[Phone])"
					+ "   VALUES ('GHI',0996523874)");
			int[] executeBatch = stmt.executeBatch();
			for (int i = 0; i < executeBatch.length; i++) {
				System.out.println(executeBatch[i]);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		} 
		
		
	}

}
