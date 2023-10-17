package com.jsp.employee;

public class Employee {
	
	private int emp_id;
	private String name;
	private String email;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	Employee() {
		System.out.println("Employee Object is Created by Spring.");
	}

	public void employeeDetails() {
		System.out.println("Id of the Employee is " + emp_id);
		System.out.println("Name of the Employee is " + name);
		System.out.println("Email  of the Employee is " + email);
		
	}
}
