package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Employee;

import java.util.List;
 
public interface EmployeeService {

	Employee save(Employee employee);

	List<Employee> findAll();

	Employee findByEmployeeNumber(Long employeeId);
}
