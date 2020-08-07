package com.cg.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.TheatreRepository;
import com.cg.movie.entities.Theatre;

@Service
public class TheatreServiceImpl implements ITheatreService {

	@Autowired
	TheatreRepository theatreRepo;
	
	@Override
	public Theatre addTheatre(Theatre theatre) {
		return theatreRepo.save(theatre);
	}

}
