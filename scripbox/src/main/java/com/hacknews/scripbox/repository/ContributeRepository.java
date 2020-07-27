package com.hacknews.scripbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hacknews.scripbox.model.Contribute;
@Repository
public interface ContributeRepository extends JpaRepository<Contribute, Integer> {
	@Query(value = "select * from contribute where chllange_id = :callengeid", nativeQuery = true)
	Contribute findByChallengeId(@Param(value = "callengeid") int callengeid);
	
	@Query(value = "select * from contribute where user_id = :userid", nativeQuery = true)
	List<Contribute> myChallenges(@Param(value = "userid") int userid);

}
   