package com.prashant.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.springboot.cruddemo.entity.Employee;
import com.prashant.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	public EmployeeRestController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;

	}

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();

	}

	// add mapping for GET/employees/{employeeId}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {

		Employee theEmployee = employeeService.findById(employeeId);
		if (theEmployee == null) {
			throw new RuntimeException("Employee Id not found" + employeeId);
		}

		return theEmployee;
	}

	@PostMapping("/employees/")
	public Employee addEmployee(@RequestBody Employee theEmployee) {

		// also jst in case they pass an id in JSON.. set id to 0
		// this is to force a save of new item instead of update
		theEmployee.setId(0);

		employeeService.save(theEmployee);

		return theEmployee;

	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {

		employeeService.save(theEmployee);

		return theEmployee;
	}

	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {

		Employee theEmployee = employeeService.findById(employeeId);
		if (theEmployee == null) {
			throw new RuntimeException("EMployee Id not found" + employeeId);

		}

		employeeService.deleteById(employeeId);

		return "Deleted the employee " + theEmployee.getFirstName();

	}

}
