package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.dao.EmployeeDao;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao EmployeeDao;

    public void addEmployee(Employee employee){
        EmployeeDao.addEmployee(employee);
    }
    public void deleteEmployee(int id){
        EmployeeDao.deleteEmployee(id);
    }
    public Employee updateEmployee(Employee employee){
        return EmployeeDao.updateEmployee(employee);
    }
    public List<Employee> getAllEmployees(){
        return EmployeeDao.getAllEmployees();
    }
    public Employee getEmployee(int id){
        return EmployeeDao.getEmployee(id);
    }
}
