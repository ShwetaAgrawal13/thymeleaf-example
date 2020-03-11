package com.example.thymeleaf.thymeleafdemo.service;

import java.util.List;
import com.example.thymeleaf.thymeleafdemo.entity.*;


public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
