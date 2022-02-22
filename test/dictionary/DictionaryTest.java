/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acer main
 */
public class DictionaryTest {
    
    public DictionaryTest() {
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
     * Test of printWords method, of class Dictionary.
     */
    @Test
    public void testPrintWords() {
        System.out.println("printWords");
        ArrayList<ArrayList<String>> dictionary = null;
        Dictionary.printWords(dictionary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchWords method, of class Dictionary.
     */
    @Test
    public void testSearchWords() {
        System.out.println("searchWords");
        ArrayList<ArrayList<String>> dictionary = null;
        ArrayList expResult = null;
        ArrayList result = Dictionary.searchWords(dictionary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editWords method, of class Dictionary.
     */
    @Test
    public void testEditWords() {
        System.out.println("editWords");
        ArrayList<ArrayList<String>> dictionary = null;
        ArrayList expResult = null;
        ArrayList result = Dictionary.editWords(dictionary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeWords method, of class Dictionary.
     */
    @Test
    public void testRemoveWords() {
        System.out.println("removeWords");
        ArrayList<ArrayList<String>> dictionary = null;
        ArrayList expResult = null;
        ArrayList result = Dictionary.removeWords(dictionary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWords method, of class Dictionary.
     */
    @Test
    public void testAddWords() {
        System.out.println("addWords");
        ArrayList<ArrayList<String>> dictionary = null;
        Scanner input = null;
        ArrayList expResult = null;
        ArrayList result = Dictionary.addWords(dictionary, input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Dictionary.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Dictionary.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
