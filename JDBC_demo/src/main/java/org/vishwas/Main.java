package org.vishwas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address();
        a1.setAid(4);
        a1.setStreet("mk street");
        a1.setArea("new Hampshire");
        a1.setCity("london");

        Users u1 = new Users();
        u1.setAge(87);
        u1.setName("steve");
        u1.setuID(7);
        u1.setAddress(a1);

        System.out.println(u1.toString());

        Configuration cnf = new Configuration();
        cnf.configure();
        cnf.addAnnotatedClass(org.vishwas.Users.class); //declare class that acts as schema of database table
        cnf.addAnnotatedClass(org.vishwas.Address.class);

        SessionFactory sf = cnf.buildSessionFactory();
        Session session = sf.openSession();

//        create operation
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        session.persist(u1);
        transaction.commit();

//        get operation
//        Users u2 = session.find(Users.class, 2);
//        System.out.println(u2);

//        update operation
//        Transaction transaction = session.beginTransaction();
//        session.merge(u1);
//        transaction.commit();

//        delete operation
//        Transaction transaction1 = session.beginTransaction();
//        session.remove(u1);
//        session.remove(a1);
//        transaction1.commit();

        session.close();
        sf.close();
    }
}