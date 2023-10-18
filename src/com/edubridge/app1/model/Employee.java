package com.edubridge.app1.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeAddress;
	
	//Constructor using field
	public Employee(int employeeId, String employeeName, int employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	//ToString method
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + "]";
	}
	
	
	
	

}
