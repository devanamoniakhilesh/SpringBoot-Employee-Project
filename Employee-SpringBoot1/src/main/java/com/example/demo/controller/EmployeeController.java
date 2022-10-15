package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@GetMapping("/home")
	public String home()
	{
		return " Employee Home page";
	}
	
	@Autowired
	private EmployeeService es;
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return es.create(employee);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return es.update(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") Long id)
	{
		try  
			{  
		 		es.delete(id);
	            System.out.println("User Deleted Successfully"); 
	            return "User Deleted Successfully";
		    }  
		catch(Exception e)  
		    {  
		        System.out.println(e);  
	            return "No value present";
		    }  
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return es.read();
	}
}
