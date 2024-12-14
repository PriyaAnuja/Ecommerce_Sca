package com.ecommerce.ecommerce_scaler;

import com.ecommerce.ecommerce_scaler.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceScalerApplication {

	public static void main(String[] args) {

		SpringApplication.run(EcommerceScalerApplication.class, args);

		Product p = new Product();
		p.setTitle("MacBook");
	}

}
