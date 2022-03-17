package main_package.employee;

import java.util.Objects;

public class Employee {
	//資料物件-負責儲存資料的物件-值物件-Value Object-VO
	//Value Object	↓
 	private int employeeID;
	private String	Name;
	private String title;
	private String hiredate;
	private String address;
	private String homephone;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeID == other.employeeID;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", Name=" + Name + ", title=" + title + ", hiredate=" + hiredate
				+ ", address=" + address + ", homephone=" + homephone + "]";
	}


		
}

