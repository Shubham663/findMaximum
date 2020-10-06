package bridgelabz.findMaximum;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class FindMaximum<T extends Comparable<T>>{
	/**
	 * @param t1,t2,t3 are instance variables
	 */
	private T t1,t2,t3;
	
	
	
	public FindMaximum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FindMaximum(T t1, T t2, T t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	public T getT1() {
		return t1;
	}
	public void setT1(T t1) {
		this.t1 = t1;
	}
	public T getT2() {
		return t2;
	}
	public void setT2(T t2) {
		this.t2 = t2;
	}
	public T getT3() {
		return t3;
	}
	public void setT3(T t3) {
		this.t3 = t3;
	}
	
    public static void main( String[] args )
    {
    	System.out.println("Getting the maximum of numbers"
    			+ "\n 1,4,65,34,76,59,23,17");
    	getMax(1,4,65,34,76,59,23,17);
    }
	/**
	 * @param <T>, the generic type
	 * @param tArray, the values from which maximum is to be determined
	 * @return, returns the maximum of the values provided
	 */
	public static <T extends Comparable<T>> T getMax(T... tArray) {
		List<T> tList = Arrays.asList(tArray);
		Collections.sort(tList);
		printMax(tList.get(tList.size()-1));
		return tList.get(tList.size()-1);
	}
	
	private static<T> void printMax(T t) {
		System.out.println("The maximum value printed from printMax : " + t);
	}
	public int compareTo(T o) {
		return this.compareTo(o);
	}

}
	