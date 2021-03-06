package procedureDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class callProcDemo {

	public static void main(String[] args) {
		 String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		 String user="123";
		 String pwd="123456";
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd)){
			CallableStatement pcall = conn.prepareCall("{call CustOrdersOrders(?)}");//?=>nchar(5)
			pcall.setString(1,"ALFKI");
			pcall.registerOutParameter(2, java.sql.Types.TIMESTAMP);
			boolean haveRs = pcall.execute();
			ResultSet rs = pcall.getResultSet();
			while(rs.next()) {
				System.out.print("OrderID"+rs.getString(1)+"\t");
				System.out.print("OrderDate"+rs.getString(2)+"\t");
				System.out.print("RequiredDate"+rs.getString(3)+"\t");
				System.out.println("ShippedDate"+rs.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
