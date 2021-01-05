/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.events;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class DashBoardEventListTest {
    
    public DashBoardEventListTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addListener method, of class DashBoardEventList.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        String type = "";
        DashBoardEventListener listener = null;
        DashBoardEventList instance = new DashBoardEventList();
        instance.addListener(type, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeListener method, of class DashBoardEventList.
     */
    @Test
    public void testRemoveListener() {
        System.out.println("removeListener");
        String type = "";
        DashBoardEventListener listener = null;
        DashBoardEventList instance = new DashBoardEventList();
        instance.removeListener(type, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeners method, of class DashBoardEventList.
     */
    @Test
    public void testGetListeners() {
        System.out.println("getListeners");
        String type = "";
        DashBoardEventList instance = new DashBoardEventList();
        List<DashBoardEventListener> expResult = null;
        List<DashBoardEventListener> result = instance.getListeners(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
