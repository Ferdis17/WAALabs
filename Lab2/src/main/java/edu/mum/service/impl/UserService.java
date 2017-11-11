package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.User;
import edu.mum.repository.IUserRepository;
import edu.mum.service.IUserService;

@Service

public class UserService implements IUserService {
	
	@Autowired
	private IUserRepository userRepo;
	

	@Override
	public List<User> getAll() {
		
		return userRepo.getAll();
	}

	@Override
	public User findByName(String name) {
		
		return userRepo.findByName(name);
	}

}
