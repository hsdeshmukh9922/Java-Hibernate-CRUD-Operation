package com.Hibernate_Annotations.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate_Annotations.entity.*;

public class Update {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=con.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction =session.beginTransaction();
		
		
		Customer cust=(Customer)session.get(Customer.class, 53);
		cust.setAge(21);
		
		session.update(cust);
		transaction.commit();
		session.close();
		sessionfactory.close();
		System.out.println("Record updated Successfully");
		
	}
}
