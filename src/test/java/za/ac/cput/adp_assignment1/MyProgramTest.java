/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antho
 */
public class MyProgramTest {
    
    public MyProgramTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class MyProgram.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        MyProgram instance = new MyProgram();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class MyProgram.
     */
    @org.junit.Test
    public void testGetSurname() {
        System.out.println("getSurname");
        MyProgram instance = new MyProgram();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class MyProgram.
     */
    @org.junit.Test
    public void testGetAge() {
        System.out.println("getAge");
        MyProgram instance = new MyProgram();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthYear method, of class MyProgram.
     */
    @org.junit.Test
    public void testGetBirthYear() {
        System.out.println("getBirthYear");
        MyProgram instance = new MyProgram();
        int expResult = 0;
        int result = instance.getBirthYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class MyProgram.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        MyProgram instance = new MyProgram();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class MyProgram.
     */
    @org.junit.Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        MyProgram instance = new MyProgram();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class MyProgram.
     */
    @org.junit.Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        MyProgram instance = new MyProgram();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthYear method, of class MyProgram.
     */
    @org.junit.Test
    public void testSetBirthYear() {
        System.out.println("setBirthYear");
        MyProgram instance = new MyProgram();
        instance.setBirthYear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
