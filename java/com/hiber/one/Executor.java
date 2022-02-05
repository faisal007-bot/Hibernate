//package com.hiber.one;
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
////		Answer a = new Answer();
////		a.setAid(3);
////		a.setAnswer("OOPS");
////		
////		Question q = new Question();
////		q.setQid(4);
////		q.setQuestion("features of java?");
////		q.setAnswer(a);
////		a.setQuestion(q);
////		
////		session.save(a);
////		session.save(q);
//		
////		Question q = session.get(Question.class, 4);
////		System.out.println(q.getQuestion());
////		System.out.println(q.getAnswer().getAnswer());
//		
//		tx.commit();
//		session.close();
//	}
//}
