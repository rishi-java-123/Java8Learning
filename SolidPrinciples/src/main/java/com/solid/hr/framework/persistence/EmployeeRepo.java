package com.solid.hr.framework.persistence;

import com.solid.hr.framework.personnel.Employee;

import java.io.IOException;
import java.util.List;

public
interface EmployeeRepo {
    List <Employee> findAll();
    void save(Employee employee) throws IOException;
}
