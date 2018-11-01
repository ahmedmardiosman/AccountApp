//package accountapp;
//
//import javax.inject.Inject;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.qa.persistence.domain.Accounts;
//import com.qa.persistence.repository.Service;
//import com.qa.util.JSONUtil;
//
//public class AccountAppTest {
//
//	@Before
//	public void beforeFunction() {
//		
//		JSONUtil util =  new JSONUtil();
//
//		Accounts a1 = new Accounts((long) 1, "Ahmed", "Osman", "12345678");
//
//		Accounts a2 = new Accounts((long) 2, "Harrison", "Groome", "87654321");
//
//		Accounts a3 = new Accounts((long) 3, "Adonay", "G", "45342578");
//
//		Accounts a4 = new Accounts((long) 4, "Ahmed", "O", "87676521");
//
//		Service s = new Service();
//		
//		s.addAccount(util.getJSONForObject(a1));
//		s.addAccount(util.getJSONForObject(a2));
//
//		// s.deleteAccount(102);
//
//		// System.out.println(s.getAccounts());
//
//		s.addAccount(util.getJSONForObject(a3));
//		s.addAccount(util.getJSONForObject(a4));
//
//
//	}
//
//	@Test
//	public void test() {
//
//		int actual = Service.duplicatedAccounts("Ahmed");
//
//		//Assert.assertEquals(2, actual);
//
//	}
//	
//	@Test
//	public void test2() {
//
//		int actual = Service.duplicatedAccounts2("Ahmed");
//
//		//Assert.assertEquals(2, actual);
//
//	}
//
//}
