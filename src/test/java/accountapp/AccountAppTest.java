//package accountapp;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.qa.persistence.domain.Accounts;
//
//import cin.qa.app.Service;
//
//public class AccountAppTest {
//
//	@Before
//	public void beforeFunction() {
//
//		Accounts a1 = new Accounts(101, "Ahmed", "Osman", "12345678");
//
//		Accounts a2 = new Accounts(102, "Harrison", "Groome", "87654321");
//
//		Accounts a3 = new Accounts(103, "Adonay", "G", "45342578");
//
//		Accounts a4 = new Accounts(104, "Ahmed", "O", "87676521");
//
//		Service s = new Service();
//
//		s.addAccount(a1);
//		s.addAccount(a2);
//		s.addAccount(a3);
//		s.addAccount(a4);
//
//	}
//
//	@Test
//	public void test() {
//
//		int actual = Service.duplicatedAccounts("Ahmed");
//
//		Assert.assertEquals(2, actual);
//
//	}
//	
//	@Test
//	public void test2() {
//
//		int actual = Service.duplicatedAccounts2("Ahmed");
//
//		Assert.assertEquals(2, actual);
//
//	}
//
//}
