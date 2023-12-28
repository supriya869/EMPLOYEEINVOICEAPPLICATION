package com.web.service;

import java.util.List;

import com.web.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);
	public Employee updateEmployee(Employee emp,int eid);
	public void deleteEmployee(int eid);
	public Employee getEmployee(int eid);
	public List<Employee> getAllEmployees();

}
