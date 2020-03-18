package com.labs.insight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labs.insight.entity.UserEntity;

@Repository
public interface UserResository extends JpaRepository<UserEntity, Long> {

	@Override
	public List<UserEntity> findAll();

	public UserEntity findByName(String name);

}
