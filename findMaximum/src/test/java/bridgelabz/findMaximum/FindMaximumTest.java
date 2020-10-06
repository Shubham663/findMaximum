package bridgelabz.findMaximum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for FindMaximum.
 */
public class FindMaximumTest{
	FindMaximum findMaximum;
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getMaxGenericClassTest_first(){
    	findMaximum = new FindMaximum("f", "F", "e");
    	assertEquals( "f" , FindMaximum.getMax(findMaximum.getT1(),findMaximum.getT2(),findMaximum.getT3()) );
    }
    @Test
    public void getMaxGenericClassTest_second(){
    	findMaximum = new FindMaximum(4.23f, 5.2f, 3.2f);
        assertEquals( new Float(5.2) , FindMaximum.getMax(findMaximum.getT1(),findMaximum.getT2(),findMaximum.getT3()) );
    }
    @Test
    public void getMaxGenericClassTest_third(){
    	findMaximum = new FindMaximum(3,2,4);
        assertEquals( new Integer(4) , FindMaximum.getMax(findMaximum.getT1(),findMaximum.getT2(),findMaximum.getT3()) );
    }
}
