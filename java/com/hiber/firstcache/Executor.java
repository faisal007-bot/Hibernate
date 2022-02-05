//package com.hiber.firstcache;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Executor {
//	public static void main(String[] args) {
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
//		
////		Student s1 = new Student(3, "sleep");
////		Student s2 = new Student(45, "neko");
//		
////		session.save(s1);
////		session.save(s2);
//		
////		fetching data using session
////		first level cache state is maintained by session so if we access the same object in the same session
////		then the session stores this object in first level cache memory so it doesnt hit database for the same object
//		
//		Student s11 = session.get(Student.class, 3);
//		System.out.println(s11);
//		Student s12 = session.get(Student.class, 3);
//		System.out.println(s12);
//		
//		tx.commit();
//		session.close();
//		factory.close();
//	}
//}
