package com.springoauth.model;

import lombok.Data;

@Data
public class User {
	private String id;
	private String name;
    private String email;
    
	public User(String extIdStr, String name, String email) {
		this.id = extIdStr;
		this.name =  name;
		this.email = email;
	}
	public User(String name2) {
		this.name = name2;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
