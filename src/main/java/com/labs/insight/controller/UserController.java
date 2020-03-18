package com.labs.insight.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labs.insight.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
public class UserController {

	private final UserRepository userRepo;

	public UserController(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@GetMapping(path = "/getUsers")
	public ResponseEntity<?> getUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(userRepo.findAll());
	}

}
