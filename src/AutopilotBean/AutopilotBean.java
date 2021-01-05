/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutopilotBean;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class AutopilotBean extends JPanel {
    private static AutopilotBean apbInstance=null;
    public AutoPilot ap;
    public APController apc;
    List<ISwitchAP> theView;
    
    public AutopilotBean()
    {
   // ap= AutoPilot.
        ap= AutoPilot.getInstance();
    theView= new ArrayList<>();
    theView.add(ap);
    apc= new APController(ap);
    ap.ActivateCommands(apc);
    add(ap);
    
    }
    public static AutopilotBean getInstance()
    
    {
    if(apbInstance==null)
    {
    apbInstance= new AutopilotBean();
    }
    return apbInstance;
    }
}
