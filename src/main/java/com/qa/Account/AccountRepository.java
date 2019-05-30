package com.qa.Account;


public interface AccountRepository {

	public void add(Account account);
public Account retrieve(Integer id);

public Account updateFirstName(int id, String newFirstName);
void remove (int id);
}
