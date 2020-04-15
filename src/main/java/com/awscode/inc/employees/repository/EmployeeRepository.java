package com.awscode.inc.employees.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awscode.inc.employees.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
