package com.solid.hr.framework.tax;

import com.solid.hr.framework.personnel.Employee;
import com.solid.hr.framework.personnel.FullTimeEmployee;
import com.solid.hr.framework.personnel.Intern;
import com.solid.hr.framework.personnel.PartTimeEmployee;

public
class TaxCalculatorFactory {
    public static TaxCalculator buildEmployee( Employee employee){
        if(employee instanceof FullTimeEmployee){
            return new FullTimeEmployeeTaxCalculator ();
        }if(employee instanceof PartTimeEmployee){
            return new PartTimeTaxCalculator ();
        }
        if(employee instanceof Intern){
            return new InternTaxCalculator ();
        }
        throw new RuntimeException ( "invalid employee type" );

    }
}
