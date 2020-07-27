package com.hacknews.scripbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hacknews.scripbox.model.User;



public interface UserRepository extends JpaRepository<User,Integer> {

	@Query(value = "select * from user where username = :userName", nativeQuery = true)
	public User findByName(@Param(value = "userName") String userName);
	
	@Query(value = "select * from user where id = :id", nativeQuery = true)
	public User findByid(@Param(value = "id") int id);
}
