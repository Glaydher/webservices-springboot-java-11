package com.educandoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
