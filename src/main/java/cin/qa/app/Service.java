//package cin.qa.app;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.qa.persistence.domain.Accounts;
//
//public class Service {
//
//	static HashMap<Integer, Accounts> accounts = new HashMap<>();
//
//	public static int duplicatedAccounts(String name) {
//
//		int accs = 0;
//
//		for (int key : accounts.keySet()) {
//
//			if (accounts.get(key).getFirstName().equals(name)) {
//
//				accs++;
//			}
//		}
//		return accs;
//
//	}
//
//	public static int duplicatedAccounts2(String name) {
//
//		return (int) accounts.entrySet().stream().filter(w -> w.getValue().getFirstName().equals(name)).count();
//
//	}
//
//	public static void addAccount(Accounts acc) {
//		accounts.put(acc.getId(), acc);
//
//	}
//
//	public static void deleteAccount(Long id) {
//		accounts.remove(id);
//	}
//
//	public Map<Integer, Accounts> getAccounts() {
//		return accounts;
//	}
//
//}
