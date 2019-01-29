package com.ecommerce.rest.prefill;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ecommerce.persistance.Account;
import com.ecommerce.persistance.Inventory;
import com.ecommerce.persistance.Orders;

public interface IPrefillRest {

	@POST
	@Path("/addaccount")
	//@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addAccount(Account account);
	
	@POST
	@Path("/addinventory")
	//@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateInventory(Inventory inventory);
	
	
	
	
}
