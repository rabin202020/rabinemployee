package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employee.model.Employee;

@Repository
public interface LoginRepository extends JpaRepository<Employee, Long> { 
	Employee findByUserName(String userName);
}
