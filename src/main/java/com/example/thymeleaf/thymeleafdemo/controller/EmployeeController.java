package com.example.thymeleaf.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.thymeleaf.thymeleafdemo.entity.Employee;
import com.example.thymeleaf.thymeleafdemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	private List <Employee> employees;

//	@PostConstruct
//	private void loadData() {
//	
//	Employee emp1 = new Employee(1, "Ram", "Sharma", "shweta.sharma@test.com");
//	Employee emp2 = new Employee(1, "Rakesh", "Verma", "Rakesh.Verma@test.com");
//	Employee emp3 = new Employee(1, "John", "Smith", "John.Smith@test.com");
//	Employee emp4 = new Employee(1, "David", "Josh", "David.Josh@test.com");
//	employees = new ArrayList<Employee>();
//	employees.add(emp1);
//	employees.add(emp2);
//	employees.add(emp3);
//	employees.add(emp4);
//
//	}
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/list")
	public String listEmployees(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees",employees);
		return "list-employees";
		
	}
}
