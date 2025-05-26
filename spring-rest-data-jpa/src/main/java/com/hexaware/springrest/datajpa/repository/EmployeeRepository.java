package com.hexaware.springrest.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrest.datajpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	
	
	    public List<Employee> findBySalaryGreaterThan(double sal);
	    
	    @Query("select e from Employee e where salary between ?1 and ?2")
	    public List<Employee> findBySalRange(double min ,double max);
	    
	    @Query("update Employee e set e.salary=?1 where eid=?2")
	    public int updatesalary(double salary,int eid);
}
