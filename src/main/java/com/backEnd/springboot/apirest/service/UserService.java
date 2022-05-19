package com.backEnd.springboot.apirest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backEnd.springboot.apirest.repositorio.UserRepository;
import com.backEnd.springboot.apirest.entity.User;
@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository userRepo;
	public void save(User user){
		userRepo.save(user);
	}

}
