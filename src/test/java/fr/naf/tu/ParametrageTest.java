package fr.naf.tu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrageTest {

    
    StringHelper helper = new StringHelper();
    private String input;
    private String output;
    

    //constructeur obligatoire avec l'ordre des parametres
    public ParametrageTest(String input, String output) {
        super();
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection<String[]> testConditions(){
       String attenduOutput[][]= {{"AACD","CD"},
        {"ACD","CD"}};
        
        return Arrays.asList(attenduOutput);
    }
    
    @Test
    public void test1TruncateAInFirst2Positions() {
      
        String actuel = helper.truncateAInFirst2Positions(input);
        assertEquals(output, actuel);
    }

    @Test
    public void test2TruncateAInFirst2Positions() {
        
        String actuel = helper.truncateAInFirst2Positions(input);
        assertEquals(output, actuel);
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
    
}
