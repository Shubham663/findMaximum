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
    public void getMaxFloatTest_first(){
        assertEquals( new Float(4.23) , FindMaximum.getMaxFloat(4.23f, 2.00f, 4.12f) );
    }
    @Test
    public void getMaxFloatTest_second(){
        assertEquals( new Float(4) , FindMaximum.getMaxFloat(3f, 4f, 2f) );
    }
    @Test
    public void getMaxFloatTest_third(){
        assertEquals( new Float(4) , FindMaximum.getMaxFloat(3.99f, 2.4f, 4.0f) );
    }
}
