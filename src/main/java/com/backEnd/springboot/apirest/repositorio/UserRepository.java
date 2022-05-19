package com.backEnd.springboot.apirest.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.backEnd.springboot.apirest.entity.User;


public interface UserRepository extends CrudRepository<User,Integer>{

}
