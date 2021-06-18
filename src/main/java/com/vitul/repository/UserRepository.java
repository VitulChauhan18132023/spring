package com.vitul.repository;

import org.springframework.data.repository.CrudRepository;

import com.vitul.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
