//package com.hiber.manytomany;
//
////import java.util.ArrayList;
////import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Executor {
//	public static void main(String[] args) {
//		Session session = new Configuration().configure().buildSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		
////		Ques q1 = new Ques();
////		q1.setQid(1);
////		q1.setQuestion("languages?");
////		Ques q2 = new Ques();
////		q2.setQid(2);
////		q2.setQuestion("fast?");
////		Ans a1 = new Ans();
////		a1.setAid(11);
////		a1.setAnswer("java");
////		Ans a2 = new Ans();
////		a2.setAid(22);
////		a2.setAnswer("c++");
////		
////		List<Ques> q = new ArrayList<Ques>();
////		List<Ans> a = new ArrayList<Ans>();
////		q.add(q1);
////		q.add(q2);
////		a.add(a1);
////		a.add(a2);
////		q1.setAns(a);
////		a1.setQues(q);
////		
////		session.save(q1);
////		session.save(q2);
////		session.save(a1);
////		session.save(a2);
//		
//		tx.commit();
//		session.close();
//	}
//}
