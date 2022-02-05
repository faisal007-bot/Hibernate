//package com.hiber.many;
//
////import java.util.ArrayList;
////import java.util.List;
////
////import org.hibernate.Session;
////import org.hibernate.SessionFactory;
////import org.hibernate.Transaction;
////import org.hibernate.boot.Metadata;
////import org.hibernate.boot.MetadataSources;
////import org.hibernate.boot.registry.StandardServiceRegistry;
////import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
////import org.hibernate.cfg.Configuration;
//
//public class Executor {
//	public static void main(String[] args) {
////		Session session = new Configuration().configure().buildSessionFactory().openSession();
////		Transaction tx = session.beginTransaction();
//		
////		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
////		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
////		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		
////		SessionFactory factory = new Configuration().configure().buildSessionFactory();
////		Session session = new Configuration().configure().buildSessionFactory().openSession();
//		
////		Questions q = new Questions();
////		Answers a1 = new Answers();
////		q.setQid(34);
////		q.setQuestion("features of java?");
////		a1.setAid(33);
////		a1.setAnswer("inheritance");
////		Answers a2 = new Answers();
////		a2.setAid(44);
////		a2.setAnswer("abstraction");
////		List<Answers> answers = new ArrayList<Answers>();
////		answers.add(a1);
////		answers.add(a2);
////		q.setAnswers(answers);
////		a1.setQuestions(q);
////		a2.setQuestions(q);
////		
////		session.save(q);
////		
////		Questions questions = session.get(Questions.class, 34);
////		System.out.println(questions.getQuestion());
////		for(Answers a:questions.getAnswers()) {
////			System.out.println(a.getAnswer());
////		}
//		
////		tx.commit();
////		session.close();
//	}
//}
