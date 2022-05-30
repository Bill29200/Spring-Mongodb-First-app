package com.example.springMongodbCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springMongodbCRUD.model.Employee;
import com.example.springMongodbCRUD.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//...........................
	public Employee saveOrUpdate(Employee emp) {
		return employeeRepository.save(emp);
	}

}
