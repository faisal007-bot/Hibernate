//package com.hiber.manytomany;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
////import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Ques {
//	@Id
//	private int qid;
//	private String question;
//	@ManyToMany
////	@JoinColumn(name="question")
//	private List<Ans> ans;
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
//	public List<Ans> getAns() {
//		return ans;
//	}
//	public void setAns(List<Ans> ans) {
//		this.ans = ans;
//	}
//	public Ques() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Ques [qid=" + qid + ", question=" + question + ", ans=" + ans + "]";
//	}
//	
//}
