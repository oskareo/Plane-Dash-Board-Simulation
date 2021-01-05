/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutopilotBean;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author USER
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({APControllerTest.class, AutoPilotTest.class, AutopilotBeanTest.class, ISwitchAPTest.class})
public class AutopilotBeanSuite {

    @Before
    public void setUp() throws Exception {
    }
    
}
