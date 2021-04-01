/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_assignment1;

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
 * @author TITILAYO AKINJOLE 220283982
 */
public class addNumberTest {
    
    public addNumberTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testEquality() {
        
        int val1 = 22;
        int val2 = 5;
        
        addNumber test =new addNumber();
        
        int result = test.addMeth(val1 , val2);
        assertEquals(27,result);
    }
    
    @Test
    public void testIdentity() {
        int val1 = 22;
        int val2 = 5;
        
        addNumber test =new addNumber();
        assertSame(val1 , val2);
    } 
    
    @Test
    public void testFail() {
            fail("Failure");
        int val1 = 22;
        int val2 = 5;
        
        addNumber test =new addNumber();
        
        int result = test.addMeth(val1 , val2);
        assertEquals(2,result);
    }
    
    
    @Test
    @Timeout( value = 400)
    public void testTimeout() throws InterruptedException{
         while (true){
             Thread.currentThread().sleep(400);
         }
    }
    
    @Disabled("Test is disabled")
    @Test
   public void testDisabling(){
   }
    
}
