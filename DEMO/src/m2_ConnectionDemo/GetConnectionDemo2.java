package m2_ConnectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnectionDemo2 {

	// 不加 static 的話, 可以拉到 main 方法裡面
	
	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		String userName="thermos";
		String password="12345678";
		
		try {
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.println("連線成功");
			Thread.sleep(1000);
			// conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
