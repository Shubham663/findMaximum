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
    public void getMaxIntegerTest_first(){
        assertEquals( new Integer(4) , FindMaximum.getMaxInteger(4, 2, 3) );
    }
    @Test
    public void getMaxIntegerTest_second(){
        assertEquals( new Integer(4) , FindMaximum.getMaxInteger(3, 4, 2) );
    }
    @Test
    public void getMaxIntegerTest_third(){
        assertEquals( new Integer(4) , FindMaximum.getMaxInteger(3, 2, 4) );
    }
}
