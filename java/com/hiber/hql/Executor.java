//SQL and HQL all operations can be performed using query
package com.hiber.hql;


//import java.util.Iterator;
//import java.util.List;

//import java.util.Arrays;
//import java.util.List;

//import javax.persistence.criteria.CriteriaUpdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//import org.hibernate.query.Query;

public class Executor {
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Employee e1 = new Employee(45, "sleep", "mumbai");
//		Employee e2 = new Employee(2, "neko", "chennai");
//		Employee e3 = new Employee(3, "cipher", "vegas");
//		Employee e4 = new Employee(4, "dead", "delhi");
//		Employee e5 = new Employee(5, "eye", "jakarta");
//		
//		session.persist(e1);
//		session.persist(e2);
//		session.save(e3);
//		session.save(e4);
//		session.save(e5);
		
//		selecting all the objects from the database using from clause
//		Query q = session.createQuery("from Employee");
//		list and getresultlist methods are used to get multiple objects
//		List <Employee> employees = q.getResultList();
//		for(Employee e:employees) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getCity());
//		}
		
//		selecting single object from the database using where clause
//		Query q =session.createQuery("from Employee where id=2");
//		Employee e = (Employee)q.getSingleResult();
//		System.out.println(e);
		
//		from clause is used to select all the objects present in the database
//		String query1 = "from Employee";
//		Query q1 = session.createQuery(query1);
//		list() and getresultlist() method is used to get the multiple results or objects from database
//		List<Employee> list = q1.list();
//		List<Employee>emp = q1.getResultList();
//		for(Employee e:list) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getCity());
//		}
		
//		where clause to get the object where condition is satisfied
//		String query = "from Employee as E where E.id=2";
//		Query q = session.createQuery(query);
//		List<Employee> emp = q.list();
//		for(Employee e:emp) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getCity());
//		}
		
//		as clause is used to create the aliases
//		select clause is use to get particular column from the database it returns object for single property
//		if multiple columns are recieved then we get Object[] so we need to use the Arrays.toString method
//		String query = "select name,id from Employee";
//		String query = "select name from Employee";
		
//		Query q = session.createQuery(query);
		
//		List<Object[]>resultList = q.getResultList();
//		List<Object>resultList = q.getResultList();
		
//		for(Object[] e:resultList) {
//		for(Object e:resultList) {
			
//			System.out.println(Arrays.toString(e));
//			System.out.println(e);
//		}
		
//		using where clause with select clause it also returns object for single property
//		it returns object[] if we are accessing multiple properties
//		String query = "select e.id,e.name from Employee as e where city='mumbai'";
//		Query q = session.createQuery(query);
//		List<Object[]> emps = q.list();
//		for(Object[] e:emps) {
//			System.out.println(Arrays.toString(e));
//		}
		
//		String query = "select e.id from Employee as e where city='mumbai'";
//		Query q = session.createQuery(query);
//		List<Object> emps = q.list();
//		for(Object e:emps) {
//			System.out.println(e);
//		}
		
		
//		getting records using order by asc and desc to get the object
//		String query = "from Employee as e ORDER BY e.city ASC";
//		String query = "from Employee as e ORDER BY e.city DESC";
//		Query q = session.createQuery(query);
//		List<Employee> emp = q.list();
//		for(Employee e:emp) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getCity());
//		}
		
//		using : to pass the value dynamically we need to use the setParameter of query to pass the value dynamically
//		String query = "select e.name , e.city from Employee as e where id=:i";
//		Query q = session.createQuery(query);
//		q.setParameter("i", 4);
//		List<Object[]> emp = q.list();
//		for(Object[] e:emp) {
//			System.out.println(Arrays.toString(e));
//		}
		
//		updating the row inside the database 
//		we need to call the executeUpdate method of query
//		String query = "update Employee as e set e.name=:n,e.city=:c where id=:i";
//		Query q = session.createQuery(query);
//		q.setParameter("n", "faulty");
//		q.setParameter("c", "abu dhabi");
//		q.setParameter("i", 4);
//		int result = q.executeUpdate();
//		System.out.println(result+" record updated");
		
//		deleting object from the database
//		String query = "delete from Employee where id=:id";
//		Query q = session.createQuery(query);
//		q.setParameter("id", 4);
//		int result = q.executeUpdate();
//		System.out.println(result+" record deleted");
		
//		ditinct in used to get the different values of the column only
//		String query = "select distinct(e.name) from Employee as e";
//		Query q = session.createQuery(query);
//		List<Object> emp = q.list();
//		for(Object e:emp) {
//			System.out.println(e);
//		}
		
//		count min max avg sum distinct
//		String query = "select sum(e.id) from Employee as e";
//		String query = "select min(e.id) from Employee as e";
//		String query = "select max(e.id) from Employee as e";
//		String query = "select avg(e.id) from Employee as e";
//		String query = "select count(e.id) from Employee as e";
//		String query = "select count(distinct e.name) from Employee as e";
//		String query = "select distinct e.name from Employee as e";
//		Query q = session.createQuery(query);
//		List<Object>  count = q.list();
//		System.out.println(count);
		
//		getsingleresult and uniqueresult is used to get single object
//		String query = "from Employee where id=2";
//		Query q = session.createQuery(query);
//		Object obj = q.uniqueResult();
//		Object obj = q.getSingleResult();
//		System.out.println(obj);
		
		
//		setting first result and max result is used to control the number of objects we get from 
//		the database
//		String query = "from Employee";
//		Query q = session.createQuery(query);
//		q.setFirstResult(2);
//		q.setMaxResults(2);
//		List<Employee> emp = q.list();
//		Iterator<Employee> itr = emp.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		tx.commit();
		session.close();
		factory.close();
	}
}
