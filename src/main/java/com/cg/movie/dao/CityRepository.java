package com.cg.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.movie.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
