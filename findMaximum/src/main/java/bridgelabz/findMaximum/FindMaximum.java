package bridgelabz.findMaximum;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class FindMaximum 
{
	public static Integer getMaxInteger(Integer a, Integer b, Integer c) {
		return Integer.max(c,Integer.max(a, b));
	}
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the three numbers of which you want to find the maximum" );
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Integer result = getMaxInteger(a,b,c);
        System.out.println("The maximum value of integer b/w the three no.'s is " + result);
    }
}
	