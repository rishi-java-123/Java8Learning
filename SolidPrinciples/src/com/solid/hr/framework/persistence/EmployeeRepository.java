package com.solid.hr.framework.persistence;

import com.solid.hr.framework.personnel.Employee;
import com.solid.hr.framework.personnel.FullTimeEmployee;
import com.solid.hr.framework.personnel.PartTimeEmployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {
    public List<Employee> findAll(){

        Employee rishi1 = new FullTimeEmployee("rishi ranjan",20000);
        Employee rishi2 = new FullTimeEmployee("rish ran",20000);
        Employee rishi3 = new PartTimeEmployee("ris ran",20000);
        Employee rishi4 = new PartTimeEmployee("rishi ranjana",20000);
        return Arrays.asList(rishi1,rishi2,rishi3,rishi4);
    }
}
