package com.productOfRome;

import com.productOfRome.dataobjects.Node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductOfRomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductOfRomeApplication.class, args);
	}

	@Bean
	public Node nodeString() {
		return new Node();
	}

}
