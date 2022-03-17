package main_package;

import main_package.empDao.EmployeeDAO;
import main_package.empDao.impl.EmployeeDAOImpl;
import main_package.employee.Employee;

public class test {

	public static void main(String[] args) {
		
		EmployeeDAO eDao = new EmployeeDAOImpl();
		Employee emp1= new Employee();
		emp1.setEmployeeID(1);
		emp1.setName("Jack");
		eDao.createEmployee(emp1);
		Employee emp2 = new Employee();
		emp2.setEmployeeID(2);
		emp2.setName("Bob");
		eDao.createEmployee(emp2);
		Employee emp3 = new Employee();
		emp2.setEmployeeID(3);
		emp2.setName("Mary");
		eDao.createEmployee(emp3);
		Employee [] emps= eDao.findAllEmployee();
		for (Employee employee : emps) {
			if(employee!=null)System.out.println(employee.getName());
		}
		eDao.deleteEmployee(3);
		System.out.println();
		for (Employee employee:emps) {
			if(employee!=null)System.out.println(employee.getName());
		}
		eDao.printHelloWorld();
		
		

	}

}
