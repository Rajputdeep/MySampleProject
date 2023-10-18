package com.edubridge.app1.model;

public class Student {
	private int studentId;
	private String studentName;
	private int studentAddress;
	
	//Constructor using field
	public Student(int studentId, String studentName, int studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	//ToString method
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
	
	

}
