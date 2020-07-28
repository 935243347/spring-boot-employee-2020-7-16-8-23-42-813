package com.thoughtworks.springbootemployee.dao;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao {

    private List<Employee> employees = new ArrayList<>();

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
        return null;
    }

}
