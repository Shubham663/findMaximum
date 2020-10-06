package bridgelabz.findMaximum;

import java.util.Comparator;

public class CustomComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return ( (Comparable) o1).compareTo(o2);
	}
}