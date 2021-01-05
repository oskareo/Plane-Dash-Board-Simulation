/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import AutopilotBean.ISwitchAP;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author USER
 */
public interface IIndicators  {
    void updatePetrolBarIndicator(int p);
    void updatePetrolDialIndicator(int p);
    void updateSpeedDialIndicator(int s);
    void updteDigitalTimeIndicator(long[] t);
    public Timer theTimer();
}

//class updateBarIndicator implements IIndicators
//{
//   // @Override
//    public String updates() { 
//    return "Bar Indicator";
//    }
//}
//
//class updateDialIndicator implements IIndicators
//{
//
//   // @Override
//    public String updates() {
//       
//    return "Dial Indicator";
//    }



