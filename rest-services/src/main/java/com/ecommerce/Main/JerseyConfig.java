package com.ecommerce.Main;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;

import com.ecommerce.rest.other.OtherOperationsRestImpl;
import com.ecommerce.rest.prefill.PrefillRestImpl;

@Named
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
			
		register(OtherOperationsRestImpl.class);
		register(PrefillRestImpl.class);
	}

}
