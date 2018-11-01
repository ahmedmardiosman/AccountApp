package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Accounts;
import com.qa.persistence.domain.Movie;
import com.qa.util.JSONUtil;

// Class to add stuff to database

@Transactional(SUPPORTS)
@Default
public class AccountDBRepository implements AccountRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	public String getAllAccounts() {
		Query query = manager.createQuery("Select a FROM Accounts a");
		Collection<Accounts> accounts = (Collection<Accounts>) query.getResultList();
		// Converting Object to JSON
		return util.getJSONForObject(accounts);
	}

	@Override
	@Transactional(REQUIRED)
	public String addAccount(String movie) {
		Accounts aAccount = util.getObjectForJSON(account, Accounts.class);
		manager.persist(aAccount);
		return "{\"message\": \"Account has been sucessfully added\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		Accounts movieInDB = findAccount(id);
		if (movieInDB != null) {
			manager.remove(movieInDB);
		}
		return "{\"message\": \"movie sucessfully deleted\"}";
	}

	private Movie findMovie(Long id) {
		return manager.find(Movie.class, id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	public String getMovie(Long id) {
		Movie movieInDB = findMovie(id);
		return util.getJSONForObject(movieInDB);

	}

}
