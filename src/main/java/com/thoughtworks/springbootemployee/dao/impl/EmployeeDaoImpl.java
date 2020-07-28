package com.thoughtworks.springbootemployee.dao.impl;

import com.thoughtworks.springbootemployee.dao.EmployeeDao;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void deleteEmployee(int id){
        Employee employeeReadyToDelete = employees.stream().filter(employee-> employee.getId()==id).findFirst().get();
        employees.remove(employeeReadyToDelete);
    }
    public Employee updateEmployee(Employee employee){
        return null;
    }
    public List<Employee> getAllEmployees(){
        return null;
    }
    public Employee getEmployee(int id){
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }
}
