package com.jfsaaved.domain;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Author {

	private BigInteger id;
	private String firstName;
	private String lastName;
	private String email;
	
	@DBRef
	private List<Post> posts;
	
	public Author() {
		
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
