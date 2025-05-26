package com.hexaware.springrest.datajpa.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.service.EmployeeServiceImp;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImp service;
	
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return service.getallEmp();
		
	}
	@GetMapping("/getbyid/{eid}")
	public Employee getbyId(@PathVariable int eid) {
		
		return service.getbyId(eid);
		
	}
	@PostMapping("/add")
	public Employee addemp(@RequestBody Employee emp) {
		return service.addEmp(emp);
		
	}
	@PutMapping("/update")
	public Employee updateemp(@RequestBody Employee emp) {
		return service.updateEmp(emp);
		
	}
	@DeleteMapping("/delete/{eid}")
	public String deleteemp(@PathVariable int eid) {
		return service.deletebyId(eid);
	}
	
	@GetMapping("/getbysalGT/{sal}")
	public List<Employee> getBySalaryGraterthan(@PathVariable double sal){
		return service.findBySalaryGreaterThan(sal);
	}
	
	@GetMapping("/getbysalrange/{min}/{max}")
	public List<Employee> getbySalrange(@PathVariable double min,@PathVariable double max){
		return service.findBySalRange(min, max);
	}
	
	@PutMapping("/UpdateSalary/{salary}/{eid}")
	public int updatesalary(@PathVariable double salary,@PathVariable int eid){
		return service.updatesalary(salary, eid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
