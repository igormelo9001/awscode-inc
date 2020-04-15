package com.awscode.inc.employees.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	private String id;
	private String name;
	private Date bornDate;
	private BigDecimal salary;
	private String position;
	
	
	public Employee() {
		
	}
	
	public Employee(String id, String name, Date bornDate, BigDecimal salary, String position) {
		super();
		this.id = id;
		this.name = name;
		this.bornDate = bornDate;
		this.salary = salary;
		this.position = position;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", bornDate=" + bornDate + ", salary=" + salary + ", position="
				+ position + "]";
	}
	
}
