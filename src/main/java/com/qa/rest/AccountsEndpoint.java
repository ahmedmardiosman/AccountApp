package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import cin.qa.app.AccountsService;



@Path("/accounts")
public class AccountsEndpoint {

	@Inject
	private AccountsService service;

	@Path("/getAllMovies")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllAccounts();
	}

	public void setService(AccountsService service) {
		this.service = service;
	}

}
