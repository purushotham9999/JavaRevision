package com.java8;

public class EmployeeWithDepartment {

	private int id;

	private String empName;

	private int deptId;

	private String status = "active";

	private int salary;

	public EmployeeWithDepartment(int id, String empName, int deptId, String status, int salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeWithDepartment [id=" + id + ", empName=" + empName + ", deptId=" + deptId + ", status=" + status
				+ ", salary=" + salary + "]";
	}

}
