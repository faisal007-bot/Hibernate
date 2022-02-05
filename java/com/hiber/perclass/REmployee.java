//package com.hiber.perclass;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//
//@Entity
//@AttributeOverrides(
//		{
//			@AttributeOverride(name ="id",column = @Column(name="id")),
//			@AttributeOverride(name="name",column = @Column(name="name"))
//		}
//)
//public class REmployee extends Employee{
//	private double rsalary;
//
//	public REmployee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public REmployee(int id, String name) {
//		super(id, name);
//		// TODO Auto-generated constructor stub
//	}
//
//	public REmployee(int id, String name, double rsalary) {
//		super(id, name);
//		this.rsalary = rsalary;
//	}
//
//	@Override
//	public String toString() {
//		return "REmployee [rsalary=" + rsalary + "]";
//	}
//
//	public double getRsalary() {
//		return rsalary;
//	}
//
//	public void setRsalary(double rsalary) {
//		this.rsalary = rsalary;
//	}
//	
//}
