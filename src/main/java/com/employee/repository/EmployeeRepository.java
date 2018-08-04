package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("select emp from Employee emp where emp.userName=:userName")
	Employee findByUserName(@Param("userName") String userName);

	Employee save(long id);

	Employee findOne(long id);
	
	@Transactional
    @Modifying
	@Query("delete from Employee emp where emp.id=:id")
	void delete(@Param("id") Long id);

}
