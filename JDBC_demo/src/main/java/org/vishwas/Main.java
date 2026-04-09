package org.vishwas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Users u1 = new Users();
        u1.setAge(20);
        u1.setName("vishwas");
//        u1.setuID(1);

        System.out.println(u1.toString());

        Configuration cnf = new Configuration();
        cnf.addAnnotatedClass(org.vishwas.Users.class); //declare class that acts as schema of database table
        cnf.configure();

        SessionFactory sf = cnf.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(u1);
        transaction.commit();

        session.close();
        sf.close();
    }
}