package com.employee.repository;

import com.employee.model.Employee;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Akanksha.Singh1 on 22-11-2020
 */
public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
