package com.ecommerce.rest.other;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.ecommerce.persistance.Orders;
import com.ecommerce.repository.MongoRepository;

@Named
@Path("/ecomm")
public class OtherOperationsRestImpl implements IOtherOperatiosRest{
	
	@Inject
	MongoRepository mongoRepository;

	//To get list of Item Available
	
	@Override
	public Response getInventory() {
		// TODO Auto-generated method stub
		System.out.println("I m here");
		return Response.ok(mongoRepository.getAll()).build();
	}

	//To place a order(It will check in inventory whether product is available or not,if available 
	// order will be placed and Order & Inventory will get updated)
	
	@Override
	public Response placeOrder(Orders order) {
		// TODO Auto-generated method stub
		if(mongoRepository.isProductAvailable(order.getProduct())) {
			mongoRepository.addOrder(order);
			mongoRepository.decrementInventory(order.getProduct());
			return Response.ok("Order is placed").build();
		}
		else
			return Response.ok("Order can't be placed").build();
		
		
	}

}
