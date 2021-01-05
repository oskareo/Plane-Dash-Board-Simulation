/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutopilotBean;

import java.awt.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class AutoPilotTest {
    AutoPilot expResult;
    AutoPilot result;
    AutoPilot instance;
     APController apc;
     APControllerTest apct;
      ActionEvent e;
    public AutoPilotTest() {
    }
    
    @Before
    public void setUp() {
        expResult= AutoPilot.getInstance();
        result = AutoPilot.getInstance();
        instance= AutoPilot.getInstance();
        apc= new APController(instance);
       // apct=new APControllerTest();
         e= new ActionEvent(instance.jRadioButton1,instance.jRadioButton1.getComponentCount(),instance.jRadioButton1.getActionCommand());
    }

    /**
     * Test of getInstance method, of class AutoPilot.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
       // AutoPilot expResult = null;
       // AutoPilot result = AutoPilot.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ActivateCommands method, of class AutoPilot.
     */
    @Test
    public void testActivateCommands() {
        System.out.println("ActivateCommands");
      //  APController apc = null;
        //AutoPilot instance = new AutoPilot();
        instance.ActivateCommands(apc);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isAutoPilot method, of class AutoPilot.
     */
    @Test
    public void testIsAutoPilot() {
        System.out.println("isAutoPilot");
        String onOff = "";
        //AutoPilot instance = new AutoPilot();
        instance.isAutoPilot(onOff);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of buttonClicked method, of class AutoPilot.
     */
    @Test
    public void testButtonClicked() {
        System.out.println("buttonClicked");
       // ActionEvent e = null;
       
       // AutoPilot instance = new AutoPilot();
        instance.buttonClicked(e);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSetting method, of class AutoPilot.
     */
    @Test
    public void testGetSetting() {
        System.out.println("getSetting");
       // AutoPilot instance = new AutoPilot();
        String expResult = "on";
        String result = instance.getSetting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setSetting method, of class AutoPilot.
     */
    @Test
    public void testSetSetting() {
        System.out.println("setSetting");
        String s = "";
       // AutoPilot instance = new AutoPilot();
        instance.setSetting(s);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of isSelected method, of class AutoPilot.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
      //  AutoPilot instance = new AutoPilot();
        boolean expResult = true;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setText1 method, of class AutoPilot.
     */
    @Test
    public void testSetText1() {
        System.out.println("setText1");
        String t1 = "on";
       // AutoPilot instance = new AutoPilot();
        instance.setText1(t1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getText1 method, of class AutoPilot.
     */
    @Test
    public void testGetText1() {
        System.out.println("getText1");
      //  AutoPilot instance = new AutoPilot();
        String expResult = "on";
        String result = instance.getText1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setText2 method, of class AutoPilot.
     */
    @Test
    public void testSetText2() {
        System.out.println("setText2");
        String t2 = "off";
      //  AutoPilot instance = new AutoPilot();
        instance.setText2(t2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getText2 method, of class AutoPilot.
     */
    @Test
    public void testGetText2() {
        System.out.println("getText2");
      //  AutoPilot instance = new AutoPilot();
        String expResult = "off";
        String result = instance.getText2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class AutoPilot.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
      //  AutoPilot instance = new AutoPilot();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeValue method, of class AutoPilot.
     */
    @Test
    public void testSetTimeValue() {
        System.out.println("setTimeValue");
        long[] t = new long[5]; //null;
       // AutoPilot instance = new AutoPilot();
        instance.setTimeValue(t);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
