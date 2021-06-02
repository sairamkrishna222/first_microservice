package com.srk.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srk.learning.bean.HomePage;
import com.srk.learning.bean.Movie;
import com.srk.learning.service.Movieservice;

@RestController
@RequestMapping("/movie")
public class FirstRestController {

	@Autowired
	private Movieservice serv;
	
	
	@RequestMapping(method = RequestMethod.GET,path ="/homepage")
	public HomePage gethomepage()
	{
		return new  HomePage("My HomePage");
		
	}
	
	@PostMapping(path = "/savemovie")
	public ResponseEntity<Movie> postsavedata(@RequestBody Movie mv)
	{
		Movie mm =null;
		if(mv != null && !mv.getMovieName().isEmpty())
		{
			mm=serv.saveMovie(mv);
		}
		return new ResponseEntity<Movie>(mv,HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/getmovies")
	public ResponseEntity<List<Movie>> getMovielist()
	{
		return new ResponseEntity<List<Movie>>(serv.getmovielist(),HttpStatus.OK);
	}
	
}
	