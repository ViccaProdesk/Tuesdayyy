package accountTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.Account.Account;
import com.qa.Account.AccountRepositoryMap;

public class AccountTest {
	Account account;
	
	@Before
	public void setup() {
		
		account = new Account();
	}
	

	@Test
	public void createAccount() {
		
		account.setId(0);
		int id = account.getId();
		assertEquals("Wrong id", 0, id);

	}

	@Test
	public void createAccount2() {
		
	
		account.setFirstName("V");
		String firstName = account.getFirstName();
		assertEquals("Wrong firstname", "V", firstName);

	}

	@Test
	public void createAccount3() {
		
		account.setLastName("KO");
		String lastName = account.getLastName();
		assertEquals("Wrong lastname", "KO", lastName);
	}

	@Test
	public void createAccount4() {
		
		account.setAccountNum(3);
		int accountNum =account.getAccountNum();
		assertEquals("Wrong accountNum", 3, accountNum);
	}

	@Test
	public void accountRepositoryMapTest() {
		AccountRepositoryMap arm = new AccountRepositoryMap();
		
		int id = 2;
		account.setId(id);
		account.setFirstName("V");
		arm.add(account);

		Account retrieved = arm.retrieve(id);

		assertEquals("wrong account retrieved", "V", retrieved.getFirstName());
	}

}
