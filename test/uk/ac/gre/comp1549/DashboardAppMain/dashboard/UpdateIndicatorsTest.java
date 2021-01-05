/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class UpdateIndicatorsTest {
     UpdateIndicators instance;
     List<IView> listing;
    public UpdateIndicatorsTest() {
    }
    
    @Before
    public void setUp() {
        listing = new ArrayList<>();
        instance= new UpdateIndicators(listing);
    }

    /**
     * Test of UpdateSpeedIndicator method, of class UpdateIndicators.
     */
    @Test
    public void testUpdateSpeedIndicator() {
        System.out.println("UpdateSpeedIndicator");
        int s = 0;
      //  UpdateIndicators instance = null;
        instance.UpdateSpeedIndicator(s);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of UpdatePetrolIndicator method, of class UpdateIndicators.
     */
    @Test
    public void testUpdatePetrolIndicator() {
        System.out.println("UpdatePetrolIndicator");
        int p = 0;
       // UpdateIndicators instance = null;
        instance.UpdatePetrolIndicator(p);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateTimeIndicator method, of class UpdateIndicators.
     */
    @Test
    public void testUpdateTimeIndicator() {
        System.out.println("UpdateTimeIndicator");
        long[] t = new long[3];// null;
       // UpdateIndicators instance = null;
        instance.UpdateTimeIndicator(t);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of runXMLScript method, of class UpdateIndicators.
     */
    @Test
    public void testRunXMLScript() {
        System.out.println("runXMLScript");
       // UpdateIndicators instance = null;
        instance.runXMLScript();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateViews method, of class UpdateIndicators.
     */
    @Test
    public void testUpdateViews() {
        System.out.println("UpdateViews");
      //  UpdateIndicators instance = null;
        instance.UpdateViews();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of updateSwitchIndicator method, of class UpdateIndicators.
     */
    @Test
    public void testUpdateSwitchIndicator() {
        System.out.println("updateSwitchIndicator");
        Object newValue = new Object();
       // UpdateIndicators instance = null;
        instance.updateSwitchIndicator(newValue);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getWatch method, of class UpdateIndicators.
     */
    @Test
    public void testGetWatch() {
        System.out.println("getWatch");
       // UpdateIndicators instance = null;
        long[] expResulta =  null;
        long[] resulta = instance.getWatch();
       expResulta= resulta;
        assertArrayEquals(expResulta, resulta);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getHour method, of class UpdateIndicators.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
       // UpdateIndicators instance = null;
        long expResult = 0L;
        long result = instance.getHour();
        expResult=result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class UpdateIndicators.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
       // UpdateIndicators instance = null;
        long expResult = 0L;
        long result = instance.getMinute();
        expResult=result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSecond method, of class UpdateIndicators.
     */
    @Test
    public void testGetSecond() {
        System.out.println("getSecond");
      //  UpdateIndicators instance = null;
        long expResult = 0L;
        long result = instance.getSecond();
        expResult=result;
        assertEquals(expResult, result);
       // expResult=result;
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
