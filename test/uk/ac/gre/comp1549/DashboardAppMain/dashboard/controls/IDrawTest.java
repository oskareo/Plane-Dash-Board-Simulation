/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class IDrawTest {
    
    public IDrawTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of setValue method, of class IDraw.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        IDraw instance = new IDrawImpl();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeValue method, of class IDraw.
     */
    @Test
    public void testSetTimeValue() {
        System.out.println("setTimeValue");
        long[] t = null;
        IDraw instance = new IDrawImpl();
        instance.setTimeValue(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IDrawImpl implements IDraw {

        public void setValue(int value) {
        }

        public void setTimeValue(long[] t) {
        }
    }
    
}
