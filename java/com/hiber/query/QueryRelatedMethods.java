package com.hiber.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

public class QueryRelatedMethods {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		String query = "from Employee";
//		Query q = session.createQuery(query);
		
//		executeupdate method is used to perform insert update and delete operations in database
//		int result = q.executeUpdate();
		
//		it returns the list of multiple objects
//		q.getResultList();
//		q.list();
		
//		it returns the single object
//		q.getSingleResult();
//		q.uniqueResult();
		
//		it is used to dynamicaaly pass the value inside the query
//		q.getParameter(4);
		
//		it is used in pagination to set the first row
//		q.setFirstResult(1);
		
//		it is used in pagination to set the max row
//		q.setMaxResults(19);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
