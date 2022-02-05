package com.hiber.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.criterion.CriteriaQuery;
//import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.query.Query;

import com.hiber.hql.Employee;

public class Executor {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		used to create the criteria
		Criteria c = session.createCriteria(Employee.class);
		
		
//		used to add restrictions in the criteria object
//		Criteria add = c.add(Restrictions.between("id", 3, 10));
//		Criteria add = c.add(Restrictions.eq("id", 34));
		Criteria add = c.add(Restrictions.gt("id", 3));
		
//		use to add order desc or asc with criteria
//		Criteria add = c.addOrder(Order.asc("city"));
//		Criteria add = c.addOrder(Order.desc("city"));
		
		
		List<Employee> list = add.list();
		for(Employee e:list) {
			System.out.println(e.getCity());
		}
		tx.commit();
		session.close();factory.close();
	}
}
