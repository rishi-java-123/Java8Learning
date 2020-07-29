package com.solid.hr.framework.client;

import com.solid.hr.framework.logging.ConsoleLogger;
import com.solid.hr.framework.persistence.EmployeeFileSerializer;
import com.solid.hr.framework.persistence.EmployeeRepository;
import com.solid.hr.framework.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class main {
    public static
    void main ( String[] args ) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeRepository repository = new EmployeeRepository ( employeeFileSerializer);

        List < Employee > employees = repository.findAll();
        for (Employee e : employees){
            try {
                repository.save(e);
                consoleLogger.writeInfo("Saved employee " + e.toString());
            } catch (IOException exception) {
                consoleLogger.writeError("Error saving employee", exception);
            }
        }
    }


}
