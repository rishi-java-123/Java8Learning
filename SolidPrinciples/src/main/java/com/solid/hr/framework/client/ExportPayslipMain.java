package com.solid.hr.framework.client;

import com.solid.hr.framework.documents.PaySlip;
import com.solid.hr.framework.logging.ConsoleLogger;
import com.solid.hr.framework.persistence.EmployeeFileSerializer;
import com.solid.hr.framework.persistence.EmployeeRepository;
import com.solid.hr.framework.personnel.Employee;

import java.time.Month;
import java.util.List;

public class ExportPayslipMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository ( employeeFileSerializer);

        // Grab employees
        List < Employee > employees = repository.findAll();

        for (Employee employee : employees){
            PaySlip payslip = new PaySlip( employee , Month.AUGUST);

            String exportableText = payslip.toTxt().toUpperCase();
            System.out.println(exportableText);
        }
    }
}