//package com.hiber.one;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Question {
//	@Id
//	private int qid;
//	private String question;
//	@OneToOne(fetch = FetchType.LAZY)
//	private Answer answer;
//	public Question() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Question(int qid, String question, Answer answer) {
//		super();
//		this.qid = qid;
//		this.question = question;
//		this.answer = answer;
//	}
//	@Override
//	public String toString() {
//		return "Question [qid=" + qid + ", question=" + question + ", answer=" + answer + "]";
//	}
//	public int getQid() {
//		return qid;
//	}
//	public void setQid(int qid) {
//		this.qid = qid;
//	}
//	public String getQuestion() {
//		return question;
//	}
//	public void setQuestion(String question) {
//		this.question = question;
//	}
//	public Answer getAnswer() {
//		return answer;
//	}
//	public void setAnswer(Answer answer) {
//		this.answer = answer;
//	}
//	
//}
