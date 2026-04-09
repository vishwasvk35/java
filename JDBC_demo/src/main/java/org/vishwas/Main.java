package org.vishwas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Users u1 = new Users();
        u1.setAge(29);
        u1.setName("John");
        u1.setuID(4);

        System.out.println(u1.toString());

        Configuration cnf = new Configuration();
        cnf.addAnnotatedClass(org.vishwas.Users.class); //declare class that acts as schema of database table
        cnf.configure();

        SessionFactory sf = cnf.buildSessionFactory();
        Session session = sf.openSession();

//        create operation
//        Transaction transaction = session.beginTransaction();
//        session.persist(u1);
//        transaction.commit();

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
//        transaction1.commit();

        session.close();
        sf.close();
    }
}