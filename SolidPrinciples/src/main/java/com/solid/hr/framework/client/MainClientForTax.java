package com.solid.hr.framework.client;

import com.solid.hr.framework.logging.ConsoleLogger;
import com.solid.hr.framework.persistence.EmployeeFileSerializer;
import com.solid.hr.framework.persistence.EmployeeRepository;
import com.solid.hr.framework.personnel.Employee;
import com.solid.hr.framework.tax.TaxCalculator;
import com.solid.hr.framework.tax.TaxCalculatorFactory;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public
class MainClientForTax {
    public static
    void main ( String[] args ) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeRepository repository = new EmployeeRepository ( employeeFileSerializer);

        List < Employee > employees = repository.findAll();
        Locale locale = new Locale( "hi", "IN");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance ( locale );
        double totalTaxes = 0;
        for (Employee em:employees) {
            TaxCalculator employeeTypeForTaxCalculator = TaxCalculatorFactory.buildEmployee ( em );
            double tax = employeeTypeForTaxCalculator.calculateTax ( em );
            String formatedTax = currencyInstance.format ( tax );
            consoleLogger.writeInfo(em.getFullName() + " taxes: " + formatedTax);
            totalTaxes += employeeTypeForTaxCalculator.calculateTax(em);
        }
        consoleLogger.writeInfo("Total taxes = " + currencyInstance.format(totalTaxes));
    }
}
