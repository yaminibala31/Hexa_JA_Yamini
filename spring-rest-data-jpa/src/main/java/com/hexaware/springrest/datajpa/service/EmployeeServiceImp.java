package com.hexaware.springrest.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeSerive{
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee addEmp(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public Employee getbyId(int eid) {
		
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deletebyId(int eid) {
		repo.deleteById(eid);
		return "Employee deleted successfully eid:"+eid;
	}

	@Override
	public List<Employee> getallEmp() {
		
		return repo.findAll();
	}

	@Override
	public List<Employee> findBySalaryGreaterThan(double sal) {
		
		return repo.findBySalaryGreaterThan(sal);
	}

	@Override
	public List<Employee> findBySalRange(double min, double max) {
		
		return repo.findBySalRange(min, max);
	}

	@Override
	public int updatesalary(double salary, int eid) {
		
		return repo.updatesalary(salary, eid);
	}

}
