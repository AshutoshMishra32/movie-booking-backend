package com.cg.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.movie.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
