package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	
	public Employee update(Employee employee) {
		return er.save(employee);
	}
	
	public void delete(Long id) {
		er.delete(read(id));
	}
	
	public List<Employee> read() {
		return er.findAll();
	}
	
	public Employee read(Long id) {
		return er.findById(id).get();
	}
	
}
