package main_package.empDao.impl;

import main_package.empDao.EmployeeDAO;
import main_package.employee.Employee;

public class EmployeeDAOImpl implements EmployeeDAO, newEmpDAO {

	
	private Employee[] empList = new Employee[10]; 
	//↑假想儲存體//只要程式關閉就沒有了
	private int count = 0;
	
	
	@Override
	public boolean createEmployee(Employee emp) {
		if(count<empList.length) {
			empList[count]=emp;
			count++;
			return true;
		}else {
			System.out.println("陣列已滿");
			return false;
		}
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		for (Employee employee : empList) {
			if(employee.getEmployeeID()==id) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public Employee[] findAllEmployee() {
		return empList;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		for(Employee employee: empList) {
			if (employee.getEmployeeID()==emp.getEmployeeID()) {
				employee.setAddress(emp.getAddress());
				employee.setHiredate(emp.getHiredate());
				employee.setHomephone(emp.getHomephone());
				employee.setName(emp.getName());
				employee.setTitle(emp.getTitle());
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		for (int count = 0; count<this.count;count++) {
			if(empList[count].getEmployeeID()==id){
				while(empList[count]!=null) {
					empList[count]=empList[++count];		
				}
				this.count--;
				return true;
			}
		}
		return false;
	}

}
