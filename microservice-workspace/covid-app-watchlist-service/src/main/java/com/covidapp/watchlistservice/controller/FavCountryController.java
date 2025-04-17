package com.covidapp.watchlistservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapp.watchlistservice.model.FavCountry;
import com.covidapp.watchlistservice.service.ICountryService;

@RestController
@RequestMapping("/watchlists")
public class FavCountryController {
	
	@Autowired
	private ICountryService service;

	@PostMapping("/favcountry")
	public FavCountry addFavCountry(@RequestBody FavCountry country) {
		return service.addCountry(country);
	}
	
	
	@GetMapping("/favcountry")
	public List<FavCountry> getWatchlist(){
		return service.getAllCountries();
	}
	
	
	
	
}
