package com.hacknews.scripbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hacknews.scripbox.ResponseTransfer;
import com.hacknews.scripbox.execption.AlreadyContributed;
import com.hacknews.scripbox.execption.ChallengeAlreadyExistsException;
import com.hacknews.scripbox.model.Challenge;
import com.hacknews.scripbox.model.Contribute;
import com.hacknews.scripbox.model.Tags;
import com.hacknews.scripbox.model.User;
import com.hacknews.scripbox.service.Challengeservice;

@RestController
@RequestMapping("/challenge")
@CrossOrigin("http://localhost:4200")
public class Challangecontroller {
	@Autowired
	private Challengeservice challengeservice;

	@GetMapping("/all")
	public List<Challenge> getAllChallenges() {
		return challengeservice.getAllChallenges();
	}

	@GetMapping("/tags")
	public List<Tags> getAllTags() {
		return challengeservice.getAllTags();
	}

	@PostMapping("/create")
	public ResponseTransfer createQuiz(@RequestBody Challenge challenge) throws ChallengeAlreadyExistsException {
		System.err.println(challenge);
		return challengeservice.createQuiz(challenge);
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable String id) {
		System.err.println(id);
		return challengeservice.getUser(id);
	}

	@PutMapping("/upvote/{id}")
	public ResponseTransfer upVote(@PathVariable int id) {

		return challengeservice.upVote(id);
	}

	@PostMapping("/contribute/{callengeid}/{userid}")
	public ResponseTransfer contribute(@PathVariable String userid, @PathVariable int callengeid)
			throws AlreadyContributed {

		return challengeservice.contribute(userid, callengeid);
	}

	@GetMapping("/tags/{tagname}")
	public List<Challenge> sortByTag(@PathVariable String tagname) {
		return challengeservice.sortByTag(tagname);
	}

	@GetMapping("/recent")
	public List<Challenge> sortByDate() {
		return challengeservice.sortByDate();
	}

	@GetMapping("/mychallenges/{id}")
	public List<Contribute> myChallenges(@PathVariable String id) {
		return challengeservice.myChallenges(id);
	}
}
