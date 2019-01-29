package com.ecommerce.rest.other;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ecommerce.persistance.Account;
import com.ecommerce.persistance.Orders;


public interface IOtherOperatiosRest {
	
	@GET
	@Path("/listinventory")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInventory();
	
	@POST
	@Path("/placeorder")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response placeOrder(Orders account);

	

}
