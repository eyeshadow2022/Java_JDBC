package procedureDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class callProcDemo2 {

	public static void main(String[] args) {
		 String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		 String user="123";
		 String pwd="123456";
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd)){
			CallableStatement pcall = conn.prepareCall("{call CustOrdersOrders2(?,?)}");//?=>nchar(5)
			pcall.setString(1,"ALFKI");
			pcall.registerOutParameter(2, java.sql.Types.TIMESTAMP);
			pcall.execute();
			System.out.println(pcall.getTimestamp(2)); 
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
