package com.employee.serviceimpl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.internal.LoadingCache;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.security.LoginAttemptService;
import com.employee.service.EmployeeService;

@Component
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	private LoginAttemptService loginAttemptService;

	@Autowired
	private HttpServletRequest request;

	public EmployeeServiceimpl() {
		super();
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(Long id) {
		employeeRepository.delete(id);
	}

	@Override
	public Employee findByUserName(String name) throws UsernameNotFoundException {
		final String ip = getClientIP();
		Employee employee = null;
		
		if (loginAttemptService.isBlocked(ip)) {
			throw new RuntimeException("blocked");
		}
		
		try {
			employee = employeeRepository.findByUserName(name);
			if (employee == null) {
				throw new UsernameNotFoundException("No user found with username: " + name);
			}
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
		return employee;
	}

	@Override
	public Employee updateCustomer(long id) throws Exception {
		if (id == 0) {
			String message = "No customer is present";
			throw new Exception(message);
		}

		Employee employee = employeeRepository.findOne(id);

		if (employee == null) {
			String message = "No customer is present in this name in our db";
			throw new Exception(message);
		}

		employee.setFirstName("serestr");

		return employeeRepository.save(employee);
	}

	@Override
	public Employee update(Employee employee) {

		return employeeRepository.save(employee);
	}

	private final String getClientIP() {
		final String xfHeader = request.getHeader("X-Forwarded-For");
		if (xfHeader == null) {
			return request.getRemoteAddr();
		}
		return xfHeader.split(",")[0];
	}

}
