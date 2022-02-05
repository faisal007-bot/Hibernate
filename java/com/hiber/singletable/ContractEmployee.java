//package com.hiber.singletable;
//
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//
//@Entity
//@DiscriminatorValue("contractemployee")
//public class ContractEmployee extends Employee{
//	private int cduration;
//	private double cost;
//	public int getCduration() {
//		return cduration;
//	}
//	public void setCduration(int cduration) {
//		this.cduration = cduration;
//	}
//	public double getCost() {
//		return cost;
//	}
//	public void setCost(double cost) {
//		this.cost = cost;
//	}
//	@Override
//	public String toString() {
//		return "ContractEmployee [cduration=" + cduration + ", cost=" + cost + "]";
//	}
//	public ContractEmployee(int id, String name, int cduration, double cost) {
//		super(id, name);
//		this.cduration = cduration;
//		this.cost = cost;
//	}
//	public ContractEmployee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public ContractEmployee(int id, String name) {
//		super(id, name);
//		// TODO Auto-generated constructor stub
//	}
//	
//}
