package com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.entity.Movie;
import com.work.repository.MovieRepository;

@RestController
public class MovieController {
	@Autowired
	private MovieRepository movieRepository;

	@GetMapping("/movies")
	public Iterable<Movie> getAllMovies() {

		return movieRepository.findAll();
	}

}
