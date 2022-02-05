package com.hiber.transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Executor {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		used to make changes happen into the database
		tx.commit();
		
//		used to set the timeout of this transaction
//		tx.setTimeout(45);
		
//		used to get the timeout of this transaction
//		tx.getTimeout();
		
//		is used to check whether the transaction is active or not
//		tx.isActive();
		
//		used to rollback the current session commit
//		tx.rollback();
	}
}
