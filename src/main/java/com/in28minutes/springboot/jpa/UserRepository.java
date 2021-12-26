package com.in28minutes.springboot.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends   CrudRepository<User, Long> {

}
