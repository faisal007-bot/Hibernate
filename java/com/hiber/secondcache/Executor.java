//package com.hiber.secondcache;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Executor {
//	public static void main(String[] args) {
////		second level cache is associated with sessionfactory so we can use the same object from the 
////		second level cache between different sessions
////		if the object is present in second level cache then it doesnt hit the database
////		to use second level cache we need to add ehcache dependency and ehcache hibernate dependency in pom.xml
////		then we need to set cache.use_second_level_cache property in hibernate configuration file and set it to true
////		cache.region.factory_class property and provide the path of org.hibernate.cache.ehcache.internal.ehcacheregionfactory
////		in the configuration file
////		we need to use the @cacheable and @cache on top of the entity class which we want to use in second level cache
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
////		first session
//		Session session1 = factory.openSession();
//		Transaction tx1 = session1.beginTransaction();
//		
////		Students s1 = new Students(34, "dead");
////		session1.save(s1);
//		
//		Students s1 = session1.get(Students.class, 34);
//		System.out.println(s1);
//		
//		tx1.commit();
//		session1.close();
////		second session
//		Session session2 = factory.openSession();
//		Transaction tx2 = session2.beginTransaction();
//		
//		Students s2 = session2.get(Students.class, 34);
//		System.out.println(s2);
//		
//		tx2.commit();
//		session2.close();
//		factory.close();
//	}
//}
