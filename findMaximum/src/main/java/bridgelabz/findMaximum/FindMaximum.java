package bridgelabz.findMaximum;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class FindMaximum{
	/**
	 * @return, returns the maximum of the three arguments
	 */
	public static Integer getMaxInteger(Integer a, Integer b, Integer c) {
		return Integer.max(c,Integer.max(a, b));
	}
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println( "Enter three values of any type of which you want to find the maximum" );
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String result = getMax(a,b,c);
        System.out.println("The maximum of the three is : " + result);
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
	public static <T extends Comparable<T>> T getMax(T t1, T t2, T t3) {
		
		return t1.compareTo(t2) > 0 ? (t1.compareTo(t3) > 0 ? t1 : t3):(t2.compareTo(t3) > 0 ? t2 : t3 );
	}
}
	