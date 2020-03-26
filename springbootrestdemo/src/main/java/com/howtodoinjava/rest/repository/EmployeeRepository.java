package com.howtodoinjava.rest.repository;

import com.howtodoinjava.rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;

@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

}
