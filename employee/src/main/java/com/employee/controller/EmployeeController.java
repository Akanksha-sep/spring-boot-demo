package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Akanksha.Singh1 on 22-11-2020
 */
@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/")
    public String sayHelloSpringBoot(){
        return "HELLO FROM SPRING BOOT !!!";
    }

    @RequestMapping(value="/get-employees", method= RequestMethod.GET)
    public List<Employee> getAllEmployees()
    {
        logger.info("START employee fetch ::::");
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value="/add-employee", method=RequestMethod.POST)
    public void addUser(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }

}
