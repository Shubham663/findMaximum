package bridgelabz.findMaximum;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class FindMaximum 
{
	/**
	 * @return, returns the maximum of the three arguments
	 */
	public static Integer getMaxInteger(Integer a, Integer b, Integer c) {
		return Integer.max(c,Integer.max(a, b));
	}
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the three float numbers of which you want to find the maximum" );
        Float a = sc.nextFloat();
        Float b = sc.nextFloat();
        Float c = sc.nextFloat();
        Float result = getMaxFloat(a,b,c);
        System.out.println("The maximum value of float b/w the three no.'s is " + result);
    }

	/**
	 * @return, returns the maximum of the three float values
	 */
	public static Float getMaxFloat(final Float i,final Float j,final Float k) {
		return Float.max(i, Float.max(j, k));
	}
}
	