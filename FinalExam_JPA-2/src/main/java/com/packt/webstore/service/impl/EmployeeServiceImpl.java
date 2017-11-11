package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;
import com.packt.webstore.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAll() {
	
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeByNumber(int number) {
		
		return employeeRepository.locateOneEmployeeByHisNumber(number);
	}
	
	

}
