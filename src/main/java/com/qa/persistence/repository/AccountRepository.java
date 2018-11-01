package com.qa.persistence.repository;

public interface AccountRepository {

	String getAllAccounts();

	String addAccount(String account);
		
	String getAccount(Long id);

	String deleteAccount(Long id);

	String updateAccount(Long id, String account);

}
