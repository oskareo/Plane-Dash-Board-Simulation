/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboadAppMain;

import java.util.ArrayList;
import java.util.List;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.TheController;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.TheDBoardControls;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.TheDashboardView;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.UpdateIndicators;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.IView;

/**
 *
 * @author USER
 */
public class DashBoardMain {
    public static void main(String[] args) {
         TheDBoardControls IndicatorControlPanel = TheDBoardControls.getInstance();
         //IndicatorControlPanel.setVisible(true);
        TheDashboardView OnlyDashBoard = TheDashboardView.getInstance();
       // OnlyDashBoard.setVisible(true);
       // IndicatorControlPanel.setVisible(true);
        
        List<IView> views= new ArrayList<>();
        views.add(OnlyDashBoard);
        views.add(IndicatorControlPanel);
        UpdateIndicators model = new UpdateIndicators(views);
        TheController controller= new TheController(IndicatorControlPanel,model);
        IndicatorControlPanel.ActivateIndicatorsControls(controller);
       // OnlyDashBoard.setVisible(true);
      //  IndicatorControlPanel.setVisible(true);
        
      //  OnlyDashBoard.setLocation(50,100);
        
    }
}
