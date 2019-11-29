package com.itways.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itways.demo.models.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Chetan", "9988776655", "priya@brata.pati"));
		users.add(new User(2, "Priyabrata", "9988776633", "chetan@priya.brata"));
		users.add(new User(3, "Priyabrata Pati", "8877663344", "pati@brata.priya"));
		return users;
	}
	
	@PostMapping
	public User addNewUser(User user) {
		return user;
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable("id") int id) {
		return new User(id, "Chetan", "9988776655", "priya@brata.pati");
	}
	
}
