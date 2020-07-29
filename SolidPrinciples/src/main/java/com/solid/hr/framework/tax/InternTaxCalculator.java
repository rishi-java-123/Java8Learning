package com.solid.hr.framework.tax;

import com.solid.hr.framework.personnel.Employee;

public
class InternTaxCalculator implements  TaxCalculator {
    private final int RETIREMENT_PERCENTAGE = 10;
    private final int FIXED_INCOME_TAX_PERCENTAGE = 16;
    private final int HEALTH_INSURANCE_PERCENTAGE = 100;
    @Override
    public
    double calculateTax ( Employee employee ) {
        int monthlyIncome = employee.getMonthlyIncome ( );
        if(monthlyIncome < 350){
            return 0;
        }else{
            return (monthlyIncome*FIXED_INCOME_TAX_PERCENTAGE)/100;
        }
    }
}
