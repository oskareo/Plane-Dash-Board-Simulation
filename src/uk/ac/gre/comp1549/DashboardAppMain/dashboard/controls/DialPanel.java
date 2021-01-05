package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.IView;

/**
 * DialPanel.  Container for DialDrawPanel to hold dial and label.
 * If a label is not needed DialDrawPanel an be used on its own
 *
 * @author COMP1549
 * @version 2.0
 */
public class DialPanel extends TheIndicator {

//    private DialDrawPanel dial;  // the dial itself
//    private JLabel lblTitle; // the label which always appears above the dial

    /**
     * Default constructor
     */
    public DialPanel() {
        setLayout(new BorderLayout());
        
        // set the style of the border
        setBorder(new BevelBorder(BevelBorder.LOWERED));

        // position the label above the dial
        type=new StringBuilder("dial");
        lblTitle = new JLabel();
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add(lblTitle, BorderLayout.NORTH);
       // dial = new DialDrawPanel();
       // add(dial, BorderLayout.CENTER);
       drawIndicatorType=dial;//new DialDrawPanel();
       add((Component) drawIndicatorType, BorderLayout.CENTER);

    }

    /**
     * Set the value for the dial
     * @param value - value for the dial
     */
//    public void setValue(int value) {
//        dial.setValue(value);
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
