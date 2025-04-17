package com.wp.routeplannerapp;

public class RouteInfo {
	private String from;
	private String to;
	private int distance;
	private String travelTime;
	private String airFare;
	
	public RouteInfo() {
	}

	public RouteInfo(String from, String to, int distance, String travelTime, String airFare) {
		super();
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.travelTime = travelTime;
		this.airFare = airFare;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public String getAirFare() {
		return airFare;
	}

	public void setAirFare(String airFare) {
		this.airFare = airFare;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airFare == null) ? 0 : airFare.hashCode());
		result = prime * result + distance;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		result = prime * result + ((travelTime == null) ? 0 : travelTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RouteInfo other = (RouteInfo) obj;
		if (airFare == null) {
			if (other.airFare != null)
				return false;
		} else if (!airFare.equals(other.airFare))
			return false;
		if (distance != other.distance)
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		if (travelTime == null) {
			if (other.travelTime != null)
				return false;
		} else if (!travelTime.equals(other.travelTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RouteInfo [from=" + from + ", to=" + to + ", distance=" + distance + ", travelTime=" + travelTime
				+ ", airFare=" + airFare + "]";
	}
	
	
	
	
}
