package com.employee.service;

import com.employee.model.Employee;

public interface EmployeeService {
	Iterable<Employee> findAll();
	void  save(Employee employee);
	Employee findByUserName(String name);
	void delete(Long id);
	Employee updateCustomer(long id) throws Exception;
	Employee update(Employee employee);
}
