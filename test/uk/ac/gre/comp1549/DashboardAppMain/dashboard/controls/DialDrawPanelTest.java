/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import java.awt.Graphics;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class DialDrawPanelTest {
    
    public DialDrawPanelTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of paintComponent method, of class DialDrawPanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        DialDrawPanel instance = new DialDrawPanel();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class DialDrawPanel.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        DialDrawPanel instance = new DialDrawPanel();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeValue method, of class DialDrawPanel.
     */
    @Test
    public void testSetTimeValue() {
        System.out.println("setTimeValue");
        long[] value = null;
        DialDrawPanel instance = new DialDrawPanel();
        instance.setTimeValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
