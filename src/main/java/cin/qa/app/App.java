package cin.qa.app;

import org.json.JSONObject;

public class App {

	private App () {
		
	}
	
	public static void main(String [] args) {
		
		
		Service s = new Service();
		
		Accounts a1 = new Accounts (101, "Ahmed" , "Osman" , "12345678");
		
		Accounts a2 = new Accounts (102, "Harrison" , "Groome" , "87654321");
		
		s.addAccount(a1);
		s.addAccount(a2);
		
		
	//	s.deleteAccount(102);
		
	//	System.out.println(s.getAccounts());
		
Accounts a3 = new Accounts (103, "Adonay" , "G" , "12345678");
		
		Accounts a4 = new Accounts (104, "Adil" , "O" , "87654321");
		
		s.addAccount(a3);
		s.addAccount(a4);
		
	//	System.out.println(s.getAccounts());
		
		JSONObject json = new JSONObject(Service.accounts);
		
		
		System.out.println(json);
		
	}

			

	

}
