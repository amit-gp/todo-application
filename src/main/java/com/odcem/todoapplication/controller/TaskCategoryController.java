package com.odcem.todoapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.odcem.todoapplication.service.TaskCategoryService;

public class TaskCategoryController {
	
	@Autowired
	TaskCategoryService taskCategoryService;
	
//	@PostMapping(value = "/users")
//	public ResponseEntity<UserJson> addUser (@RequestBody UserJson userJson) {
//		UserJson responseJson = userService.addUser(userJson);
//		return new ResponseEntity<UserJson>(responseJson, HttpStatus.OK);
//	}
//	
//	@GetMapping(value = "/users/{id}")
//	public ResponseEntity<UserJson> getUser (@PathVariable Integer id) {
//		UserJson responseJson = userService.getUser(id);
//		return new ResponseEntity<UserJson>(responseJson, HttpStatus.OK);
//	}
//	
//	/*
//	 * TODO
//	 */
//	@GetMapping(value = "/users/{id}/details")
//	public ResponseEntity<UserJson> getUserDetails (@PathVariable Integer id) {
//		UserJson responseJson = userService.getUserDetails(id);
//		return new ResponseEntity<UserJson>(responseJson, HttpStatus.OK);
//	}
//	
//	@GetMapping(value = "/users")
//	public ResponseEntity<List<UserJson>> getAllUser () {		
//		List<UserJson> users = userService.getAllUsers();
//		return new ResponseEntity<List<UserJson>>(users, HttpStatus.OK);
//	}
}
