package com.labs.insight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labs.insight.entity.UserEntity;
import com.labs.insight.repository.UserResository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserResository userRepo;

	@Override
	public List<UserEntity> getUsers() {
		// TODO Auto-generated method stub

		return userRepo.findAll();
	}

}
