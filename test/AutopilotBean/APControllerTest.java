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
public class APControllerTest {
    APController instance ;
    AutoPilot apinstance;
    ActionEvent ae ;
    public APControllerTest() {
         //ae= new ActionEvent(apinstance.jRadioButton1,apinstance.jRadioButton1.getComponentCount(),apinstance.jRadioButton1.getActionCommand());
        
    }
    
    @Before
    public void setUp() {
        
        apinstance=AutoPilot.getInstance();
        ae= new ActionEvent(apinstance.jRadioButton1,apinstance.jRadioButton1.getComponentCount(),apinstance.jRadioButton1.getActionCommand());
        instance= new APController(apinstance);
        
    }

    /**
     * Test of actionPerformed method, of class APController.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
       // ActionEvent ae = null;
     //  ae=null;
        //APController instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
