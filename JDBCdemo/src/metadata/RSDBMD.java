package metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RSDBMD {

	public static void main(String[] args) {
		
		
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String user="123";
		String pwd="123456";
		String sql="SELECT [CustomerID]\r\n"
				+ "      ,[CompanyName]\r\n"
				+ "      ,[ContactName]\r\n"
				+ "      ,[ContactTitle]\r\n"
				+ "      ,[Address]\r\n"
				+ "      ,[City]\r\n"
				+ "      ,[Region]\r\n"
				+ "      ,[PostalCode]\r\n"
				+ "      ,[Country]\r\n"
				+ "      ,[Phone]\r\n"
				+ "      ,[Fax] FROM [Northwind].[dbo].[Customers]";
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd)){
			PreparedStatement stmt=conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
					
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnCount());
			while(rs.next()) {
				for (int i = 1; i<= metaData.getColumnCount();i++) {
					System.out.println(metaData.getColumnName(i)+":"+rs.getString(i));
					System.out.println(metaData.getColumnLabel(i)+":"+metaData.getColumnTypeName(i));
					System.out.println(metaData.getColumnDisplaySize(i));
					System.out.println(metaData.isNullable(i));
				}
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		
	}

}
