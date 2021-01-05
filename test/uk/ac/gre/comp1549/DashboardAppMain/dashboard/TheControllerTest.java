/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import WatchBean.WatchEvent;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TheControllerTest {
    
    TheController instance;
    DocumentEvent de;
     ActionEvent ae;
     WatchEvent swe;
      PropertyChangeEvent pce;
      List<IView> theList;
    public TheControllerTest() {
    }
    
    @Before
    public void setUp() {
        //de= new DocumentEvent();
        theList= new ArrayList<>();
       instance= new TheController(TheDBoardControls.getInstance(),new UpdateIndicators(theList));
        ae=new ActionEvent(instance.controlsView.btnScript,instance.controlsView.btnScript.getComponentCount(),instance.controlsView.btnScript.getActionCommand() );
       // de=(DocumentEvent) ae;
        swe= new WatchEvent(instance.controlsView.wb);
        pce= new PropertyChangeEvent(instance.controlsView.apb,instance.controlsView.apb.getName(),instance.controlsView.apb,instance.controlsView.apb);
        
    }

    /**
     * Test of actionPerformed method, of class TheController.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
      //  ActionEvent ae = null;
       // TheController instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of insertUpdate method, of class TheController.
     */
    @Test
    public void testInsertUpdate() {
        System.out.println("insertUpdate");
     //   DocumentEvent de = null;
        //TheController instance = null;
        instance.insertUpdate(de);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of removeUpdate method, of class TheController.
     */
    @Test
    public void testRemoveUpdate() {
        System.out.println("removeUpdate");
       // DocumentEvent de = null;
       // TheController instance = null;
        instance.removeUpdate(de);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of changedUpdate method, of class TheController.
     */
    @Test
    public void testChangedUpdate() {
        System.out.println("changedUpdate");
       // DocumentEvent de = null;
       // TheController instance = null;
        instance.changedUpdate(de);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of StartTime method, of class TheController.
     */
    @Test
    public void testStartTime() {
        System.out.println("StartTime");
       // WatchEvent swe = null;
      //  TheController instance = null;
        instance.StartTime(swe);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of StopTime method, of class TheController.
     */
    @Test
    public void testStopTime() {
        System.out.println("StopTime");
       // WatchEvent swe = null;
       // TheController instance = null;
        instance.StopTime(swe);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateTime method, of class TheController.
     */
    @Test
    public void testUpdateTime() {
        System.out.println("UpdateTime");
       // WatchEvent swe = null;
      //  TheController instance = null;
        instance.UpdateTime(swe);
        // TODO review the generated test code and remove the default call to fail.
       /// fail("The test case is a prototype.");
    }

    /**
     * Test of propertyChange method, of class TheController.
     */
    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
       // PropertyChangeEvent pce = null;
       // TheController instance = null;
        instance.propertyChange(pce);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
