package com.covidapp.watchlistservice.service;

import java.util.List;

import com.covidapp.watchlistservice.model.FavCountry;

public interface ICountryService {

	public FavCountry addCountry(FavCountry country);
	
	public FavCountry getFavCountry(String countryName);
	
	public List<FavCountry> getAllCountries();
	
}
