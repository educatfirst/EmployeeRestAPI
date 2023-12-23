package com.educatfirst.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeApiModel {

	@Id
	@Column(name = "id")
	private Integer id;
}
