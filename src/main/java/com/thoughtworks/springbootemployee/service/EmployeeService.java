package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.dao.EmployeeDao;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public void addEmployee(Employee employee){
        employeeDao.addEmployee(employee);
    }
    public void deleteEmployee(int id){
        employeeDao.deleteEmployee(id);
    }
    public Employee updateEmployee(Employee employee){
        return employeeDao.updateEmployee(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }
    public Employee getEmployee(int id){
        return employeeDao.getEmployee(id);
    }
}
