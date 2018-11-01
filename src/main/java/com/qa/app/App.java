package com.qa.app;

import org.json.JSONObject;

import com.qa.persistence.domain.Accounts;
import com.qa.persistence.repository.Service;
import com.qa.util.JSONUtil;

public class App {
	
	
	
	private App() {

	}

	public static void main(String[] args) {
		
		JSONUtil util = new JSONUtil();
		
		
		Service s = new Service();

		Accounts a1 = new Accounts((long) 1, "Ahmed", "Osman", "12345678");

		Accounts a2 = new Accounts((long) 2, "Harrison", "Groome", "87654321");
		
		System.out.println(util.getJSONForObject(a1));
		s.addAccount(util.getJSONForObject(a1));
		s.addAccount(util.getJSONForObject(a2));

		// s.deleteAccount(102);

		// System.out.println(s.getAccounts());

		Accounts a3 = new Accounts((long) 3, "Adonay", "G", "45342578");

		Accounts a4 = new Accounts((long) 4, "Ahmed", "O", "87676521");

		s.addAccount(util.getJSONForObject(a3));
		s.addAccount(util.getJSONForObject(a4));

		// System.out.println(s.getAccounts());

		// Allows us to convert Hash map to JSON file
		JSONObject json = new JSONObject(Service.getAccounts().get(2));
		
		System.out.println(json);
		
		JSONObject json2 = new JSONObject(Service.getAccounts());

		System.out.println(json2);

	}

}
