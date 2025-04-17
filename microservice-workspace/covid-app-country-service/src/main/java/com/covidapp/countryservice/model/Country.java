package com.covidapp.countryservice.model;

import lombok.Data;

@Data
public class Country {

	private Details confirmed;
	private Details recovered;
	private Details deaths;
	
}
