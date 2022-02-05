//package com.hiber.singletable;
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
//		RegularEmployee re = new RegularEmployee();
//		re.setId(56);
//		re.setName("faisal");
//		re.setRduration(45);
//		re.setSalary(4378d);
//		
//		ContractEmployee ce = new ContractEmployee();
//		ce.setId(45);
//		ce.setName("deadeye");
//		ce.setCduration(41);
//		ce.setCost(348d);
//		
//		Employee e = new Employee();
//		e.setId(11);
//		e.setName("neko");
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
