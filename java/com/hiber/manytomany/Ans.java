//package com.hiber.manytomany;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Ans {
//	@Id
//	private int aid;
//	private String answer;
//	@ManyToMany(mappedBy = "ans")
//	private List<Ques> ques;
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
//	public List<Ques> getQues() {
//		return ques;
//	}
//	public void setQues(List<Ques> ques) {
//		this.ques = ques;
//	}
//	@Override
//	public String toString() {
//		return "Ans [aid=" + aid + ", answer=" + answer + ", ques=" + ques + "]";
//	}
//	public Ans() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Ans(int aid, String answer, List<Ques> ques) {
//		super();
//		this.aid = aid;
//		this.answer = answer;
//		this.ques = ques;
//	}
//	
//}
