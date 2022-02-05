//package com.hiber.singletable;
//
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//
//@Entity
//@DiscriminatorValue("regularemployee")
//public class RegularEmployee extends Employee{
//	private int rduration;
//	private double salary;
//	public int getRduration() {
//		return rduration;
//	}
//	public void setRduration(int rduration) {
//		this.rduration = rduration;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	@Override
//	public String toString() {
//		return "RegularEmployee [rduration=" + rduration + ", salary=" + salary + "]";
//	}
//	public RegularEmployee(int id, String name, int rduration, double salary) {
//		super(id, name);
//		this.rduration = rduration;
//		this.salary = salary;
//	}
//	public RegularEmployee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public RegularEmployee(int id, String name) {
//		super(id, name);
//		// TODO Auto-generated constructor stub
//	}
//	
//}
