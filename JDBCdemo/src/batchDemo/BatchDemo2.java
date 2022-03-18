package batchDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo2 {

	public static void main(String[] args) {
		
		
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String user="123";
		String pwd="123456";
		String sql="INSERT INTO [dbo].[Shippers]"
				+ "   ([CompanyName],[Phone])"
				+ "   VALUES (?,?)";
		
//			stmt.addBatch("INSERT INTO [dbo].[Shippers]"
//					+ "   ([CompanyName],[Phone])"
//					+ "   VALUES ('ABC',0946825137)");			
//			stmt.addBatch("INSERT INTO [dbo].[Shippers]"
//					+ "   ([CompanyName],[Phone])"
//					+ "   VALUES ('DEF',0978541236)");			
//			stmt.addBatch("INSERT INTO [dbo].[Shippers]"
//					+ "   ([CompanyName],[Phone])"
//					+ "   VALUES ('GHI',0996523874)");
//			int[] executeBatch = stmt.executeBatch();
//			for (int i = 0; i < executeBatch.length; i++) {
//				System.out.println(executeBatch[i]);
//			}
		try(Connection conn = DriverManager.getConnection(url, user, pwd)){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1 , "公司名稱");
			pstmt.setString(2 , "0987987987");
			pstmt.addBatch();
			pstmt.setString(1 , "取名好難");
			pstmt.setString(2 , "0987987987");
			pstmt.addBatch();
			pstmt.setString(1 , "不知道叫什麼");
			pstmt.setString(2 , "0987987987");
			pstmt.addBatch();
			int[] executeBatch = pstmt.executeBatch();
			for (int i = 0; i < executeBatch.length ; i++) {
				int j = executeBatch[i];
				System.out.println(j);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		} 
		
		
	}

}
