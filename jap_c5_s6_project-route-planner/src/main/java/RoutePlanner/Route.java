package RoutePlanner;

public class Route {
	private String from;
	private String to;
	private String distance;
	private String time;
	private String fare;
	
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
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public Route(String from, String to, String distance, String time, String fare) {
		super();
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.time = time;
		this.fare = fare;
	}
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Route [from=" + from + ", to=" + to + ", distance=" + distance + ", time=" + time + ", fare=" + fare
				+ "]";
	}
}
