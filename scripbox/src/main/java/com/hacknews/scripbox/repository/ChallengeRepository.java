package com.hacknews.scripbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hacknews.scripbox.model.Challenge;


public interface ChallengeRepository extends JpaRepository<Challenge, Integer> {
	@Query(value = "select * from challenge where title = :title", nativeQuery = true)
	Challenge findByName(@Param(value = "title") String title);

	@Query(value = "select * from challenge where id = :id", nativeQuery = true)
	Challenge findByid(@Param(value = "id") int id);
	
	@Query(value = "select * from challenge where tag_id = :tagid", nativeQuery = true)
	List<Challenge> findByTagId(@Param(value = "tagid") int tagid);
	
	@Query(value = "select * from challenge ORDER BY id DESC", nativeQuery = true)
	List<Challenge> sortByDate();
	
	
}
