package M2_ConnectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnectionDemo {
	
	public static void main(String[] args) {
		String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		String userName="123";
		String password="123456";
		Connection conn=null;
		
		try {
			conn =  DriverManager.getConnection(url, userName, password);
			System.out.println("連線成功");
		//	Thread.sleep(10000);
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn != null ) {
					if(!conn.isClosed()) {
						conn.close();
						System.out.println("資源已釋放");
						}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
