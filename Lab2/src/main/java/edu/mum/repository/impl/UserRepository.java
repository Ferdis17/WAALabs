package edu.mum.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.mum.database.Database;
import edu.mum.domain.User;
import edu.mum.repository.IUserRepository;

@Repository
public class UserRepository implements IUserRepository{
	
	
	@Autowired
	private Database database;

	@Override
	public List<User> getAll() {
		
		return (List<User>) database.user().values();
	}

	@Override
	public User findByName(String name) {
		
		return database.user().get(name);
	}
	
	
	
	

}
