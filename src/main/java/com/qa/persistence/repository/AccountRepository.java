package com.qa.persistence.repository;

import com.qa.persistence.domain.Accounts;

public interface AccountRepository {

	String getAllAccounts();

	String addAccount(String account);
	
	//String addAccount(Accounts account);
	
	String getAccount(Long id);

	String deleteAccount(Long id);

}
