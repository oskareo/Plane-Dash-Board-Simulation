/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import java.util.List;
import javax.swing.Timer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TheDashboardViewTest {
    
    TheDashboardView expResult;
        TheDashboardView result ;//= TheDashboardView.getInstance();
        TheDashboardView instance;
    
    public TheDashboardViewTest() {
    }
    
    @Before
    public void setUp() {
        expResult= TheDashboardView.getInstance();
        result = TheDashboardView.getInstance();
         instance = TheDashboardView.getInstance();
    }

    /**
     * Test of getInstance method, of class TheDashboardView.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of refresh method, of class TheDashboardView.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        List<String> data = null;
       
        instance.refresh(data);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of updatePetrolBarIndicator method, of class TheDashboardView.
     */
    @Test
    public void testUpdatePetrolBarIndicator() {
        System.out.println("updatePetrolBarIndicator");
        int data = 0;
       // TheDashboardView instance = new TheDashboardView();
        instance.updatePetrolBarIndicator(data);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of updatePetrolDialIndicator method, of class TheDashboardView.
     */
    @Test
    public void testUpdatePetrolDialIndicator() {
        System.out.println("updatePetrolDialIndicator");
        int p = 0;
       // TheDashboardView instance = new TheDashboardView();
        instance.updatePetrolDialIndicator(p);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of updateSpeedDialIndicator method, of class TheDashboardView.
     */
    @Test
    public void testUpdateSpeedDialIndicator() {
        System.out.println("updateSpeedDialIndicator");
        int s = 0;
      //  TheDashboardView instance = new TheDashboardView();
        instance.updateSpeedDialIndicator(s);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of updteDigitalTimeIndicator method, of class TheDashboardView.
     */
    @Test
    public void testUpdteDigitalTimeIndicator() {
        System.out.println("updteDigitalTimeIndicator");
        long[] t = new long[3];//null;
     //   TheDashboardView instance = new TheDashboardView();
        instance.updteDigitalTimeIndicator(t);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of isAutoPilot method, of class TheDashboardView.
     */
    @Test
    public void testIsAutoPilot() {
        System.out.println("isAutoPilot");
        String onOff = "";
     //   TheDashboardView instance = new TheDashboardView();
        instance.isAutoPilot(onOff);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class TheDashboardView.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
       // TheDashboardView instance = new TheDashboardView();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeValue method, of class TheDashboardView.
     */
    @Test
    public void testSetTimeValue() {
        System.out.println("setTimeValue");
        long[] t = new long[3];//null;
      //  TheDashboardView instance = new TheDashboardView();
        instance.setTimeValue(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of theTimer method, of class TheDashboardView.
     */
    @Test
    public void testTheTimer() {
        System.out.println("theTimer");
       // TheDashboardView instance = new TheDashboardView();
        Timer expResulte = null;
        Timer resulte = instance.theTimer();
        expResulte=resulte;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
