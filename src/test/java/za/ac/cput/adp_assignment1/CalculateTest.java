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
   public Calculate x;
   public Calculate y;
   public Calculate z;
  
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
     x=new Calculate();
     x.setNum1(3);
     x.setNum2(5);
     
     y=new Calculate();
     y.setNum1(3);
     y.setNum2(5);
     
     z=y;
         
     
      
      
    }
    
    @AfterEach
    public void tearDown() {
    }
    //object equality
    @Test
    public void testEquality(){
        assertEquals(x.getNum1(),y.getNum2());
    }
    //object identity
    @Test
    public void testIdentity(){
        assertSame(x,z);
    }
    //Fail
    @Test
    public void testFail(){
    fail("Failure");
    assertEquals(x.getNum1(),y.getNum2());
    
    }
    //Timeout
    @Test
    @Timeout(value=300, unit=TimeUnit.MILLISECONDS)
    public void TimeoutTest(){
    }

    
    //Disable
    @Test
    @Disabled("Disabling")
    public void testDisable(){
        System.out.println("Will not run");
    }
}
    


