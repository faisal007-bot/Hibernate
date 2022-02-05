//package com.hiber.perclass;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//public class Employee {
//	@Id
//	private int id;
//	private String name;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//}
