package cin.qa.app;

public class app {
	
	
	public static void main(String [] Args) {
		
		
		Service s = new Service();
		
		Accounts a1 = new Accounts (101, "Ahmed" , "Osman" , "12345678");
		
		Accounts a2 = new Accounts (102, "Harrison" , "Groome" , "87654321");
		
		s.addAccount(a1);
		s.addAccount(a2);
		
		
		s.deleteAccount(102);
		
		System.out.println(s.getAccounts());
		
		
		
	}

}
