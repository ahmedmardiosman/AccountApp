package com.qa.buisiness.service;

public interface AccountService {
	
	String getAllAccounts();

	String addAccount(String account);

	String deleteAccount(Long id);
	
	String getAccount(Long id);


}
