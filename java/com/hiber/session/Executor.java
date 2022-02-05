package com.hiber.session;

//import org.hibernate.CacheMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Executor {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
//		used to save the object it returns serializable
//		session.save(null);
		
//		it is also used to save the object but it doesnt return anything
//		session.persist(null);
		
//		get method is used to get the single object
//		session.get(null, session);
		
//		load method is also used to get the single object
//		session.load(null, session);
		
//		it is used to make permanent changes to the database it returns the object of Transaction
//		Transaction tx = session.beginTransaction();
		
//		it is used to clear the session object
//		session.clear();
		
//		it is used to close the session
//		session.close();
		
//		it is used to check if the provided object is present in session cache or not
//		session.contains(session);
		
//		it is used to create criteria
//		session.createCriteria(null);
		
//		it is used to create the HQL query
//		session.createQuery(null);
		
//		it is used to create SQL query
//		session.createSQLQuery(null);
		
//		it is used to delete the provided object from the persistent state and database
//		session.delete(session);
		
//		it is used to remove the provided object from the session cache memory
//		session.evict(session);
		
//		returns the cache used by this session
//		CacheMode cacheMode = session.getCacheMode();
		
//		used to get the session factory which is used to create this session
//		System.out.println(session.getSessionFactory());
		
//		used to check if the session is open or not
//		session.isOpen();
		
//		merge is use to update the same object between multiple sessions
//		session.merge(session);
		
//		update method is used to update the object in the same session
//		session.update(session);
		
//		this method is used to save or update if primary key already present then it will update this onject
//		else it will simply saves the object
//		session.saveOrUpdate(session);
		
//		used to remove the entity from the persistent state
//		session.remove(session);
		
		session.close();
	}
}
