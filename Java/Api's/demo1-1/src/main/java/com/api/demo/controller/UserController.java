package com.api.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.example.UserService;
import com.api.demo.model.User;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		List<User> users=new ArrayList<User>();
		users=userService.getAllUser();
		for(User user:users) {
			System.out.println(user.getName());
		}
		return users;
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable("id") int id) {
		User user=new User();
		user=userService.getUser(id);
		return user;
		
	}
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		
		user=userService.saveUser(user);
		return user;
	}
	
	@PutMapping("/users/{id}")
	public User editUser(@PathVariable("id") int id,@RequestBody User user) {
	
		return userService.editUser(id,user);
	}
}

