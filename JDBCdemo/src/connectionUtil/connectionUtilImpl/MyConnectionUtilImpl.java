package connectionUtil.connectionUtilImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.MyConnectionUtil;

public class MyConnectionUtilImpl implements MyConnectionUtil{
	
	private String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
	private String userName="123";
	private String password="123456";
	
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn= DriverManager.getConnection(url, userName, password);
		return conn;
	}

	@Override
	public void free(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
		if(rs!=null)  if(!rs.isClosed()) rs.close();
		if(stmt!=null) if(!stmt.isClosed()) stmt.close();	
		if(conn!=null) if(!conn.isClosed()) conn.close();
	}
}



