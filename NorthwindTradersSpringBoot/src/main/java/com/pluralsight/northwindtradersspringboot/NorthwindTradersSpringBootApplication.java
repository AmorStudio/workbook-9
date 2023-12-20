package com.pluralsight.northwindtradersspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication implements CommandLineRunner {
@Autowired
ProductDao productDao;
	public static void main(String[] args) {

		SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		productDao.add(new Product(23,"Cocao","Food",4));
		productDao.add(new Product(23,"milk","Food",6));

		System.out.println(productDao.getAll());
	}
}
