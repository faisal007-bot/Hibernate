//package com.hiber.subclass;
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
//		Emp e = new Emp();
//		e.setId(11);
//		e.setName("faisal");
//		
//		Conemp ce = new Conemp();
//		ce.setId(45);
//		ce.setName("deadeye");
//		ce.setCsal(57d);
//		
//		Regemp re = new Regemp();
//		re.setId(67);
//		re.setName("cipher");
//		re.setRsalary(34d);
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
