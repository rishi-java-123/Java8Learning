package com.solid.hr.framework.client;

import com.solid.hr.framework.logging.ConsoleLogger;
import com.solid.hr.framework.persistence.EmployeeFileSerializer;
import com.solid.hr.framework.persistence.EmployeeRepository;
import com.solid.hr.framework.personnel.Employee;
import com.solid.hr.framework.personnel.FullTimeEmployee;

import java.util.List;

public class NatHolidayEmployeeTimeOffMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository ( employeeFileSerializer);

        // Grab employees
        List < Employee > employees = repository.findAll();
        Employee manager = new FullTimeEmployee ( "Amit Patil", 500000);

        // Request time off for each employee on
        // national holiday
        for (Employee employee : employees){
            employee.requestTimeOff(1, manager);
        }
    }
}