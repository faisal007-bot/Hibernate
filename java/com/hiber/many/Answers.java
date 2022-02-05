//package com.hiber.many;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Answers {
//	@Id
//	private int aid;
//	private String answer;
//	public Questions getQuestions() {
//		return questions;
//	}
//	public void setQuestions(Questions questions) {
//		this.questions = questions;
//	}
//	@Override
//	public String toString() {
//		return "Answers [aid=" + aid + ", answer=" + answer + ", questions=" + questions + "]";
//	}
//	public Answers(int aid, String answer, Questions questions) {
//		super();
//		this.aid = aid;
//		this.answer = answer;
//		this.questions = questions;
//	}
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Questions questions;
//	public Answers() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public int getAid() {
//		return aid;
//	}
//	public void setAid(int aid) {
//		this.aid = aid;
//	}
//	public String getAnswer() {
//		return answer;
//	}
//	public void setAnswer(String answer) {
//		this.answer = answer;
//	}
//	
//}
