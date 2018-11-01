package com.qa.buisiness.service;

import javax.inject.Inject;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	@Inject
	private AccountRepository repo;

	public String addAccount(String account) {
		return repo.addAccount(account);
	}

	@Override
	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}

	public String getAccount(Long id) {
		return repo.getAccount(id);

	}

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
}
