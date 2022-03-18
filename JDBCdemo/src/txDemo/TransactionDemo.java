package txDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {

		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String user = "123";
		String pwd = "123456";
		String sql = "INSERT INTO [dbo].[Shippers]"
				+ "           ([CompanyName],[Phone])"
				+ "     VALUES (?,?)";
		Connection conn = null;
		try  {
			conn = DriverManager.getConnection(url, user, pwd);
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "AA3A");
			pstmt.setInt(2, 345678);
			pstmt.executeUpdate();
			pstmt.setString(1, "AAAAAAAAAAAAAAAAAAAAAAAA");
			pstmt.setString(2, "巨槌瑞斯");
			pstmt.executeUpdate();
			conn.commit();
			System.out.println("OK");
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("Rollback");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		}finally {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
