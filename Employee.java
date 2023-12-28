package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_CRUD")
public class Employee {
	@Id
	private int eid;
	private String name;
	private double salary;
	private double ta;
	private double da;
	private double hra;
	private double pf;
	private double gross;
	private double net;
	public Employee() {
		super();
	}
	public Employee(int eid, String name, double salary, double ta, double da, double hra, double pf, double gross,
			double net) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.gross = gross;
		this.net = net;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public double getNet() {
		return net;
	}
	public void setNet(double net) {
		this.net = net;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", ta=" + ta + ", da=" + da + ", hra="
				+ hra + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
	}
	
	

}
