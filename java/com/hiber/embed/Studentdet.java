//package com.hiber.embed;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "student_details")
//public class Studentdet {
//	@Id
//	private int sid;
//	private String sname;
//	private Address address;
//	public Studentdet(int id, String name, Address address) {
//		super();
//		this.sid = id;
//		this.sname = name;
//		this.address = address;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	public int getId() {
//		return sid;
//	}
//	public void setId(int id) {
//		this.sid = id;
//	}
//	public String getName() {
//		return sname;
//	}
//	public void setName(String name) {
//		this.sname = name;
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + sid + ", name=" + sname + ", address=" + address + "]";
//	}
//	public Studentdet() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Studentdet(int id, String name) {
//		super();
//		this.sid = id;
//		this.sname = name;
//	}
//	
//}
