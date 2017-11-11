package edu.mum.service;

import java.util.List;

import edu.mum.domain.User;

public interface IUserService {

	public List<User> getAll();

	public User findByName(String name);

}
