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
 
/**
 *
 * @author pc
 */
public class TestTemperature {

  private Temperature temperature;
  private Temperature

     public TestTemperature() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    this.conversion = new conversion();
    }

    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testIdentity (){
        assertSame(multiply, divide, add);
    }
    
    @Test
    public void testEquality (){
    double result = calculate.multiply(10,2);
    assertEquals(20, result);
    }

    @Test
    public void FailingTest(){
    assertFalse(false);
}

    @Test
    @Timeout(value = 100, unit = TimeUnit.SECONDS)
    public void TimeoutTest(){

}

   @Test
   @Disabled("Test Will not run at all")
   public void Fail(){
}

}