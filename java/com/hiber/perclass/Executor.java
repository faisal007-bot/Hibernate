//package com.hiber.perclass;
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
//		REmployee re = new REmployee(11, "faiz", 4589);
//		CEmployee ce = new CEmployee(44, "sleep", 478);
//		Employee e = new Employee(56, "deadeye");
//		
//		session.persist(e);
//		session.persist(re);
//		session.persist(ce);
//		
//		tx.commit();
//		session.close();
//		factory.close();
//	}
//}
