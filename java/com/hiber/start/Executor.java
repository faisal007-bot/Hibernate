//package com.hiber.start;
//
////import java.io.FileInputStream;
////import java.io.IOException;
////import java.util.Date;
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
////		Student student = new Student();
////		student.setId(45);
////		student.setName("faisal");
////		student.setCity("mumbai");
////		
////		session.save(student);
//		
////		Employee employee = new Employee(34, "sleeping dead", "delhi");
////		session.save(employee);
//		
////		Test t = new Test();
////		t.setId(4);
////		t.setName("dead");
////		t.setNumber(57638d);
////		t.setDate(new Date());
////		try {
////			FileInputStream fis = new FileInputStream("/src/test/img.png");
////			byte[] array = new byte[fis.available()];
////			fis.read(array);
////			t.setImage(array);
////			fis.close();
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
////		session.save(t);		
//		
////		Student student = session.get(Student.class, 45);
////		Student student2 = session.load(Student.class, 45);
////		System.out.println(student);
////		System.out.println(student2);
//		
////		Student s = new Student(34, "deadeye", "jakarta");
////		session.persist(s);
////		Student s2 = new Student(33, "faulty", "abu dhabi");
////		session.save(s2);
//		
//		tx.commit();
//		session.close();
//		factory.close();
//	}
//}
