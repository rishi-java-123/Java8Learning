package com.solid.hr.framework.tax;

import com.solid.hr.framework.personnel.Employee;
import com.solid.hr.framework.personnel.FullTimeEmployee;
import com.solid.hr.framework.personnel.Intern;
import com.solid.hr.framework.personnel.PartTimeEmployee;

public
class FullTimeEmployeeTaxCalculator implements TaxCalculator {
    private final int RETIREMENT_PERCENTAGE = 10;
    private final int FIXED_INCOME_TAX_PERCENTAGE = 16;
    private final int HEALTH_INSURANCE_PERCENTAGE = 100;


    @Override
    public
    double calculateTax ( Employee employee ) {
        return  HEALTH_INSURANCE_PERCENTAGE +
                (employee.getMonthlyIncome () * RETIREMENT_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome () * FIXED_INCOME_TAX_PERCENTAGE) / 100;

    }



    //based on new requirement
  /*  public double calculate( Employee employee ){
        int monthlyIncome = employee.getMonthlyIncome ( );
        if(employee instanceof FullTimeEmployee){
            return  HEALTH_INSURANCE_PERCENTAGE +
                    (monthlyIncome * RETIREMENT_PERCENTAGE) / 100 +
                    (monthlyIncome * FIXED_INCOME_TAX_PERCENTAGE) / 100;
        }

        if(employee instanceof PartTimeEmployee){
            return HEALTH_INSURANCE_PERCENTAGE + (monthlyIncome * 10 )/100 +
                   (monthlyIncome * FIXED_INCOME_TAX_PERCENTAGE) / 100;

        }
        if (employee instanceof Intern){
            if(monthlyIncome < 350){
                return 0;
            }else{
                return (monthlyIncome*FIXED_INCOME_TAX_PERCENTAGE)/100;
            }
        }
return  0;
    }*/
}
