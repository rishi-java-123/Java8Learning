package com.cleancode.learning;

public class EmployeeRecord {

	private String name;
	private String location;
	private String department;
	EmployeeType type;

	public EmployeeRecord() {
		super();

	}

	public EmployeeRecord(EmployeeType type) {
		super();
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}

}
