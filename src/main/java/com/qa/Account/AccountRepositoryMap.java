package com.qa.Account;

import java.util.HashMap;

public class AccountRepositoryMap implements AccountRepository{

	
	public HashMap<Integer,Account> map = new HashMap <Integer,Account>();
	public void add (Account account) {
		map.put(account.getId(), account);
	}
	
	public Account retrieve(Integer id) {
		// TODO Auto-generated method stub
		return map.get(id);
	
		
		
		
	
	
	
	
	
	
	
	}

}
