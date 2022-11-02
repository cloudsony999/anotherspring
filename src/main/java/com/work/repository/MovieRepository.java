package com.work.repository;

import org.springframework.data.repository.CrudRepository;

import com.work.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
