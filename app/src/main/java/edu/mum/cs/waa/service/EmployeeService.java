package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Employee;

import java.util.List;
 
public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee findByEmployeeNumber(Long employeeId);
}
