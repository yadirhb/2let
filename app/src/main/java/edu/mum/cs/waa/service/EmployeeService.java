package edu.mum.cs.waa.service;

import java.util.List;

import edu.mum.cs.waa.domain.Employee;
 
public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee findByEmployeeNumber(Long employeeId);
}
