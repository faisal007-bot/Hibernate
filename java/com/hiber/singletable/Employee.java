//package com.hiber.singletable;
//
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//
//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("employee")
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
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
//	
//}
