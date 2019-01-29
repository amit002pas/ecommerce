package com.ecommerce.persistance;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection=PersistanceConstant.COLLECTION_ACCOUNTS)
public class Account {

	private String name;
	
	//To have unique user
	@Indexed(unique=true)
	private String username;
	private String password;
	private Long registeredMobile;
	private String emailID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getRegiteredMobile() {
		return registeredMobile;
	}
	public void setRegiteredMobile(Long regiteredMobile) {
		this.registeredMobile = regiteredMobile;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", username=" + username + ", password=" + password + ", regiteredMobile="
				+ registeredMobile + ", emailID=" + emailID + "]";
	}
	
	
}
