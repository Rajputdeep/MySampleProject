package com.edubridge.app1.model;

public class Student {
	private int employeeId;
	private String employeeName;
	private int employeeAddress;
	
	//Constructor using field
	public Student(int employeeId, String employeeName, int employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	
	//ToString Method
	@Override
	public String toString() {
		return "Student [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + "]";
	}
	
	
	
	
	

}
