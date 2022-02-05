//package com.hiber.subclass;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//public class Emp {
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
//		return "Emp [id=" + id + ", name=" + name + "]";
//	}
//	public Emp(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public Emp() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//}
