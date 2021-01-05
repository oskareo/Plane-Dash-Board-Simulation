/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TheIndicatorTest {
    
    public TheIndicatorTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of setValue method, of class TheIndicator.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        TheIndicator instance = new TheIndicator();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeValue method, of class TheIndicator.
     */
    @Test
    public void testSetTimeValue() {
        System.out.println("setTimeValue");
        long[] t = null;
        TheIndicator instance = new TheIndicator();
        instance.setTimeValue(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSwitchValue method, of class TheIndicator.
     */
    @Test
    public void testSetSwitchValue() {
        System.out.println("setSwitchValue");
        boolean onOff = false;
        TheIndicator instance = new TheIndicator();
        instance.setSwitchValue(onOff);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel method, of class TheIndicator.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        String label = "";
        TheIndicator instance = new TheIndicator();
        instance.setLabel(label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
