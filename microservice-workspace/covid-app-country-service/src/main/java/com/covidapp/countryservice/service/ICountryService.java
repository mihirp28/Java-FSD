package com.covidapp.countryservice.service;

import java.util.List;

import com.covidapp.countryservice.model.Country;
import com.covidapp.countryservice.model.FavCountry;

public interface ICountryService {

	public Country getCountryData(String country);
	public FavCountry addToFavCountry(String countryName);
	public List<FavCountry> getWatchlist();
}
