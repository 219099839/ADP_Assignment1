/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_assignment1;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author maryg
 */
public class CalculateTest {
    private Calculate x;
    private Calculate y;
    private Calculate a;
    
    public CalculateTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.x=new Calculate();
        this.y=new Calculate();
        a=x;
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    //object equality
    @Test 
    public void testEquality(){
        assertEquals(x,y);}

    //object identity
    @Test
    public void testIdentity(){
        assertEquals(y,a);
    }
    
    //Failing test
    @Test
    public void failingTest(){
        assertSame(x,y);
    }
    
    //Timeout
    @Test
    @Timeout(value=100, unit = TimeUnit.MILLISECONDS)
    public void testTimeout(){
        for(int i=0; i<=10;i++){
            System.out.println("Please Work");
        }
    }
    
    @Disabled("Don't Run")
    @Test
    public void testDis(){
        System.out.println("dont");
    }
    
}

