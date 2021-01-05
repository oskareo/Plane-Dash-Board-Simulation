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
public class BarDrawPanelTest {
    
    public BarDrawPanelTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of paintComponent method, of class BarDrawPanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        BarDrawPanel instance = new BarDrawPanel();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class BarDrawPanel.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        BarDrawPanel instance = new BarDrawPanel();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickNap method, of class BarDrawPanel.
     */
    @Test
    public void testQuickNap() {
        System.out.println("quickNap");
        BarDrawPanel instance = new BarDrawPanel();
        instance.quickNap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeValue method, of class BarDrawPanel.
     */
    @Test
    public void testSetTimeValue() {
        System.out.println("setTimeValue");
        long[] value = null;
        BarDrawPanel instance = new BarDrawPanel();
        instance.setTimeValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
