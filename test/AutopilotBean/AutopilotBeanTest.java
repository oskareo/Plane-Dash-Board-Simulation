/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutopilotBean;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class AutopilotBeanTest {
    
    AutopilotBean expResult;
     AutopilotBean result;
    public AutopilotBeanTest() {
    }
    
    @Before
    public void setUp() {
        expResult=AutopilotBean.getInstance();
        result = AutopilotBean.getInstance();
    }

    /**
     * Test of getInstance method, of class AutopilotBean.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
       // AutopilotBean expResult = null;
      //  AutopilotBean result = AutopilotBean.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
