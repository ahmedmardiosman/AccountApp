package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.MovieService;

import cin.qa.app.AccountsService;

import org.apache.log4j.Logger;

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
