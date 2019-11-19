package edu.mum.cs.waa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.waa.domain.Employee;
import edu.mum.cs.waa.repository.EmployeeRepository;
import edu.mum.cs.waa.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> findAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee findByEmployeeNumber(Long employeeId) {
		return employeeRepository.findByEmployeeNumber(employeeId);
	}

}
