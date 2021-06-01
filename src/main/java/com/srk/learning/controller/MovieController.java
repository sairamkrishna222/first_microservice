package com.srk.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srk.learning.bean.Movie;
import com.srk.learning.service.Movieservice;

@RestController
@RequestMapping(path = "/movie")
public class MovieController {

	@Autowired
	private Movieservice mvser;
	
	@PostMapping(path = "/save")
	public ResponseEntity<Movie> saveMovietolist( Movie mv)
	{
		Movie mymv =null;
		if(mv != null && mv.getMovieName() != null && !mv.getMovieName().isEmpty())
		{
			mymv=mvser.saveMovie(mv);
		}
			return new ResponseEntity<Movie>(mymv, HttpStatus.CREATED);
	}
 	
	 
}
