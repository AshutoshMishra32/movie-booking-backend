package com.cg.movie.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.movie.dao.CityRepository;
import com.cg.movie.entities.City;

public class CityServiceImpl implements ICityService {

	@Autowired
	CityRepository cityRepo;
	
	@Override
	public City addCity(City city) {
		return cityRepo.save(city);
	}

}
