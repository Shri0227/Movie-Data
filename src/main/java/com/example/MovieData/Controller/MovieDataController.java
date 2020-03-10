package com.example.MovieData.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieDataController {

	@RequestMapping(value = "/getMovies", method = RequestMethod.GET)
	public List<String> getAllMovies(){
		List<String> movies = new ArrayList<String>();
		movies.add("xyz");
		return movies;
	}
}
