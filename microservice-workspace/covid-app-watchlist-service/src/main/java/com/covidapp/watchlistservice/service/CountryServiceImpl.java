package com.covidapp.watchlistservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covidapp.watchlistservice.model.FavCountry;
import com.covidapp.watchlistservice.repository.ICountryRepo;

@Service
public class CountryServiceImpl implements ICountryService {

	@Autowired
	ICountryRepo repo;
	
	@Override
	public FavCountry addCountry(FavCountry country) {
		country.setId(generateId());
		return repo.save(country);
	}
	
	@Override
	public List<FavCountry> getAllCountries() {
		return repo.findAll();
	}
	
	@Override
	public FavCountry getFavCountry(String countryName) {
		return repo.findByCountryName(countryName);
	}
	
	public long generateId() {
		
		double random = Math.random();
		random*=9999999;
		return (long)random;
	}
	
}
