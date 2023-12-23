package com.educatfirst.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.educatfirst.spring.model.EmployeeApiModel;

public interface EmployeeApiRepository extends JpaRepository<EmployeeApiModel, Integer> {

	@Query(value = "select * from employee", nativeQuery = true)
	List<Object[]> getEmpData();

	@Query(value = "select * from employee where id = :empId and name = :name", nativeQuery = true)
	List<Object[]> getEmpDataByEmpId(@Param("empId") int empId, @Param("name") String name);

}
