package com.ecommerce.repository;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.ecommerce.persistance.Account;
import com.ecommerce.persistance.Inventory;
import com.ecommerce.persistance.Orders;
import com.ecommerce.persistance.Products;


@Named
public class MongoRepository {
	
	@Inject
	MongoOperations mongoOperation;
	
	public int saveAccount(Account account) {
		System.out.println("Inside saveAccount");
		try {
			System.out.println("Inside try");
			mongoOperation.save(account);
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		return 1;
	}
	
	public void updateInventory(Inventory inventory) {
		
		Query query=new Query(Criteria.where("product.productCode").is(inventory.getProduct().getProductCode()));
		Update update=new Update();
		update.inc("quantityLeft", inventory.getQuantityLeft());
		update.set("lastUpdatedTime", new Date()+"");
		update.set("product", inventory.getProduct());
		mongoOperation.upsert(query, update, Inventory.class);
		
	}
	public List<Inventory> getAll(){
		return  mongoOperation.findAll(Inventory.class);
	}

	public boolean isProductAvailable(Products product) {
		// TODO Auto-generated method stub
		Query query=new Query(Criteria.where("product.productCode").is(product.getProductCode()).and("quantityLeft").gt(0));
		List<Inventory> inv=mongoOperation.find(query,Inventory.class);
		if(!inv.isEmpty())
			return true;
		else 
			return false;
	}

	public void addOrder(Orders order) {
		// TODO Auto-generated method stub
		mongoOperation.save(order);
		
	}

	public void decrementInventory(Products product) {
		// TODO Auto-generated method stub
		Query query=new Query(Criteria.where("product.productCode").is(product.getProductCode()));
		Update update= new Update();
		update.set("product",product);
		update.set("lastUpdatedTime",new Date());
		update.inc("quantityLeft", -1);
		mongoOperation.updateFirst(query, update, Inventory.class);
		
	}

}
