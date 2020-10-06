package bridgelabz.findMaximum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for FindMaximum.
 */
public class FindMaximumTest 
{
	FindMaximum findMaximum;
	
	@Before
	public void init() {
		findMaximum = new FindMaximum();
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getMaxStringTest_first(){
        assertEquals( "f" , FindMaximum.getMaxString("f", "F", "e") );
    }
    @Test
    public void getMaxStringTest_second(){
        assertEquals( "w" , FindMaximum.getMaxString("G", "w", "e") );
    }
    @Test
    public void getMaxStringTest_third(){
        assertEquals( "z" , FindMaximum.getMaxString("w", "Q", "z") );
    }
}
