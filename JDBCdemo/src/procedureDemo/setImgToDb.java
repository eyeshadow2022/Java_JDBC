package procedureDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class setImgToDb{

	public static void main(String[] args) {
		 String url ="jdbc:sqlserver://localhost:1433;databaseName=Northwind";
		 String user="123";
		 String pwd="123456";
		 String sql="INSERT INTO [dbo].[imageTable]"
		 		+ "           ([imgname],[imgFile])"
		 		+ "     VALUES(?,?)";
		
		String imgName = "C:\\pink.gif";
		try(Connection conn = DriverManager.getConnection(url, user, pwd);
				FileInputStream fis = new FileInputStream(imgName)){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, imgName);
			pstmt.setBinaryStream(2, fis);
			int count = pstmt.executeUpdate();
			System.out.println(count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
