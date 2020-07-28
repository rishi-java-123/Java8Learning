package com.solid.hr.framework.persistence;

import com.solid.hr.framework.personnel.Employee;
import com.solid.hr.framework.personnel.FullTimeEmployee;
import com.solid.hr.framework.personnel.PartTimeEmployee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public
class EmployeeRepository {
    private EmployeeFileSerializer employeeFileSerializer;

    // Dependency Injection
    public
    EmployeeRepository ( EmployeeFileSerializer employeeFileSerializer ) {
        this.employeeFileSerializer = employeeFileSerializer;
    }

    public
    List < Employee > findAll ( ) {

        Employee rishi1 = new FullTimeEmployee ( "rishi ranjan" , 20000 );
        Employee rishi2 = new FullTimeEmployee ( "rish ran" , 20000 );
        Employee rishi3 = new PartTimeEmployee ( "ris ran" , 20000 );
        Employee rishi4 = new PartTimeEmployee ( "rishi ranjana" , 20000 );
        return Arrays.asList ( rishi1 , rishi2 , rishi3 , rishi4 );
    }

    public
    void save ( Employee employee ) throws IOException {
        String serializedString = this.employeeFileSerializer.Serialize ( employee );
        // refactoring based on SRP
      /*  StringBuilder sb = new StringBuilder();
        sb.append("### EMPLOYEE RECORD ####");
        sb.append(System.lineSeparator());
        sb.append("NAME: ");
        sb.append(employee.getFullName() );
        sb.append(System.lineSeparator());
        sb.append("POSITION: ");
        sb.append(employee.getClass().getTypeName());
        sb.append(System.lineSeparator());
        sb.append("EMAIL: ");
        sb.append(employee.getEmail());
        sb.append(System.lineSeparator());
        sb.append("MONTHLY WAGE: ");
        sb.append(employee.getMonthlyIncome());
        sb.append(System.lineSeparator());*/

        Path path = Paths.get ( employee.getFullName ( ).replace ( " " , "_" ) + ".rec" );

        Files.write ( path , serializedString.getBytes ( ) );

    }
}
