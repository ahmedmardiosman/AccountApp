package cin.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {

	static HashMap<Integer, Accounts> accounts = new HashMap<>();

	public static int duplicatedAccounts(String name) {

		int accs = 0;

		for (int key : accounts.keySet()) {

			if (accounts.get(key).getFirstName().equals(name)) {

				accs++;
			}
		}
		return accs;

	}

	public static void addAccount(Accounts acc) {
		accounts.put(acc.getId(), acc);

	}

	public static void deleteAccount(int id) {
		accounts.remove(id);
	}

	public Map<Integer, Accounts> getAccounts() {
		return accounts;
	}

}
