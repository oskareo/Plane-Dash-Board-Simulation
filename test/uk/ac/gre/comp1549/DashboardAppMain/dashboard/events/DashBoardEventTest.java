/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.events;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class DashBoardEventTest {
    
    public DashBoardEventTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getType method, of class DashBoardEvent.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        DashBoardEvent instance = new DashBoardEvent();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class DashBoardEvent.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        DashBoardEvent instance = new DashBoardEvent();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class DashBoardEvent.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        DashBoardEvent instance = new DashBoardEvent();
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class DashBoardEvent.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        String value = "";
        DashBoardEvent instance = new DashBoardEvent();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DashBoardEvent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DashBoardEvent instance = new DashBoardEvent();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
