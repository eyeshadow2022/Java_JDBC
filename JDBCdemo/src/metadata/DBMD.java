package metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMD {

	public static void main(String[] args) {
		
		
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String user="123";
		String pwd="123456";
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd)){
			DatabaseMetaData dbmd=conn.getMetaData();
			StringBuilder sb=new StringBuilder();
			sb.append("資料庫名稱："+dbmd.getDatabaseProductName());
			sb.append("\n資料庫版本："+dbmd.getDatabaseProductVersion());
			sb.append("\n驅動程式名稱"+dbmd.getDriverName());
			sb.append("\n驅動版本："+dbmd.getDriverVersion());
			sb.append("\nDBMS的URL："+dbmd.getURL());
			sb.append("\n使用者名稱："+dbmd.getUserName());
			System.out.println(sb.toString());
						
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
