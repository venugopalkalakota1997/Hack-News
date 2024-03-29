package com.hacknews.scripbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {
	@Id

	@NotNull
	@Column(name = "id")
	int id;

	@NotNull
	@Column(name = "username")
	String userName;

	@NotNull
	@Column(name = "password")
	String password;

	@NotNull
	@Column(name = "first_name")
	String firstName;

	@NotNull
	@Column(name = "last_name")
	String lastName;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(@NotNull int id, @NotNull String userName, @NotNull String password, @NotNull String firstName,
			@NotNull String lastName) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	
}
