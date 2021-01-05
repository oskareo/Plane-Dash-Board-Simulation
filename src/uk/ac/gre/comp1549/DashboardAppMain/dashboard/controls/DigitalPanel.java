/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author USER
 */
public class DigitalPanel extends TheIndicator {
    
    public DigitalPanel()
    {
    setLayout(new BorderLayout());
        // set the style of the border
        setBorder(new BevelBorder(BevelBorder.LOWERED));
type= new StringBuilder("digital");
        // position the label above the bar 
        lblTitle = new JLabel();
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
       // lblTitle.
        add(lblTitle, BorderLayout.NORTH);
       // bar = new BarDrawPanel();
      // drawIndicatorType= new DigitalDrawPanel();
      drawIndicatorType=digital;
       add((Component) drawIndicatorType, BorderLayout.CENTER);
    }
}
