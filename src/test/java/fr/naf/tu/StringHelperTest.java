package fr.naf.tu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void test1TruncateAInFirst2Positions() {
      
        String actuel = helper.truncateAInFirst2Positions("AACD");
        String attendu = "CD";
        assertEquals(attendu, actuel);
    }

    @Test
    public void test2TruncateAInFirst2Positions() {
        
        String actuel = helper.truncateAInFirst2Positions("ACD");
        String attendu = "CD";
        assertEquals(attendu, actuel);
    }
    
    @Test
    public void test3TruncateAInFirst2Positions() {
        
        String actuel = helper.truncateAInFirst2Positions("CDEF");
        String attendu = "CD";
        assertNotEquals(attendu, actuel);        
    }
    
    @Test
    public void test1AreFirstAndLastTwoCharactersTheSame(){
        
        boolean actuel = helper.areFirstAndLastTwoCharactersTheSame("ABCD"); 
        assertFalse("Test reussi", actuel);
    }
    
    @Test
    public void test2AreFirstAndLastTwoCharactersTheSame(){
        
        boolean actuel = helper.areFirstAndLastTwoCharactersTheSame("ABAB"); 
        assertTrue("Test reussi", actuel);
    }
    
    @Test
    public void testObjectNull(){
        assertNotNull(helper);        
    }
    
    
    @Test
    public void testMemeReference(){
        StringHelper helper1 = new StringHelper();
        StringHelper helper2 = new StringHelper();
        assertNotSame(helper1, helper2);  
        
        StringHelper helper3 = helper1;
        assertSame(helper1, helper3); 
    }
}
