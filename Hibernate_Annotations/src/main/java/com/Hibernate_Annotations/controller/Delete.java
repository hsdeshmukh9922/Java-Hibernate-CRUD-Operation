package com.Hibernate_Annotations.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate_Annotations.entity.Customer;

public class Delete {
    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        // Retrieve the customer object with ID 103
        Customer cust = (Customer) session.get(Customer.class, 54);
        
        if (cust != null) {
            // Delete the customer object
            session.delete(cust);
        }
        
        // Commit the transaction
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Record deleted");
    }
}
