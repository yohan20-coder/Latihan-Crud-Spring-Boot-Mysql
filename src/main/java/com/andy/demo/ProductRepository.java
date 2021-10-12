package com.andy.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {				//product nama tabel dan long tipe data id primary key
	
	

}
