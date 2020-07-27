package com.hacknews.scripbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacknews.scripbox.ResponseTransfer;
import com.hacknews.scripbox.execption.AlreadyContributed;
import com.hacknews.scripbox.execption.ChallengeAlreadyExistsException;
import com.hacknews.scripbox.model.Challenge;
import com.hacknews.scripbox.model.Contribute;
import com.hacknews.scripbox.model.Tags;
import com.hacknews.scripbox.model.User;
import com.hacknews.scripbox.repository.ChallengeRepository;
import com.hacknews.scripbox.repository.ContributeRepository;
import com.hacknews.scripbox.repository.Tagrepository;
import com.hacknews.scripbox.repository.UserRepository;


@Service
public class Challengeservice {
	@Autowired
	private ChallengeRepository challengeRepository;
	@Autowired
	private Tagrepository tagrepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ContributeRepository contributeRepository;
	public List<Challenge> getAllChallenges() {
		// TODO Auto-generated method stub
		return challengeRepository.findAll();
	}
	public List<Tags> getAllTags() {
		// TODO Auto-generated method stub
		return tagrepository.findAll();
	}
	public ResponseTransfer createQuiz(Challenge challenge) throws ChallengeAlreadyExistsException {
		// TODO Auto-generated method stub
		Challenge challenge1=challengeRepository.findByName(challenge.getTitle());
		System.err.println(challenge.getUser());
		if (challenge1 != null) {
			throw new ChallengeAlreadyExistsException();
		}
		else {
			System.err.println(challenge);
			
			challengeRepository.save(challenge);
			return new ResponseTransfer("Quiz Created successfully");
		}
	}
	public User getUser(String id) {
		
		int userid=Integer.parseInt(id);
		return userRepository.findByid(userid);
	}
	public ResponseTransfer upVote(int id) {
		Challenge challenge=challengeRepository.findByid(id);
		challenge.setUpvote(challenge.getUpvote()+1);
		challengeRepository.save(challenge);
		return new ResponseTransfer("upvoted successfully");
	}
	public ResponseTransfer contribute(String userid, int callengeid) throws AlreadyContributed  {
		int userid1=Integer.parseInt(userid);
		User user=userRepository.findByid(userid1);
		Challenge challenge=challengeRepository.findByid(callengeid);
		Contribute contribute1=contributeRepository.findByChallengeId(callengeid);
		if (contribute1==null) {
			Contribute contribute=new Contribute(0, user, challenge);
            contributeRepository.save(contribute);
			return new ResponseTransfer("contributed successfully");
		}
		else if (contribute1.getUser().equals(user)){
			throw new AlreadyContributed();
		}
		return new ResponseTransfer("contributed successfully");

	}
	public List<Challenge> sortByTag(String tagname) {
		Tags tags=tagrepository.findByName(tagname);
		
		return challengeRepository.findByTagId(tags.getId());
	}
	public List<Challenge> sortByDate() {
		// TODO Auto-generated method stub
		return challengeRepository.sortByDate();
	}
	public List<Contribute> myChallenges(String id) {
		int userid1=Integer.parseInt(id);
		//User u=userRepository.getOne(userid1);
		return contributeRepository.myChallenges(userid1);
	}

}
