package com.hacknews.scripbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contribute")
public class Contribute {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "id")
	int id;
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	User user;
	
	@ManyToOne
	@JoinColumn(name = "Chllange_id", referencedColumnName = "id")
	Challenge challenge;
	
	
	
	public Contribute() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Contribute(@NotNull int id, User user, Challenge challenge) {
		super();
		this.id = id;
		this.user = user;
		this.challenge = challenge;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Challenge getChallenge() {
		return challenge;
	}

	public void setChallenge(Challenge challenge) {
		this.challenge = challenge;
	}

	@Override
	public String toString() {
		return "Contribute [id=" + id + ", user=" + user + "]";
	}
	
}
