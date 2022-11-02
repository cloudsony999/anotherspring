package com.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.work.entity.Movie;
import com.work.repository.MovieRepository;

@SpringBootApplication
public class JenkintargetApplication implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(JenkintargetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Movie m1 = new Movie(1, "Predator");
		movieRepository.save(m1);
		Movie m2 = new Movie(2, "Commando");
		movieRepository.save(m2);
		Movie m3 = new Movie(3, "Cobra");
		movieRepository.save(m3);
		Movie m4 = new Movie(4, "Hard Target");
		movieRepository.save(m4);
		System.out.println("---------------all movies created---------------");

	}

}
