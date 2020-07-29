package com.solid.hr.framework.documents;

import com.solid.hr.framework.personnel.Employee;

import java.time.Month;

public
class PaySlip  implements ExportableTxt{

    private String employeeName;
    private int monthlyIncome;
    private Month month;

    public PaySlip( Employee employee, Month month) {
        this.employeeName = employee.getFullName();
        this.monthlyIncome = employee.getMonthlyIncome();
        this.month = month;
    }

    public Month getMonth() {
        return month;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    @Override
    public
    String toTxt ( ) {
        StringBuilder sb = new StringBuilder();
        sb.append("MONTH: ").append(this.month);
        sb.append(System.lineSeparator());
        sb.append("NAME: ").append(this.employeeName);
        sb.append(System.lineSeparator());
        sb.append("INCOME: ").append(this.monthlyIncome);
        sb.append(System.lineSeparator());

        return sb.toString();
    }
}
