package com.educandoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
