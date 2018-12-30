package fr.naf.tu;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

    
    @Test
    public void testArrayTri(){
        
       int[] numbers = {12,3,4,1};
       int[] expected = {1,3,4,12};
       Arrays.sort(numbers);
       assertArrayEquals(expected, numbers);
    }
    
    
    @Test(expected=NullPointerException.class)
    public void testArrayTriNull(){
        
       int[] numbers = null;
       Arrays.sort(numbers);     
    }
    
    @Test(timeout=1000)
    public void testTriPerformance(){
    
        int[] numbers = {12,3,4,1};
        for(int i=0;i<100000;i++){
            numbers[0]=i;
            Arrays.sort(numbers); 
        }
    
    }
}
