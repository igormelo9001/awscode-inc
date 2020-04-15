package com.awscode.inc.employees.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	private long id;
	private String name;
	private String bornDate;
	private String salary;
	private String position;
	
	
	public Employee() {
		
	}
	
	public Employee(long id, String name, String bornDate, String salary, String position) {
		super();
		this.id = id;
		this.name = name;
		this.bornDate = bornDate;
		this.salary = salary;
		this.position = position;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBornDate() {
		return bornDate;
	}
	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
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
