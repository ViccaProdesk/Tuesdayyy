package com.qa.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountRepisitoryDB implements AccountRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
		
	
	public void add(Account account) {
		em.persist(account);
	}
	public Account retrieve(Integer id) { 
		// TODO Auto-generated method stub
		return em.find(Account.class,id);
		
		
	}
	
	
	

	
	public Account updateFirstName(int id, String newFirstName) {
		et.begin();
		Account account = retrieve(id);
		account.setFirstName(newFirstName);
		et.commit();
		return account;
		
	}
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}
}


