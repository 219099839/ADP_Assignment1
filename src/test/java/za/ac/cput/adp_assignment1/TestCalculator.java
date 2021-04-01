/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_assignment1;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Manasseh Barnes 218009615
 */
public class TestCalculator {
    
    private Calculator calculate;
    private Calculator add,subtract;
  
    @BeforeEach
    public void setUp() {
        this.calculate = new Calculator();
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void TestEquality() {
        int result = calculate.add(4,6);
        assertEquals(10, result);
    }
    
    @Test 
    public void TestIdentity() {
        assertSame(add,subtract);
    }
    
    @Test
    public void FailingTest() {
        assertFalse(false);
    }
    
    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    public void TimeoutTest() {
        //fails if Execution times exceeds 200 milliseconds
    }
                     
    @Test
    @Disabled("This Test will not run")
    public void Fail() {
        // This test will be skipped
    }
    
}
