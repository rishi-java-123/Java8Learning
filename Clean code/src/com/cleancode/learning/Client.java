package com.cleancode.learning;

public class Client {
	
	public static void main(String[] args) {
		EmployeeFactory empFac = new EmployeeFactoryImpl();
		EmployeeType employeeTypes = EmployeeType.textValueOf("HOURLY");
		EmployeeRecord employeeRecord= new EmployeeRecord(employeeTypes);
		
		try {
			Employee employee = empFac.createEmployee(employeeRecord);
			boolean payday = employee.isPayday();
			if(payday) {
				Money calculatePay = employee.calculatePay();
				employee.deliverPay(calculatePay);
			}
		} catch (InvalidEmployeeType e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
