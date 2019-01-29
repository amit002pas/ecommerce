package com.ecommerce.rest.prefill;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.data.mongodb.core.MongoOperations;

import com.ecommerce.persistance.Account;
import com.ecommerce.persistance.Inventory;
import com.ecommerce.repository.MongoRepository;

@Named
@Path("/ecommerce")
public class PrefillRestImpl implements IPrefillRest {
	
	@Inject
	MongoRepository mongoRepository;

	/*To add new user,if username already exist  then not allowed 
	else new entry will be made to Account collection  
	*/
	@Override
	public Response addAccount(Account account) {
		System.out.println("Inside addAccount");
		int status=mongoRepository.saveAccount(account);
		if(status==0)
			return Response.ok("Account Already Exist").build();
		else
			return Response.ok("Account Created Successfully!!").build();	
	}

	// To add list in inventory
	
	@Override
	public Response updateInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		mongoRepository.updateInventory(inventory);
		return Response.ok("Added Successfully!!!").build();
	}


}
