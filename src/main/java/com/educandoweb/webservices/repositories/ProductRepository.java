package com.educandoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
