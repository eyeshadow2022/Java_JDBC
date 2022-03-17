package main_package.empDao.impl;

import java.util.ArrayList;
import java.util.List;

import main_package.empDao.EmployeeDAO;
import main_package.employee.Employee;

public class employeeDAOmpl_2 implements EmployeeDAO {

	private List empList = new ArrayList();//宣告一個List
	
	@Override
	public boolean createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empList.add(emp);
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		for (Object object : empList) {
			if (object instanceof Employee) {
				Employee emp = (Employee)object;
				if(id.equals(emp.getEmployeeID()));
					return emp;
			}
		}
		return null;
	}

	@Override
	public Employee[] findAllEmployee() {
		// TODO Auto-generated method stub
		return (Employee[]) empList.toArray();
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		for (Object object : empList) {
			if(object instanceof Employee) {
				Employee oldEmpData = (Employee) object;
				if (emp.getEmployeeID()==oldEmpData.getEmployeeID()) {}
					empList.set(empList.indexOf(oldEmpData),emp);
					return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		Employee deleteE = new Employee();
		deleteE.setEmployeeID(id);
		return empList.remove(deleteE);
	}

	public int getListSize() {
		return empList.size();
	}
	
	public Employee getEmployeeByIndex(int index) {
		return (Employee) empList.get(index);
	}
	public boolean getEmployeeByIndex(Integer id) {
		return empList.remove(id);
}
}
