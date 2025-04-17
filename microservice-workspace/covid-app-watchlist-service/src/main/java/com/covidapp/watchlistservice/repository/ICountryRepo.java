package com.covidapp.watchlistservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.covidapp.watchlistservice.model.FavCountry;

public interface ICountryRepo extends MongoRepository<FavCountry, Long> {

	FavCountry findByCountryName(String countryName);
	
}
