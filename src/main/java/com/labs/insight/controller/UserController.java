package com.labs.insight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labs.insight.service.UserService;

@RestController
@RequestMapping(path = "/insight/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService uService;

	@RequestMapping(path = "/getUsers/")
	public ResponseEntity<?> getUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(uService.getUsers());

	}

}
