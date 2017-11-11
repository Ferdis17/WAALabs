package edu.mum.repository;

import java.util.List;

import edu.mum.domain.User;

public interface IUserRepository {
	
	
	public List<User> getAll();
	
	public User findByName(String name);

}
