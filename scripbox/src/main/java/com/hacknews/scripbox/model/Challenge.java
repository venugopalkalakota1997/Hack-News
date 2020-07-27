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
@Table(name = "challenge")
public class Challenge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "id")
	int id;

	@NotNull
	@Column(name = "title")
	String title;

	@NotNull
	@Column(name = "description")
	String description;

	

	@NotNull
	@Column(name = "upvote")
	int upvote;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	User user;
	@ManyToOne
	@JoinColumn(name = "tag_id", referencedColumnName = "id")
	Tags tags;
	
	
	public Challenge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Challenge(@NotNull int id, @NotNull String title, @NotNull String description, @NotNull Tags tags,
			@NotNull int upvote, User user) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tags = tags;
		this.upvote = upvote;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUpvote() {
		return upvote;
	}

	public void setUpvote(int upvote) {
		this.upvote = upvote;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Challenge [id=" + id + ", title=" + title + ", description=" + description + ", tags=" + tags
				+ ", upvote=" + upvote + ", user=" + user + "]";
	}

}
