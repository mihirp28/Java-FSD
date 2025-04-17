package com.covidapp.countryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapp.countryservice.model.Country;
import com.covidapp.countryservice.model.FavCountry;
import com.covidapp.countryservice.service.ICountryService;


@RestController
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	ICountryService service;
	
	@GetMapping("/{countryName}")
	public Country getCountryInfo(@PathVariable String countryName) {
		return service.getCountryData(countryName);
	}
	
	@GetMapping("/watchlist/{countryName}")
	public FavCountry addToWatchlist(@PathVariable String countryName) {
		return service.addToFavCountry(countryName);
	}
	
	@GetMapping("/watchlist")
	public List<FavCountry> getWatchlist(){
		return service.getWatchlist();
	}
	
}
