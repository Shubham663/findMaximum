package bridgelabz.findMaximum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
	/**
	 * @return, returns the maximum of the three arguments
	 */
	public static Integer getMaxInteger(Integer a, Integer b, Integer c) {
		return Integer.max(c,Integer.max(a, b));
	}
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Getting the maximum of numbers"
    			+ "\n 1,4,65,34,76,59,23,17");
        System.out.println("The maximum of the multiple values is : " + getMax(1,4,65,34,76,59,23,17));
    }

	/**
	 * @return, returns the maximum of the strings provided as arguments
	 */
	public static String getMaxString(String a, String b, String c) {
		return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c):(b.compareTo(c) > 0 ? b : c );  
	}

	/**
	 * @return, returns the maximum of the three float values
	 */
	public static Float getMaxFloat(final Float i,final Float j,final Float k) {
		return Float.max(i, Float.max(j, k));
	}	

	/**
	 * @param <T>, the generic type
	 * @return, returns the maximum of the three elements of T type
	 */
	public static <T extends Comparable<T>> T getMax(T t1,T t2, T t3) {
		return t1.compareTo(t2) > 0 ? (t1.compareTo(t3) > 0 ? t1 : t3):(t2.compareTo(t3) > 0 ? t2 : t3 );
	}

	/**
	 * @param <T>, the generic type
	 * @param tArray, the values from which maximum is to be determined
	 * @return, returns the maximum of the values provided
	 */
	public static <T extends Comparable<T>> T getMax(T... tArray) {
		List<T> tList = Arrays.asList(tArray);
		Collections.sort(tList);
		return tList.get(tList.size()-1);
	}
	
	public int compareTo(T o) {
		return this.compareTo(o);
	}

}
	