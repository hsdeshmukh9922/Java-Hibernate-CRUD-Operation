package com.Hibernate_Annotations.controller;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Hibernate_Annotations.entity.*;

public class Read {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = con.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from Customer");
		List<Customer>customer=query.list();
		
		for(Customer cust:customer) {
			System.out.println("cid "+cust.getCid());
			System.out.println("cname "+cust.getCname());
			System.out.println("address "+cust.getAddress());
			System.out.println("age "+cust.getAge());

			System.out.println("---------------------------");
		}
		session.close();
		sessionfactory.close();
		System.out.println("Record retrived successfully");
	}
}
