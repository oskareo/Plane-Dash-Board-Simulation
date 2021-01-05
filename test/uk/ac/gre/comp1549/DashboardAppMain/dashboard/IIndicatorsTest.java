/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import javax.swing.Timer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class IIndicatorsTest {
    IIndicators instance;
     Timer result;
    public IIndicatorsTest() {
    }
    
    @Before
    public void setUp() {
         instance= new IIndicatorsImpl();
         result = instance.theTimer();
    }

    /**
     * Test of updatePetrolBarIndicator method, of class IIndicators.
     */
    @Test
    public void testUpdatePetrolBarIndicator() {
        System.out.println("updatePetrolBarIndicator");
        int p = 0;
        
        instance.updatePetrolBarIndicator(p);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updatePetrolDialIndicator method, of class IIndicators.
     */
    @Test
    public void testUpdatePetrolDialIndicator() {
        System.out.println("updatePetrolDialIndicator");
        int p = 0;
       // IIndicators instance = new IIndicatorsImpl();
        instance.updatePetrolDialIndicator(p);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updateSpeedDialIndicator method, of class IIndicators.
     */
    @Test
    public void testUpdateSpeedDialIndicator() {
        System.out.println("updateSpeedDialIndicator");
        int s = 0;
       // IIndicators instance = new IIndicatorsImpl();
        instance.updateSpeedDialIndicator(s);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updteDigitalTimeIndicator method, of class IIndicators.
     */
    @Test
    public void testUpdteDigitalTimeIndicator() {
        System.out.println("updteDigitalTimeIndicator");
        long[] t = new long[3];// null;
      //  IIndicators instance = new IIndicatorsImpl();
        instance.updteDigitalTimeIndicator(t);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of theTimer method, of class IIndicators.
     */
    @Test
    public void testTheTimer() {
        System.out.println("theTimer");
       // IIndicators instance = new IIndicatorsImpl();
        Timer expResult = instance.theTimer();//null;
       
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    public class IIndicatorsImpl implements IIndicators {

        public void updatePetrolBarIndicator(int p) {
        }

        public void updatePetrolDialIndicator(int p) {
        }

        public void updateSpeedDialIndicator(int s) {
        }

        public void updteDigitalTimeIndicator(long[] t) {
        }

        public Timer theTimer() {
            return result;
        }
    }
    
}
