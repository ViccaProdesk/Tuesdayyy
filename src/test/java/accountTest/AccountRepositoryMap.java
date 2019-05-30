package accountTest;

import java.util.HashMap;

import com.qa.Account.Account;

public class AccountRepositoryMap {

	public HashMap<Integer, Account> map = new HashMap<Integer, Account>();

	public void add(Account account) {
		map.put(account.getId(), account);
	}

	public Account retrieve(Integer id) {
		// TODO Auto-generated method stub
		return map.get(id);

	}



}
