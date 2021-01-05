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
public class ISwitchAPTest {
    ISwitchAP instance;
    public ISwitchAPTest() {
    }
    
    @Before
    public void setUp() {
        instance = new ISwitchAPImpl();
    }

    /**
     * Test of isAutoPilot method, of class ISwitchAP.
     */
    @Test
    public void testIsAutoPilot() {
        System.out.println("isAutoPilot");
        String onOff = "";
       // ISwitchAP instance = new ISwitchAPImpl();
        instance.isAutoPilot(onOff);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public class ISwitchAPImpl implements ISwitchAP {

        public void isAutoPilot(String onOff) {
        }

        @Override
        public void setValue(int value) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setTimeValue(long[] t) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
