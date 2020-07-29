package com.solid.hr.framework.payement;

import com.solid.hr.framework.notification.EmailSender;
import com.solid.hr.framework.notification.EmployeeNotifier;
import com.solid.hr.framework.persistence.EmployeeFileRepo;
import com.solid.hr.framework.persistence.EmployeeFileRepository;
import com.solid.hr.framework.persistence.EmployeeFileSerializer;
import com.solid.hr.framework.persistence.EmployeeRepo;
import com.solid.hr.framework.personnel.Employee;

import java.util.List;

public class PaymentProcessor {

    private EmployeeRepo employeeRepo;
    private EmployeeNotifier employeeNotifier;

    public PaymentProcessor(EmployeeRepo employeeRepo,EmployeeNotifier employeeNotifier){

        this.employeeRepo =employeeRepo;
        this.employeeNotifier = employeeNotifier;
    }

    public int sendPayments(){
        List<Employee > employees = this.employeeRepo.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            this.employeeNotifier.notify( employee);
        }

        return totalPayments;
    }
}