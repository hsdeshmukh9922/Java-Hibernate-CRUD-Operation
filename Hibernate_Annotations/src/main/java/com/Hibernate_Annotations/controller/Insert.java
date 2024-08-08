package com.Hibernate_Annotations.controller;


import com.Hibernate_Annotations.entity.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert 
{
	public static void main(String[] args) 
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = con.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction =session.beginTransaction();
		
		Customer c = new Customer(101,"Hrushikesh","Pachora",21);
		
		Customer c1 = new Customer(102,"Bhushan","Dhule",20);
		
		Customer c2 = new Customer(103,"Sagar","Shirpur",21);
		
		
		session.save(c);
		session.save(c1);
		session.save(c2);

		transaction.commit();
		session.close();
		sessionfactory.close();
		
	}

}
