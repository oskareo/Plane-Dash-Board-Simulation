/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import AutopilotBean.ISwitchAP;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IView extends IIndicators,ISwitchAP{
    void refresh(List<String> data);
    
}
