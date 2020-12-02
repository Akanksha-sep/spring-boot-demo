package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Akanksha.Singh1 on 22-11-2020
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

   @Cacheable("employees")
    public List<Employee> getAllEmployees()
    {
        List<Employee>employees = new ArrayList<>();
        logger.info("START employee fetch ::::");
        employeeRepository.findAll().forEach(employees::add);
        logger.info("END employee fetch ::::");
        return employees;
    }
    public void addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

}
