package com.srk.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srk.learning.bean.Movie;
import com.srk.learning.repo.MovieRepository;

@Service
public class Movieservice {

	@Autowired
	private MovieRepository repo;
	
	
	public Movie saveMovie(Movie mv)
	{
		return repo.save(mv);
		
	}
	
}
