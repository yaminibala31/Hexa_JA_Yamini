package com.hexaware.springrest.datajpa.service;

import java.util.List;

import com.hexaware.springrest.datajpa.entity.Employee;

public interface IEmployeeSerive {
	
	public Employee addEmp(Employee emp);
	public Employee updateEmp(Employee emp);
	
	public Employee getbyId(int eid);
	public String deletebyId(int eid);
	
	public List<Employee> getallEmp();
	
	public List<Employee> findBySalaryGreaterThan(double sal);
	
	public List<Employee> findBySalRange(double min ,double max);
	
	public int updatesalary(double salary,int eid);
}
