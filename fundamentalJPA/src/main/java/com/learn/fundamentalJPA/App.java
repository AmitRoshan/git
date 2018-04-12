package com.learn.fundamentalJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learn.fundamentalJPA.dto.Account;

/**
 * 
 * @author Amit
 * @date Mar 15, 2018
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
    	EntityManager em = emf.createEntityManager();
    	Account acc = em.find(Account.class, 123);
    	em.remove(acc);
    	em.persist(acc);
    	System.out.println(acc.getName());
        System.out.println( "Hello World!" );
        em.close();
        emf.close();
    }
}
