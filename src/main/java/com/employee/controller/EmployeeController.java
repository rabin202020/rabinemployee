package com.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/newregister", method = RequestMethod.GET)
	public ModelAndView newEmployee() {
		return new ModelAndView("registration");
	}

	@GetMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Employee> getAll() {
		Iterable<Employee> list = employeeService.findAll();
		return list;
	}

	@PostMapping("/postemployee")
	public ModelAndView postCustomer(@ModelAttribute Employee employee) {
		employeeService.save(employee);
		return new ModelAndView("successregistration");
	}

	@PostMapping(value = "/findbyuserName", produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView findByUsertName(@RequestParam String userName) {
		ModelAndView mav = new ModelAndView("home");
		Employee employee = new Employee();
		// List<Customer> customers = null;
		try {
			employee = employeeService.findByUserName(userName);
			employee.setPassword("***");
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Employee> smartphones = new ArrayList<Employee>();
		smartphones.add(employee);
		mav.addObject("employee", smartphones);
		return mav;
	}

	@RequestMapping(value="/employee/{id}", method=RequestMethod.DELETE, 
	produces ="application/json")
	public void deleteCustomer(@PathVariable("id") long id) {
		Employee customer = new Employee();
		employeeService.delete(id);
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.PUT,produces ="application/json")
	public Employee editEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		//employee.setId(id);
		return employeeService.update(employee);
		
	}

	/*@PatchMapping(value = "/employee/{id}")
	public Employee partialUpdate(@PathVariable("id") long id) throws Exception {
		return employeeService.updateCustomer(id);
	}*/

}
