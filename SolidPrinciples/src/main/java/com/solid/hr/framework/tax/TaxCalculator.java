package com.solid.hr.framework.tax;

import com.solid.hr.framework.personnel.Employee;

public
interface TaxCalculator {
    double calculateTax( Employee employee );
}
