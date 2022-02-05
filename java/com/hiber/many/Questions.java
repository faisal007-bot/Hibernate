//package com.hiber.many;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Questions {
//	@Id
//	private int qid;
//	private String question;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Answers> answers;
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
//	public List<Answers> getAnswers() {
//		return answers;
//	}
//	public void setAnswers(List<Answers> answers) {
//		this.answers = answers;
//	}
//	@Override
//	public String toString() {
//		return "Questions [qid=" + qid + ", question=" + question + ", answers=" + answers + "]";
//	}
//	public Questions(int qid, String question, List<Answers> answers) {
//		super();
//		this.qid = qid;
//		this.question = question;
//		this.answers = answers;
//	}
//	public Questions() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//}
