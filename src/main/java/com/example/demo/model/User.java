package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "User")
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int useID;

	private String userName;

	private String password;

	public int getUseID() {
		return useID;
	}

	public void setUseID(int useID) {
		this.useID = useID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
