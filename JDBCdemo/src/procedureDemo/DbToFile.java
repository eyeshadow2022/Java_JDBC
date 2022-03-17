package procedureDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbToFile{

	public static void main(String[] args) {
		 String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		 String user="123";
		 String pwd="123456";
		 String sql="SELECT [imgname],[imgFile]"
		 		+ "  FROM imageTable where imgname=?";
		
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd)){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "C:\\pink.gif");
			ResultSet rs = pstmt.executeQuery();
			FileOutputStream fos = new FileOutputStream("C:\\img\\pink2.gif");
			while(rs.next()) {
				InputStream binaryStream = rs.getBinaryStream(2);
				int data=0;
				while((data=binaryStream.read())!=-1) {
					fos.write(data);
					}
				}
				fos.close();
				System.out.println("ok");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
