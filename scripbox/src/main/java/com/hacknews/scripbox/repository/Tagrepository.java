package com.hacknews.scripbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hacknews.scripbox.model.Tags;

public interface Tagrepository extends JpaRepository<Tags, Integer> {
	@Query(value = "select * from tags where name = :name", nativeQuery = true)
	Tags findByName(@Param(value = "name") String name);

}
