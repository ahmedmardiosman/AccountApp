package cin.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	
	static HashMap<Integer , Accounts> accounts = new HashMap<>();
	
	
	
	public static void addAccount(Accounts acc) {
		accounts.put(acc.getId(), acc);
		
	}
	
	public static void deleteAccount(int id) {
		accounts.remove(id);
	}
	
	public Map<Integer,Accounts> getAccounts(){
		return accounts;
	}
	

}
