package RoutePlanner;
import java.util.Comparator;

public class SortFlights implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Route r1=(Route) o1;
		Route r2=(Route) o2;
		return r1.getTo().compareTo(r2.getTo());
	}

}
