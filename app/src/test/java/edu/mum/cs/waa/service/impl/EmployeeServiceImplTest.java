package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Employee;
import edu.mum.cs.waa.repository.EmployeeRepository;
import edu.mum.cs.waa.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeServiceImplTest {

    private EmployeeService service;

    @BeforeEach
    void init() {
        List<Employee> employees = new ArrayList<>();
        employees.add(mock(Employee.class));
        employees.add(mock(Employee.class));
        employees.add(mock(Employee.class));
        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        when(employeeRepository.findAll()).thenReturn(employees);

        Employee employee10 = mock(Employee.class);
        when(employee10.getId()).thenReturn((long) 10);
        when(employeeRepository.findByEmployeeNumber((long) 10)).thenReturn(employee10);

        service = new EmployeeServiceImpl(employeeRepository);
    }

    @Test
    void findAll() {
        assertEquals(3, service.findAll().size());
    }

    @Test
    void findByEmployeeNumber() {
        assertEquals((long) 10, service.findByEmployeeNumber((long) 10).getId());
    }
}