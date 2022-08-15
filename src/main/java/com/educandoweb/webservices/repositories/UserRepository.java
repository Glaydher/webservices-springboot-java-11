package com.educandoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
