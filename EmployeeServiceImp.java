package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Employee;
import com.web.repo.EmployeeRepo;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public Employee saveEmployee(Employee emp) {
		double t=0.0,d=0.0,h=0.0,p=0.0,g=0.0,n=0.0;
		double sal=emp.getSalary();
		if(sal<30000)
		{
			t=(sal*7)/100;
			d=(sal*9)/100;
			h=(sal*11)/100;
			p=(sal*15)/100;
		}
		else if(sal>=30000 && sal<50000)
		{
			t=(sal*12)/100;
			d=(sal*13)/100;
			h=(sal*17)/100;
			p=(sal*22)/100;
		}
		else if(sal>=50000)
		{
			t=(sal*17)/100;
			d=(sal*19)/100;
			h=(sal*21)/100;
			p=(sal*25)/100;
		}
		g=sal+t+d+h;
		n=g-p;
		emp.setTa(t);
		emp.setDa(d);
		emp.setHra(h);
		emp.setPf(p);
		emp.setGross(g);
		
		emp.setNet(n);
		
		
		
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp, int eid) {
		double t=0.0,d=0.0,h=0.0,p=0.0,g=0.0,n=0.0;
		double sal=emp.getSalary();
		if(sal<30000)
		{
			t=(sal*7)/100;
			d=(sal*9)/100;
			h=(sal*11)/100;
			p=(sal*15)/100;
		}
		else if(sal>=30000 && sal<50000)
		{
			t=(sal*12)/100;
			d=(sal*13)/100;
			h=(sal*17)/100;
			p=(sal*22)/100;
		}
		else if(sal>=50000)
		{
			t=(sal*17)/100;
			d=(sal*19)/100;
			h=(sal*21)/100;
			p=(sal*25)/100;
		}
		g=sal+t+d+h;
		n=g-p;
		emp.setTa(t);
		emp.setDa(d);
		emp.setHra(h);
		emp.setPf(p);
		emp.setGross(g);
		
		emp.setNet(n);
		
		
		
		return repo.save(emp);
	}

	@Override
	public void deleteEmployee(int eid) {
		repo.deleteById(eid);
		
	}

	@Override
	public Employee getEmployee(int eid) {
		Employee get=repo.findById(eid).get();
		return get;
	}

	

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> listEmployees=(List<Employee>) repo.findAll();
		return listEmployees;
	}

}
