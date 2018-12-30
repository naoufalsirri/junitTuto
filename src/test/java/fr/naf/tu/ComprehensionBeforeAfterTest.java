package fr.naf.tu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComprehensionBeforeAfterTest {

    
    @BeforeClass
    public static void beforeClass(){
        System.out.println("avant le lancement des tests de la class");
    }
    
    
    @Before
    public void demarrer(){
        System.out.println("avant le lancement du test");
    }
    
    @Test
    public void test1(){
        System.out.println("test1 est executé");
    }
    
    @Test
    public void test2(){
        System.out.println("test2 est executé");
    }
    
    @After
    public void arreter(){
        System.out.println("apres le lancement du test");
    }
    
    @AfterClass
    public static void afterClass(){
        System.out.println("apres le lancement des tests de la class");
    }
    
    
}
