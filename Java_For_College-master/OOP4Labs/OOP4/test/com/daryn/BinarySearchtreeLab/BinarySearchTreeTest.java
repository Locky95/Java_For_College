/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.daryn.BinarySearchtreeLab;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t00182938
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
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
     * Test of insert method, of class BinarySearchTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object e = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.insert((Comparable) e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class BinarySearchTree.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        BinarySearchTree instance = new BinarySearchTree();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsIterative method, of class BinarySearchTree.
     */
    @Test
    public void testContainsIterative() {
        System.out.println("containsIterative");
        Object element = null;
        BinarySearchTree instance = new BinarySearchTree();
        boolean expResult = false;
        boolean result = instance.containsIterative((Comparable) element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
