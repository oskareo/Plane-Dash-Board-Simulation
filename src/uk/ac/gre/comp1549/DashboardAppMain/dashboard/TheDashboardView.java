package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import AutopilotBean.AutopilotBean;
import AutopilotBean.ISwitchAP;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.events.DashBoardEvent;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.events.DashBoardEventListener;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls.BarPanel;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls.DialPanel;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls.DigitalPanel;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls.SwitchDrawPanel;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls.SwitchPanel;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls.TheIndicator;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.scriptreader.DashboardEventGeneratorFromXML;

/**
 * TheDashboard.java Contains the main method for the Dashboard demo
 application. It: a) provides the controller screen which allows user input
 * which is passed to the display indicators, b) allows the user to run the XML
 * script which changes indicator values, c) creates the dashboard JFrame and
 * adds display indicators to it.
 *
 * @author COMP1549
 * @version 2.0
 */

//This is the view part of the MVC design pattern
public class TheDashboardView extends JFrame implements IView , IIndicators, ISwitchAP{

    /**
     * Name of the XML script file - change here if you want to use a different
     * filename
     */
//    public static final String XML_SCRIPT = "dashboard_script.xml";
    //instance of the singleton dashboard pattern
    public static TheDashboardView DashboardMainInstance = null;

    // fields that appear on the control panel
//    private JTextField txtSpeedValueInput;
//    
//    private JTextField txtPetrolValueInput;
//    private JButton btnScript;

    // fields that appear on the dashboard itself
//    private DialPanel speedDial= new DialPanel();
//    private DialPanel petrolDial=new DialPanel();
//    private BarPanel petrolBar= new BarPanel();
    
     private TheIndicator speedDial= new DialPanel();
     private TheIndicator autoPilotSwitch= new SwitchPanel();
    private TheIndicator petrolDial=new DialPanel();
    private TheIndicator petrolBar= new BarPanel();
    private TheIndicator timeDigital= new DigitalPanel();
    public Timer t;
   // private AutopilotBean autoPilot = AutopilotBean.getInstance();

    /**
     * Constructor. Does maybe more work than is good for a constructor.
     */
    //This the panel with all the indicators
    public TheDashboardView() {
       // this.setVisible(true);
        // Set up the dashboard screen        
        JFrame dashboard = new JFrame("Demo dashboard");
        dashboard.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        dashboard.setLayout(new FlowLayout());

        // add the speed Dial
       // speedDial = new DialPanel();
        speedDial.setLabel("SPEED");
        dashboard.add(speedDial);

        // add the petrol Dial
       // petrolDial = new DialPanel();
        petrolDial.setLabel("PETROL");
        petrolDial.setValue(100);
        dashboard.add(petrolDial);

        // add the petrol Bar
       // petrolBar = new BarPanel();
        petrolBar.setLabel("PETROL");
        petrolBar.setValue(100);
        dashboard.add(petrolBar);
       // this.add(dashboard);
        timeDigital.setLabel("TIME");
       // timeDigital.setValue(10);
       dashboard.add(timeDigital);
        
       autoPilotSwitch.setLabel("AUTOPILOT");
       autoPilotSwitch.setSwitchValue(false);
       
        dashboard.add(autoPilotSwitch);
        
        dashboard.pack();
        
        setVisible(true);
        setLocationRelativeTo(null);


        // centre the dashboard frame above the control frame
       // dashboard.setVisible(true);
        Point topLeft = this.getLocationOnScreen(); // top left of control frame (this)
        int hControl = this.getHeight(); // height of control frame (this)
        int wControl = this.getWidth(); // width of control frame (this)
        int hDash = dashboard.getHeight(); // height of dashboard frame 
        int wDash = dashboard.getWidth(); // width of dashboard frame 
        // calculate where top left of the dashboard goes to centre it over the control frame
        Point p2 = new Point((int) topLeft.getX() - (wDash - wControl) / 2, (int) topLeft.getY() - (hDash + hControl));
        dashboard.setLocation(p2);
        dashboard.setVisible(true);
        this.setVisible(false);
        
    }

    //singleton pattern being used
    public static synchronized TheDashboardView getInstance()
    {
        if(DashboardMainInstance==null){
        
        DashboardMainInstance= new TheDashboardView();
        }
    return DashboardMainInstance;
    }
    /**
     * Run the XML script file which generates events for the dashboard
     * indicators
     */
//    private void runXMLScript() {
//        try {
//            DashboardEventGeneratorFromXML dbegXML = new DashboardEventGeneratorFromXML();
//
//            // Register for speed events from the XML script file
//            DashBoardEventListener dbelSpeed = new DashBoardEventListener() {
//                @Override
//                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
//                    speedDial.setValue(Integer.parseInt(dbe.getValue()));
//                }
//            };
//            dbegXML.registerDashBoardEventListener("speed", dbelSpeed);
//
//            // Register for petrol events from the XML script file
//            DashBoardEventListener dbelPetril = new DashBoardEventListener() {
//                @Override
//                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
//                    petrolDial.setValue(Integer.parseInt(dbe.getValue()));
//                    petrolBar.setValue(Integer.parseInt(dbe.getValue()));
//                }
//            };
//            dbegXML.registerDashBoardEventListener("petrol", dbelPetril);
//
//            // Process the script file - it willgenerate events as it runs
//            dbegXML.processScriptFile(XML_SCRIPT);
//
//        } catch (Exception ex) {
//            Logger.getLogger(TheDashboardView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    /**
     * Set the speed value to the value entered in the textfield.
     */
//    public void setSpeed() {
//        try {
//            int value = Integer.parseInt(txtSpeedValueInput.getText().trim());
//            speedDial.setValue(value);
//        } catch (NumberFormatException e) {
//        }
//        // don't set the speed if the input can't be parsed
//    }
//
//    /**
//     * Set the petrol value to the value entered in the textfield.
//     */
//    public void setPetrol() {
//        try {
//            int value = Integer.parseInt(txtPetrolValueInput.getText().trim());
//            petrolDial.setValue(value);
//            petrolBar.setValue(value);
//        } catch (NumberFormatException e) {
//        }
//        // don't set the speed if the input can't be parsed
//    }

    //public void refresh(String data) {
       

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    //@Override
   // @Override
    //@Override
     public void refresh(List<String> data) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    for (int i = 0; i < data.size(); i++)
//    { //indicators[i].refresh(count);
//        
//        if(data.get(i) instanceof speedValue)
//        {
//       
//        }
//    }
    }

    //@Override
    //@Override
   // @Override
     //gets the new values that the user enters
    public void updatePetrolBarIndicator(int data) {
//       int number=0;
//        for (int j=0;j>=data.size();j++)
//        {
//        if(data.get(j) instanceof java.lang.String)
//        {
        //number=Integer.parseInt(data.get(j));
         petrolBar.setValue(data); 
        //}
        }

    //@Override
    //gets the new values that the user enters
    public void updatePetrolDialIndicator(int p) {
        petrolDial.setValue(p);

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //  @Override
    //gets the new values that the user enters
    public void updateSpeedDialIndicator(int s) {
       
speedDial.setValue(s);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //  @Override
    //Update the clock
    //and gets the new values that the user enters 
    public void updteDigitalTimeIndicator(long[] t) {
        timeDigital.setTimeValue(t);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   // @Override
    public void isAutoPilot(String onOff) {
        //boolean theBool=false;
        if(onOff.equals("on"))
        {
           // theBool=true;
        autoPilotSwitch.setSwitchValue(true);
        }
        else if(onOff.equals("off"))
        {
        autoPilotSwitch.setSwitchValue(false);
        }
       // return theBool;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValue(int value) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTimeValue(long[] t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Timer theTimer() {
      return t;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    
    

    //@Override
    //@Override


    /**
     * Respond to user input in the Speed textfield
     */
//    private class SpeedValueListener implements DocumentListener {
//
//        @Override
//        public void insertUpdate(DocumentEvent event) {
//            setSpeed();
//        }
//
//        @Override
//        public void removeUpdate(DocumentEvent event) {
//            setSpeed();
//        }
//
//        @Override
//        public void changedUpdate(DocumentEvent event) {
//        }
//    }

    /**
     * Respond to user input in the Petrol textfield
     */
//    private class PetrolValueListener implements DocumentListener {
//
//        @Override
//        public void insertUpdate(DocumentEvent event) {
//            setPetrol();
//        }
//
//        @Override
//        public void removeUpdate(DocumentEvent event) {
//            setPetrol();
//        }
//
//        @Override
//        public void changedUpdate(DocumentEvent event) {
//        }
//    }

    /**
     *
     * @param args - unused
     */
   // public static void main(String[] args) {
       // final TheDashboard me = new TheDashboard();
   // }



//public class TheDashboardView extends JFrame implements IView{
//     public static final String XML_SCRIPT = "dashboard_script.xml";
//     private JTextField txtSpeedValueInput;
//    
//    private JTextField txtPetrolValueInput;
//    private JButton btnScript;
//public TheDashboardView(){
// //Use the MVC design pattern to separate the dashboard view from the controller and modell
//        // Set up the frame for the controller
//        setTitle("Dashboard demonstration controller");
//        setLayout(new FlowLayout());
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Speed Value:"));
//        txtSpeedValueInput = new JTextField("0", 3);
//        panel.add(txtSpeedValueInput);
//        DocumentListener speedListener = new TheDashboardView.SpeedValueListener();
//        txtSpeedValueInput.getDocument().addDocumentListener(speedListener);
//        panel.add(new JLabel("Petrol Value:"));
//        txtPetrolValueInput = new JTextField("0", 3);
//        panel.add(txtPetrolValueInput);
//        DocumentListener petrolListener = new TheDashboardView.PetrolValueListener();
//        txtPetrolValueInput.getDocument().addDocumentListener(petrolListener);
//        btnScript = new JButton("Run XML Script");
//      btnScript.setEnabled(false);
//
//        // When the button is read the XML script will be run
//        
//        btnScript.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new Thread() {
//                    public void run() {
//                        runXMLScript();
//                    }
//                }.start();
//            }
//        });
//        panel.add(btnScript);
//        add(panel);
//        pack();
//
//        setLocationRelativeTo(null); // display in centre of screen
//        this.setVisible(true);
//    
//}


//private void runXMLScript() {
//        try {
//            DashboardEventGeneratorFromXML dbegXML = new DashboardEventGeneratorFromXML();
//
//            // Register for speed events from the XML script file
//            DashBoardEventListener dbelSpeed = new DashBoardEventListener() {
//                @Override
//                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
//                    speedDial.setValue(Integer.parseInt(dbe.getValue()));
//                }
//            };
//            dbegXML.registerDashBoardEventListener("speed", dbelSpeed);
//
//            // Register for petrol events from the XML script file
//            DashBoardEventListener dbelPetril = new DashBoardEventListener() {
//                @Override
//                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
//                    petrolDial.setValue(Integer.parseInt(dbe.getValue()));
//                    petrolBar.setValue(Integer.parseInt(dbe.getValue()));
//                }
//            };
//            dbegXML.registerDashBoardEventListener("petrol", dbelPetril);
//
//            // Process the script file - it willgenerate events as it runs
//            dbegXML.processScriptFile(XML_SCRIPT);
//
//        } catch (Exception ex) {
//            Logger.getLogger(TheDashboardView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

// private class SpeedValueListener implements DocumentListener {
//
//        @Override
//        public void insertUpdate(DocumentEvent event) {
//            setSpeed();
//        }
//
//        @Override
//        public void removeUpdate(DocumentEvent event) {
//            setSpeed();
//        }
//
//        @Override
//        public void changedUpdate(DocumentEvent event) {
//        }
//    }
 
}
