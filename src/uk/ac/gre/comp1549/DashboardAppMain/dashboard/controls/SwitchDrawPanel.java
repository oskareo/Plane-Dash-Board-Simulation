/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import AutopilotBean.ISwitchAP;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;

/**
 *
 * @author USER
 */
public class SwitchDrawPanel extends JPanel implements ISwitchAP {
JRadioButton jRadioButton1 = new JRadioButton();
    JRadioButton jRadioButton2 = new JRadioButton();
    ButtonGroup butGrp = new ButtonGroup();
    String t1 = "on", t2 = "off";
    String currentSetting = "";
  //  @Override
  public SwitchDrawPanel(){
    this.setLayout(new FlowLayout());
    
   jRadioButton1.setFont(new Font("Arial", Font.BOLD, 16));
        jRadioButton2.setFont(new Font("Arial", Font.BOLD, 16));
        jRadioButton1.setText(t1);
        jRadioButton2.setText(t2);
        butGrp.add(jRadioButton1);
        butGrp.add(jRadioButton2);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.setBorder(new BevelBorder(BevelBorder.RAISED));
   }
   
   
           
   // @Override
    public void setValue(String s) {
       

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    

   // @Override
    public void isAutoPilot(String onOff) {
    if(onOff.equals("on"))
    {
        if(jRadioButton2.isSelected()==true)
        {
        jRadioButton2.doClick();
        jRadioButton2.setSelected(false);
        }
    jRadioButton1.doClick();
    jRadioButton1.setSelected(true);
    }
    
    if(onOff.equals("off"))
    {
    if(jRadioButton1.isSelected()==true)
        {
        jRadioButton1.doClick();
        jRadioButton1.setSelected(false);
        }
    jRadioButton2.doClick();
    jRadioButton2.setSelected(true);
    }
        
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
