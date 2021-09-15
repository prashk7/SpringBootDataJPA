package com.prashant.springboot.cruddemo.service;

import java.util.List;

import com.prashant.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);
}
