package com.hiber.sessionfactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Executor {
	public static void main(String[] args) {
//		methods to create sessionfactory
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory1 = meta.getSessionFactoryBuilder().build();
		System.out.println(factory1+" = 1st session factory");
//		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		System.out.println(factory+" 2nd session factory");
		
//		used to open a new session
		Session s1 = factory.openSession();
		System.out.println(s1);
		
//		used to get which cache is used by this session factory
		System.out.println(factory.getCache());
		
//		used to check if the sessionfactory is open or not
		System.out.println(factory.isOpen());
		
//		used to check if the sessionfactory is closed or not		
		System.out.println(factory.isClosed());
	}
}
