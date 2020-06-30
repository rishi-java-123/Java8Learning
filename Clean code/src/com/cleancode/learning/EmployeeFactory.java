package com.cleancode.learning;

public interface EmployeeFactory {
	
	Employee createEmployee(EmployeeRecord er) throws InvalidEmployeeType;

}
