package com.ecommerce.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ecommerce")
public class EcommereceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EcommereceMain.class, args);
	}

}
