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
    public void getMaxGenericTest_first(){
        assertEquals( "f" , FindMaximum.getMax("f", "F", "e") );
    }
    @Test
    public void getMaxGenericTest_second(){
        assertEquals( new Float(5.2) , FindMaximum.getMax(4.23f, 5.2f, 3.2f) );
    }
    @Test
    public void getMaxGenericTest_third(){
        assertEquals( new Integer(4) , FindMaximum.getMax(3, 2, 4) );
    }
}
