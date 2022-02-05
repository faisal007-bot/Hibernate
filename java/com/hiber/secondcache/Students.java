//package com.hiber.secondcache;
//
//import javax.persistence.Cacheable;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//
//@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//public class Students {
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
//	public Students(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public Students() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Students [id=" + id + ", name=" + name + "]";
//	}
//	
//}
