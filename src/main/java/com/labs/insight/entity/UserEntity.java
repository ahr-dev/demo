package com.labs.insight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

	@Id()
	@Column(name = "id")
	private int id;
	@Column(name = "user")
	private String user;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;

}
