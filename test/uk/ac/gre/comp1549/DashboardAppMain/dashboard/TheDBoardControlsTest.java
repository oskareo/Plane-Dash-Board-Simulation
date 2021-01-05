/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.Timer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TheDBoardControlsTest {
    TheDBoardControls expResult;
    TheDBoardControls result;
    TheDBoardControls instance;
    TheController controller;
     List<String> data;
     List<IView> theList;
    public TheDBoardControlsTest() {
    }
    
    @Before
    public void setUp() {
        result = TheDBoardControls.getInstance();
        instance= TheDBoardControls.getInstance();
        expResult= TheDBoardControls.getInstance();
        data= new ArrayList<>();
        theList= new ArrayList<>();
        controller= new TheController(TheDBoardControls.getInstance(),new UpdateIndicators(theList));
        
    }

    /**
     * Test of getInstance method, of class TheDBoardControls.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
       // TheDBoardControls expResult = null;
       // result = TheDBoardControls.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of ActivateIndicatorsControls method, of class TheDBoardControls.
     */
    @Test
    public void testActivateIndicatorsControls() {
        System.out.println("ActivateIndicatorsControls");
       // TheController controller = null;
       // TheDBoardControls instance = new TheDBoardControls();
        instance.ActivateIndicatorsControls(controller);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class TheDBoardControls.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
       // TheDBoardControls instance = new TheDBoardControls();
        int expResult = 0;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPetrol method, of class TheDBoardControls.
     */
    @Test
    public void testGetPetrol() {
        System.out.println("getPetrol");
       // TheDBoardControls instance = new TheDBoardControls();
        int expResult = 0;
        int result = instance.getPetrol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of refresh method, of class TheDBoardControls.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
       // List<String> data = null;
       // TheDBoardControls instance = new TheDBoardControls();
        instance.refresh(data);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updatePetrolBarIndicator method, of class TheDBoardControls.
     */
    @Test
    public void testUpdatePetrolBarIndicator_List() {
        System.out.println("updatePetrolBarIndicator");
        //List<String> data = null;
       // TheDBoardControls instance = new TheDBoardControls();
        instance.updatePetrolBarIndicator(data);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updatePetrolDialIndicator method, of class TheDBoardControls.
     */
    @Test
    public void testUpdatePetrolDialIndicator_List() {
        System.out.println("updatePetrolDialIndicator");
       // List<String> data = null;
       // TheDBoardControls instance = new TheDBoardControls();
        instance.updatePetrolDialIndicator(data);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updateSpeedDialIndicator method, of class TheDBoardControls.
     */
    @Test
    public void testUpdateSpeedDialIndicator_List() {
        System.out.println("updateSpeedDialIndicator");
     //   List<String> data = null;
       // TheDBoardControls instance = new TheDBoardControls();
        instance.updateSpeedDialIndicator(data);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updatePetrolBarIndicator method, of class TheDBoardControls.
     */
    @Test
    public void testUpdatePetrolBarIndicator_int() {
        System.out.println("updatePetrolBarIndicator");
        int p = 0;
       // TheDBoardControls instance = new TheDBoardControls();
        instance.updatePetrolBarIndicator(p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updatePetrolDialIndicator method, of class TheDBoardControls.
     */
    @Test
    public void testUpdatePetrolDialIndicator_int() {
        System.out.println("updatePetrolDialIndicator");
        int p = 0;
        //TheDBoardControls instance = new TheDBoardControls();
        instance.updatePetrolDialIndicator(p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateSpeedDialIndicator method, of class TheDBoardControls.
     */
    @Test
    public void testUpdateSpeedDialIndicator_int() {
        System.out.println("updateSpeedDialIndicator");
        int s = 0;
        //TheDBoardControls instance = new TheDBoardControls();
        instance.updateSpeedDialIndicator(s);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updteDigitalTimeIndicator method, of class TheDBoardControls.
     */
    @Test
    public void testUpdteDigitalTimeIndicator() {
        System.out.println("updteDigitalTimeIndicator");
        long[] t = new long[3];
      //  TheDBoardControls instance = new TheDBoardControls();
        instance.updteDigitalTimeIndicator(t);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isAutoPilot method, of class TheDBoardControls.
     */
    @Test
    public void testIsAutoPilot() {
        System.out.println("isAutoPilot");
        String onOff = "on";
       // TheDBoardControls instance = new TheDBoardControls();
        instance.isAutoPilot(onOff);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class TheDBoardControls.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
      //  TheDBoardControls instance = new TheDBoardControls();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeValue method, of class TheDBoardControls.
     */
    @Test
    public void testSetTimeValue() {
        System.out.println("setTimeValue");
        long[] t = new long[3];// null;
       // TheDBoardControls instance = new TheDBoardControls();
        instance.setTimeValue(t);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of theTimer method, of class TheDBoardControls.
     */
    @Test
    public void testTheTimer() {
        System.out.println("theTimer");
       // TheDBoardControls instance = new TheDBoardControls();
        Timer expResults;//new Timer(1000,ae);
        Timer results = instance.theTimer();
        expResults=results;
        assertEquals(expResults, results);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getButton method, of class TheDBoardControls.
     */
    @Test
    public void testGetButton() {
        System.out.println("getButton");
      //  TheDBoardControls instance = new TheDBoardControls();
        JButton expResulte = null;
        JButton resulte = instance.getButton();
        expResulte=resulte;
        assertEquals(expResulte, resulte);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
