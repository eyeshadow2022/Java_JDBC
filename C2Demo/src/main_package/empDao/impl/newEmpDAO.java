package main_package.empDao.impl;

import main_package.employee.Employee;

public interface newEmpDAO {

	boolean createEmployee(Employee emp);

	Employee findEmployeeById(Integer id);

	Employee[] findAllEmployee();

	boolean updateEmployee(Employee emp);

	boolean deleteEmployee(Integer id);

}