//package com.hiber.start;
//
//import java.util.Arrays;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Lob;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;
//
//@Entity
//@Table(name = "Test")
//public class Test {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	@Column(name = "username",length = 1000,nullable = true,unique = true)
//	private String name;
//	@Transient
//	private double number;
//	@Lob
//	private byte[] image;
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date date;
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
//	public double getNumber() {
//		return number;
//	}
//	public void setNumber(double number) {
//		this.number = number;
//	}
//	public byte[] getImage() {
//		return image;
//	}
//	public void setImage(byte[] image) {
//		this.image = image;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	public Test() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Test(int id, String name, double number, byte[] image, Date date) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.number = number;
//		this.image = image;
//		this.date = date;
//	}
//	@Override
//	public String toString() {
//		return "Test [id=" + id + ", name=" + name + ", number=" + number + ", image=" + Arrays.toString(image)
//				+ ", date=" + date + "]";
//	}
//	
//}
