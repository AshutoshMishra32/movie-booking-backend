package com.cg.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.MovieRepository;
import com.cg.movie.entities.Movie;

@Service
public class MovieServiceImpl implements IMovieService {

	@Autowired
	MovieRepository movieRepo;
	
	@Override
	public Movie addMovie(Movie movie) {
		return movieRepo.save(movie);
	}

}
