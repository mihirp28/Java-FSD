package com.jap.streams;

import java.util.*;

public class CricketService {

    /**
     * Given a country and a name, find the cricketer from the entire data list of cricket players
     */
    public Optional<Cricket> getCricketerName(List<Cricket> cricketList, String cricketerName, String countryName) {


        return Optional.empty();
    }

    /**
     *
     * Sort the list of cricketers in alphabetical order of their names belonging to a particular country.
     */
    public List<String> getCricketerNamesForCountry(List<Cricket> cricketList, String countryName) {
		return null;

    }

    /**
     * Search for cricketers who have played more than 50 matches
     *
     */
    public List<Cricket> getPlayerNamePlayedMoreThan50Matches(List<Cricket> cricketList) {
   	 List<Cricket> data = new ArrayList<>();
    	for(Cricket ck:cricketList) {
    		if(ck.getMatchesPlayed()>50) {
    			data.add(ck);
    		}
    	}

		return data;

    	
    }

    /**
     *
     *Find the cricketers who have scored the highest runs for their country
     */
    public Integer getHighestRunsScoredByCricketer(List<Cricket> cricketList, String countryName) {
    	Integer highestrun=0;
    	for(Cricket ck:cricketList) {
    		if(ck.getCountry().getName().compareToIgnoreCase(countryName)==0) {
    			if(ck.getHighestScore()>highestrun) {
    				highestrun=ck.getHighestScore();
    			}
    		}
    	}


        return highestrun;
    }


}