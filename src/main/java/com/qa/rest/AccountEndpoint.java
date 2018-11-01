package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.buisiness.service.AccountService;
import com.qa.business.service.MovieService;
import org.apache.log4j.Logger;

@Path("/account")
public class AccountEndpoint {

	@Inject
	private AccountService service;

	@Path("/getAllMovies")
	@GET
	@Produces({ "application/json" })
	public String getAllMovies() {
		return service.getAllAccounts();
	}

	@Path("/addAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addAccount(account);
	}

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteMovie(@PathParam("id") Long id) {
		return service.deleteAccount(id);
	}
	
	@Path("/getAccount/{id}")
	@GET
	@Produces({ "application/json" })
	public String getMovie(@PathParam("id") Long id) {
		return service.getAccount(id);
	}
	

	public void setService(AccountService service) {
		this.service = service;
	}

}
