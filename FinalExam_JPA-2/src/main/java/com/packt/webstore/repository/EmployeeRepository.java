package com.packt.webstore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Employee;

	@Repository
	public interface EmployeeRepository extends  CrudRepository<Employee, Long> 
	{
		@Query("SELECT e from Employee e where e.employeeNumber = :number")
		public Employee locateOneEmployeeByHisNumber(@Param("number") int number);
			
			
			
		
  	}

