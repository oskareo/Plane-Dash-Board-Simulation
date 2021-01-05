package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.IView;

/**
 * BarPanel. Container for BarDrawPanel to hold bar and label. If a label is not
 * needed BarDrawPanel an be used on its own
 *
 * @author COMP1549
 * @version 2.0
 */
public class BarPanel extends TheIndicator{

//    private BarDrawPanel bar; // the bar itself
//    private JLabel lblTitle; // the label which always appears above the bar
 
    /**
     * Default constructor
     */
    public BarPanel() {
        
        type= new StringBuilder("bar");
       // startThread(type.toString());
       // bar= new BarDrawPanel();
       // setLayout(new BorderLayout());
        setLayout(new FlowLayout());
       // setLayout(new BorderLayout())
        // set the style of the border
        setBorder(new BevelBorder(BevelBorder.LOWERED));

        // position the label above the bar 
        lblTitle = new JLabel();
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
       // lblTitle.
        add(lblTitle, BorderLayout.NORTH);
       // bar = new BarDrawPanel();
       //drawIndicatorType= new BarDrawPanel();
       drawIndicatorType=bar;
       add((Component) drawIndicatorType, BorderLayout.CENTER);
//        add(bar, BorderLayout.CENTER);

    }

    /**
     * Set the value for the bar
     *
     * @param value - value for the bar
     */
//    public void setValue(int value) {
//        bar.setValue(value);
//    }

    /**
     *
     * @param label - label to appear above the dial
     */
//    public void setLabel(String label) {
//        lblTitle.setText(label);
//    }

//    public void refresh(String data) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public void refresh(List<String> data) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
