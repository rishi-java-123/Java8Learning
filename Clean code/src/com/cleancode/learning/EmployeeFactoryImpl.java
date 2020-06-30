package com.cleancode.learning;

public class EmployeeFactoryImpl implements EmployeeFactory {

	@Override
	public Employee createEmployee(EmployeeRecord er) throws InvalidEmployeeType {
		 switch (er.type) {
         case COMMISSIONED:
           return new CommissionedEmployee(er) ;
         case HOURLY:
           return new HourlyEmployee(er);
         case SALARIED:
           return new SalariedEmploye(er);
         default:
           throw new InvalidEmployeeType(er.type);
		
		 }
	}

}
