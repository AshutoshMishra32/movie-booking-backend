package com.cg.movie.services;

public interface IAdminService {
	
	public boolean checkLogin(String adminEmail,String adminPassword);

	public Long countOfCustomers();

}
