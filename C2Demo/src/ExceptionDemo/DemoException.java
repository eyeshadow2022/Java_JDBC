package ExceptionDemo;

import main_package.employee.Employee;

public class DemoException {

	public static void main(String[] args) {
		
		
		try {
			Employee 臨時工 = null;
			System.out.println("P前");
			int i = 1/0;
			臨時工.getName();
			System.out.println("P後");
		}catch(NullPointerException A) {
			System.out.println("該物件不存在");
		}catch(ArithmeticException A) {
			System.out.println("算術例外");
		}catch(Exception A) {
			System.out.println("總例外");
		}finally {
			System.out.println("必定執行區");
		}
		
	}

}
