/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.events;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class DashBoardEventListenerTest {
    
    public DashBoardEventListenerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of processDashBoardEvent method, of class DashBoardEventListener.
     */
    @Test
    public void testProcessDashBoardEvent() {
        System.out.println("processDashBoardEvent");
        Object originator = null;
        DashBoardEvent dbe = null;
        DashBoardEventListener instance = new DashBoardEventListenerImpl();
        instance.processDashBoardEvent(originator, dbe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DashBoardEventListenerImpl implements DashBoardEventListener {

        public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
        }
    }
    
}
