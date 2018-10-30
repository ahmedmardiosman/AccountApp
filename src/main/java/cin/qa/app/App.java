package cin.qa.app;

import org.json.JSONObject;

public class App {

	private App() {

	}

	public static void main(String[] args) {

		Service s = new Service();

		Accounts a1 = new Accounts(101, "Ahmed", "Osman", "12345678");

		Accounts a2 = new Accounts(102, "Harrison", "Groome", "87654321");

		s.addAccount(a1);
		s.addAccount(a2);

		// s.deleteAccount(102);

		// System.out.println(s.getAccounts());

		Accounts a3 = new Accounts(103, "Adonay", "G", "45342578");

		Accounts a4 = new Accounts(104, "Adil", "O", "87676521");

		s.addAccount(a3);
		s.addAccount(a4);

		// System.out.println(s.getAccounts());

		// Allows us to convert Hash map to JSON file
		JSONObject json = new JSONObject(Service.accounts.get(102));
		
		System.out.println(json);
		
		JSONObject json2 = new JSONObject(Service.accounts);

		System.out.println(json2);

	}

}
