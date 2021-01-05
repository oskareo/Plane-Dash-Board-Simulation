/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import AutopilotBean.ISwitchAP;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class TheIndicator extends JPanel {
    public StringBuilder type;
      public BarDrawPanel bar=new BarDrawPanel() ; // the bar itself
    public JLabel lblTitle;
      public DialDrawPanel dial=new DialDrawPanel();;  // the dial itself
      public DigitalDrawPanel digital= new DigitalDrawPanel();
      public SwitchDrawPanel theSwitch= new SwitchDrawPanel();
   // private JLabel lblTitle; // the label which always appears above the bar

    //composition//Stategy pattern
   public IDraw drawIndicatorType;
   public ISwitchAP drawSwitchIndicatortype;
  // public Thread realAni;
   public TheIndicator()
   {
     
   }
  
   
   public void setValue(int value)
   {
       if (type.toString().equals("bar"))
       {
       bar.setValue(value);
       }
       else if(type.toString().equals("dial"))
       {
       dial.setValue(value);
       }
//       else if(type.toString().equals("digital"))
//       {
//      // digital.setValue(value);
//       }
//       else if(type.toString().equals("theSwitch"))
//       {
//       theSwitch.setValue();
//       }
   }
   
   public void setTimeValue(long[] t)
   {
   if(type.toString().equals("digital"))
   {
   digital.setTimeValue(t);
   }
   }
   
   public void setSwitchValue(boolean onOff)
   {
   if(onOff==true)
   {
       theSwitch.isAutoPilot("on");
   }
   if(onOff==false)
   {
       theSwitch.isAutoPilot("off");
   }
   }
   
   public void setLabel(String label)
   {
   lblTitle.setText(label);
   }
    
}
