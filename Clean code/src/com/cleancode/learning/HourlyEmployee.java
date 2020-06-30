package com.cleancode.learning;

public class HourlyEmployee extends Employee {
	
	public static final Double RATE=700.15;

	public HourlyEmployee(EmployeeRecord er) {
		er=new EmployeeRecord();
		er.setDepartment("managment");
		er.setLocation("bangalore");
		er.setName("rahul");
	}

	

	@Override
	public Money calculatePay() {
		Money salary= new Money();
		salary.setBasicSalary(10000.50);
		salary.setIncentives(calculateIncentives());
		return salary;
	
	}

	@Override
	public void deliverPay(Money pay) {
		Double total=  pay.getBasicSalary()+pay.getIncentives();
		System.out.println("Total salary "+total);
		
	}
	
	public Double calculateIncentives() {
		long totalNumberOfWorkingMinutesInMonthandYear = Utility.totalNumberOfWorkingMinutesInMonthandYear();
		long calculateWokingHours = Utility.calculateWokingHours(totalNumberOfWorkingMinutesInMonthandYear);
		Double totalIncentives = calculateWokingHours*RATE;
		return totalIncentives;
	}
	
	
	

}
