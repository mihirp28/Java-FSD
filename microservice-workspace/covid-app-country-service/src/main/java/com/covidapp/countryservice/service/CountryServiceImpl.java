package com.covidapp.countryservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.covidapp.countryservice.model.Country;
import com.covidapp.countryservice.model.FavCountry;

@Service
public class CountryServiceImpl implements ICountryService {

	@Autowired
	@Qualifier(("rt-no-eureka"))
	RestTemplate rt;
	
	@Autowired
	@Qualifier(("rt-eureka"))
	RestTemplate rte;
	
	@Value("${COVID_API}")
	private String baseUrl;
	
	@Value("${WATCHLIST_SERVICE_URL}")
	private String watclistServiceUrl;
	
	
	public Country getCountryData(String countryName) {
		
		Country country = rt.getForObject(baseUrl+countryName, Country.class);
		
		return country;
	}
	
	public FavCountry addToFavCountry(String countryName) {
		FavCountry country = new FavCountry();
		country.setCountryName(countryName);
		FavCountry addedCountry =  rte.postForObject(watclistServiceUrl+"/favcountry", country,FavCountry.class); 
		return addedCountry;
	}
	
	public List<FavCountry> getWatchlist() {
		
		FavCountry[] watchlist= rte.getForObject(watclistServiceUrl+"/favcountry", FavCountry[].class); 
		List<FavCountry> favCountries = Arrays.asList(watchlist);
		return favCountries;
		
	}
}
