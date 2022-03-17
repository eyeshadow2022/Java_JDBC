package main_package.empDao;

import main_package.employee.Employee;

public interface EmployeeDAO {
	
	//Create
	boolean createEmployee(Employee emp);
	//Read
	Employee findEmployeeById(Integer id);
	
	Employee[] findAllEmployee();
	
	//Update
	boolean updateEmployee(Employee emp);
	
	//Delete
	boolean deleteEmployee(Integer id);

	default void printHelloWorld() {
		System.out.println("hell world hehe");
	}
}
