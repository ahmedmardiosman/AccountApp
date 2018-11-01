package com.qa.buisiness.service;

import javax.inject.Inject;

import com.qa.persistence.repository.MovieRepository;

public class AccountServiceImpl implements AccountService{
	
	@Inject
	private AccountRepository repo;

	public String addAccount(String movie) {
		return repo.addMovie(movie);
	}

	@Override
	public String deleteAccount(Long id) {
		return repo.deleteMovie(id);
	}
	
	public String getAccount(Long id) {
		return repo.getMovie(id);
		
	}
	
	
	
	public String getAllAccounts() {
		return repo.getAllMovies();
	}
	
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
}
