//package com.hiber.merge;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Executor {
//	public static void main(String[] args) {
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session1 = factory.openSession();
//		Transaction tx1 = session1.beginTransaction();
//		
////		Test t = new Test(455, "delhi");
////		session1.save(t);
//		
//		Test t = session1.get(Test.class, 45);
//		
//		tx1.commit();
//		session1.close();
//		
////		t.setNumber(54387);
//		t.setCity("vegas");
//		
//		Session session2 = factory.openSession();
//		Transaction tx2 = session2.beginTransaction();
//		
////		merge is used if we want to make changes in the object even after closing a connection in which we
////		used get method to get that object
//		session2.merge(t);
//		
//		tx2.commit();
//		session2.close();
//		factory.close();
//	}
//}
