package com.employee.controller;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.employee.model.Employee;
import com.employee.security.LoginAttemptService;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/home")
public class LoginController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	LoginAttemptService loginAttemptService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	/*@RequestMapping(value = "/forgotLogin", method = RequestMethod.GET)
	public ModelAndView forgotLogin() {
		return new ModelAndView("forgot");
	}*/

	@PostMapping(value = "/login", produces = "application/json")
	public ModelAndView passParametersWithModelAndView(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView();
		Employee currCustomer = employeeService.findByUserName(employee.getUserName());
		if (currCustomer != null && currCustomer.getPassword().equals(employee.getPassword())) {
			List<Employee> smartphones = new ArrayList<Employee>();
			modelAndView.addObject("employee", smartphones);
			modelAndView.setViewName("home");
		} else {
			modelAndView.setViewName("Error");
		}
		return modelAndView;
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {

		session.invalidate();
		return new ModelAndView("logout");
	}
}
