package m1_JDBCDemo;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class DriverRegDemo3 {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(
					new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		Iterator<Driver> asIterator = drivers.asIterator();
		////////////////////////////////
		asIterator.forEachRemaining(System.out::println);
		//////////////////////////////////////
		
		System.out.println("註冊完成");

	}

}
