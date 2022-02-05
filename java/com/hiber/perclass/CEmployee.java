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
//public class CEmployee extends Employee{
//	private double csalary;
//
//	public double getCsalary() {
//		return csalary;
//	}
//
//	public void setCsalary(double csalary) {
//		this.csalary = csalary;
//	}
//
//	@Override
//	public String toString() {
//		return "CEmployee [csalary=" + csalary + "]";
//	}
//
//	public CEmployee(int id, String name, double csalary) {
//		super(id, name);
//		this.csalary = csalary;
//	}
//
//	public CEmployee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public CEmployee(int id, String name) {
//		super(id, name);
//		// TODO Auto-generated constructor stub
//	}
//	
//}
