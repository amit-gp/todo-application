package com.odcem.todoapplication.service;

import java.util.List;

import com.odcem.todoapplication.dtos.UserDto;
import com.odcem.todoapplication.json.UserJson;


public interface UserService {
	
	public UserJson getUser(Integer id);
	
	public List<UserJson> getAllUsers ();
	
	public UserJson addUser (UserJson userJson);
	
	public UserDto updateUser (UserJson userJson, int id);
	
	public UserDto deleteUser (int id);

	public UserJson getUserDetails(Integer id);
}
