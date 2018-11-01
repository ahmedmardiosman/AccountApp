package com.qa.persistence.repository;

import java.util.HashMap;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.persistence.domain.Accounts;
import com.qa.util.JSONUtil;

@Alternative
public class Service implements AccountRepository {

	@Inject
	private JSONUtil util;
	
	private static HashMap<Long, Accounts> accounts = new HashMap<>();

	

//	public static int duplicatedAccounts(String name) {
//
//		int accs = 0;
//
//		for (Long key : accounts.keySet()) {
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

	@Override
	public String getAllAccounts() {

		return accounts.toString();
	}

	@Override
	public String addAccount(String account) {

		Accounts acc = util.getObjectForJSON(account, Accounts.class);
		accounts.put(acc.getId(), acc);
		return "{\"message\": \"Account has been sucessfully added\"}";
	}

	@Override
	public String deleteAccount(Long id) {
		accounts.remove(id);
		return "{\"message\": \"Account sucessfully deleted\"}";
	}

	@Override
	public String getAccount(Long id) {
		return accounts.get(id).toString();
	}

	public static HashMap<Long, Accounts> getAccounts() {
		return accounts;
	}

	public static void setAccounts(HashMap<Long, Accounts> accounts) {
		Service.accounts = accounts;
	}

}
