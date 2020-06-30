package com.cleancode.learning;

public class SalariedEmploye extends Employee{

	public SalariedEmploye(EmployeeRecord er) {
		er=new EmployeeRecord();
		er.setDepartment("Delivery");
		er.setLocation("hyderabad");
		er.setName("rohit");
	}

	
	@Override
	public Money calculatePay() {
		Money salary= new Money();
		salary.setBasicSalary(10000.50);
		salary.setIncentives(0.0);
		return salary;
	}

	@Override
	public void deliverPay(Money pay) {
		Double total=  pay.getBasicSalary()+pay.getIncentives();
		System.out.println("Total salary "+total);
		
	}

}
