package com.hiber.sql;

//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.NativeQuery;
//import org.hibernate.query.Query;

//import com.hiber.hql.Employee;

public class Executor {
//	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		all the HQL and SQL query methods are same
//		using select all query with sql
//		String query = "select * from employee";
//		Query q = session.createSQLQuery(query);
//		List<Object[]> emp = q.list();
//		for(Object[] e:emp) {
//			System.out.println(Arrays.toString(e));
//		}
		
		
//		getting 2 columns from the database it returns Object[]
//		String query = "select name,id from employee";
//		Query q = session.createSQLQuery(query);
//		List<Object[]> emp = q.getResultList();
//		for(Object[] e:emp) {
//			System.out.println(Arrays.toString(e));
//		}
		
//		getting single column from database it returns Object
//		String query = "select name from employee";
//		Query q = session.createSQLQuery(query);
//		List<Object> emp = q.list();
//		for(Object e:emp) {
//			System.out.println(e);
//		}
		
//		using where clause to get selected data with select with one column it returns Object
//		String query = "select name from employee where id=2";
//		Query q = session.createSQLQuery(query);
//		List<Object> emp = q.list();
//		System.out.println(emp);
		
//		using where clause to get selected data with all columns it returns Object[]
//		String query = "select * from employee where id=2";
//		Query q = session.createSQLQuery(query);
//		List<Object[]> obj = q.list();
//		for(Object[] e:obj) {
//			System.out.println(Arrays.toString(e));
//		}
		
//		String query = "select * from employee order by id ASC";
//		String query = "select * from employee order by id DESC";
//		Query q = session.createSQLQuery(query);
//		List<Object[]>emp = q.list();
//		for(Object[] e:emp) {
//			System.out.println(Arrays.toString(e));
//		}
		
//		using setParameter for dynamic queries
//		String query = "select * from employee where id=:id";
//		Query q = session.createSQLQuery(query);
//		q.setParameter("id", 5);
//		List<Object[]> emp = q.list();
//		Iterator<Object[]> itr = emp.iterator();
//		while(itr.hasNext()) {
//			System.out.println(Arrays.toString(itr.next()));
//		}
		
//		updating the row in database
//		String query = "update employee set name=:n,city=:c where id=:id";
//		Query q = session.createSQLQuery(query);
//		q.setParameter("n", "deadeye");
//		q.setParameter("c", "london");
//		q.setParameter("id", 5);
//		int result = q.executeUpdate();
//		System.out.println(result+" records updated");
		
//		deleting the object from the database
//		String query = "delete from employee where id=:id";
//		Query q = session.createSQLQuery(query);
//		q.setParameter("id", 5);
//		int result = q.executeUpdate();
//		System.out.println(result+" records deleted");
		
//		String query = "insert into employee(id,name,city) values(34,'faiz','bermingham')";
//		Query q = session.createSQLQuery(query);
//		int result = q.executeUpdate();
//		System.out.println(result+" record inserted");
		
//		aggregate methods sum,count,count with distinct,min,max,avg
//		String query = "select sum(id) from employee";
//		String query = "select count(id) from employee";
//		String query = "select count(distinct name) from employee";
//		String query = "select min(id) from employee";
//		String query = "select max(id) from employee";
//		String query = "select avg(id) from employee";
//		Query q = session.createSQLQuery(query);
//		Object result = q.getSingleResult();
//		System.out.println(result);
		
//		pagination using setfirstresult and setmaxresult
//		String query = "select * from employee";
//		Query q = session.createSQLQuery(query);
//		q.setFirstResult(3);
//		q.setMaxResults(1);
//		List<Object[]> emp = q.getResultList();
//		for(Object[] e:emp) {
//			System.out.println(Arrays.toString(e));
//		}
		
		tx.commit();
		session.close();factory.close();
	}
}
