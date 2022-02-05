//package com.hiber.embed;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//public class Executor {
//	public static void main(String[] args) {
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
//		
////		Address a = new Address("Vegas");
////		Studentdet s = new Studentdet(333, "cipher", a);
//		
////		session.save(a);
////		session.save(s);
//		
//		tx.commit();
//		session.close();
//		factory.close();
//	}
//}
