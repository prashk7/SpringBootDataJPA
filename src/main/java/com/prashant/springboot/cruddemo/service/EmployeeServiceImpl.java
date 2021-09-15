package com.prashant.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prashant.springboot.cruddemo.dao.EmployeeRepository;
import com.prashant.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub

		Optional<Employee> result = employeeRepository.findById(theId);
		Employee employee = null;
		if (result.isPresent()) {
			employee = result.get();
		} else {
			//
			throw new RuntimeException("Did not find the employee ID" + theId);

		}
		return employee;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

		employeeRepository.deleteById(theId);
	}

}
