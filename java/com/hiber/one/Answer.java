//package com.hiber.one;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Answer {
//	@Id
//	private int aid;
//	private String answer;
//	@OneToOne(mappedBy = "answer",fetch = FetchType.EAGER)
//	private Question question;
//	@Override
//	public String toString() {
//		return "Answer [aid=" + aid + ", answer=" + answer + ", question=" + question + "]";
//	}
//	public Answer(int aid, String answer, Question question) {
//		super();
//		this.aid = aid;
//		this.answer = answer;
//		this.question = question;
//	}
//	public Question getQuestion() {
//		return question;
//	}
//	public void setQuestion(Question question) {
//		this.question = question;
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
//	public Answer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//}
