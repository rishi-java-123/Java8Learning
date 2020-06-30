package com.cleancode.learning;

public class CommissionedEmployee extends Employee{

	public CommissionedEmployee(EmployeeRecord er) {
		er.setDepartment("sales");
		er.setLocation("pune");
		er.setName("rishi");
	}

	
	@Override
	public Money calculatePay() {
		Money salary= new Money();
		salary.setBasicSalary(10000.50);
		salary.setIncentives(500.67);
		return salary;
	}

	@Override
	public void deliverPay(Money pay) {
	Double total=  pay.getBasicSalary()+pay.getIncentives();
	System.out.println("Total salary "+total);
		
	}

}
