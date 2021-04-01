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
   public Calculate num1;
   public Calculate num2;
  
    @BeforeEach
    public void setUp() {
        num1=new Calculate();
        num2=new Calculate();
        num1=num2;
    }
    //object equality
    @Test
    public void testEquality(){
        assertEquals(num1,num2);
    }
    //object identity
    @Test
    public void testIdentity(){
        assertSame(num1,num2);
    }
    //Fail
    @Test
   
    public void testFail(){
    fail("Failure");
    assertEquals(num1,num2);
    
    }
    //timout
    @Test
     @Timeout(value=300, unit=TimeUnit.MILLISECONDS)
    public void TestTimeout(){
        
    }
    //Disable
    @Test
    @Disabled("Disabling")
    public void testDisable(){
        System.out.println("Will not run");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 01b93562c2ab081472e493889f51391509ba9a24
