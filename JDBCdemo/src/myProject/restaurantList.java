package myProject;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class restaurantList {
	
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Restaurant";
		String userName = "123";
		String password = "123456";
		
		String selectScAm = "SELECT * FROM [桃園市綠色餐廳]";
		
		try (Connection conn = DriverManager.getConnection(url, userName, password)){
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(selectScAm);
			ResultSetMetaData metaData = rs.getMetaData();
			
			// .getColumnDisplaySize 取得欄位有效字數
			for (int i = 1; i<= metaData.getColumnCount(); i++) {
				System.out.printf("%"+metaData.getColumnDisplaySize(i)+"s||",metaData.getColumnName(i));							
			}
			System.out.println();
			while(rs.next()) {
				
				for (int i = 1; i <= metaData.getColumnCount(); i++) {
//					System.out.printf("%"+(metaData.getColumnDisplaySize(i)>metaData.getColumnName(i).length()?metaData.getColumnDisplaySize(i):metaData.getColumnName(i).length())+"s||",rs.getString(i));	
//					
					System.out.printf("%"+metaData.getColumnDisplaySize(i)+"s||",rs.getString(i));	
					
				}
				System.out.println();
			}
			
			System.out.println("連線成功");

		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}
