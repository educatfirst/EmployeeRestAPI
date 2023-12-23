package com.educatfirst.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educatfirst.spring.repository.EmployeeApiRepository;

@RestController
@RequestMapping("/getEmployeeApi")
public class EmployeeApiController {

	@Autowired
	EmployeeApiRepository empRepo;
	
	@GetMapping("/getEmpData")
	public List<Object[]> getEmpData(){
		List<Object[]> empList = empRepo.getEmpData();
		return empList;
	}
	
	@GetMapping("/getEmpDataByEmpId/{empId}/{name}")
	public List<Object[]> getEmpDataByEmpId(@PathVariable("empId") int empId,@PathVariable("name") String name){
		List<Object[]> empList = empRepo.getEmpDataByEmpId(empId, name);
		return empList;
	}
}
