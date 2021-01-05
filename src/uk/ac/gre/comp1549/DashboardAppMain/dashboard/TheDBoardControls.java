/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import AutopilotBean.AutopilotBean;
import WatchBean.WatchBean;
import WatchBean.WatchEvent;
import WatchBean.WatchListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author USER
 */
//This is the control part of the MVC design pattern
public class TheDBoardControls extends JFrame implements IView{

    public static TheDBoardControls dbControlPanelInstance = null;
     public static final String XML_SCRIPT = "dashboard_script.xml";
     JPanel panel = new JPanel();
     private JTextField txtSpeedValueInput= new JTextField("0", 3);
    
    private JTextField txtPetrolValueInput= new JTextField("0", 3);
    public JButton btnScript= new JButton("Run XML Script");
   // private JPanel timeControlPanel= new JPanel();
   // private JButton btnStartWatch = new JButton("Start Watch");
   // private JButton btnStopWatch = new JButton("Stop Watch");
   // private JButton btnResumeWatch = new JButton("Resume Watch");
   public WatchBean wb;//= WatchBean.getInstance();
    public Timer t;
   public AutopilotBean apb;
    
    public TheDBoardControls()
    {
        
          setTitle("Dashboard demonstration controller");
        setLayout(new FlowLayout());
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
       
        panel.add(new JLabel("Speed Value:"));
         panel.add(txtSpeedValueInput);
         
          panel.add(new JLabel("Petrol Value:"));
        panel.add(txtPetrolValueInput);
        
       // timeControlPanel.add(btnStartWatch);
       // timeControlPanel.add(btnStopWatch);
       // timeControlPanel.add(btnResumeWatch);
       
    //Use the MVC design pattern to separate the dashboard view from the controller and modell
        // Set up the frame for the controller
//        setTitle("Dashboard demonstration controller");
//        setLayout(new FlowLayout());
       

//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Speed Value:"));
       // txtSpeedValueInput = new JTextField("0", 3);
//        panel.add(txtSpeedValueInput);

//do this in...
       // DocumentListener speedListener = new TheDBoardControls.SpeedValueListener();
       // txtSpeedValueInput.getDocument().addDocumentListener(speedListener);
       
       //...between
       
      //  panel.add(new JLabel("Petrol Value:"));
       // txtPetrolValueInput = new JTextField("0", 3);
       // panel.add(txtPetrolValueInput);
        //DocumentListener petrolListener = new TheDBoardControls.PetrolValueListener();
        //txtPetrolValueInput.getDocument().addDocumentListener(petrolListener);
       // btnScript 
     // btnScript.setEnabled(false);
     // btnScript.setSize(5, 5);
       btnScript.setEnabled(true);
//       btnStartWatch.setEnabled(true);
//       btnStopWatch.setEnabled(true);
//       btnResumeWatch.setEnabled(true);
//       
       panel.add(btnScript);
       
       
       //panel.add(wb);
      //  panel.add(new JLabel("Time Control"));
      //  panel.add(timeControlPanel);
       
        add(panel);
       // wb.wbv.setValue("Time Control");
       wb=WatchBean.getInstance();
        wb.wbv.setValue("Time Control");
       add(wb);
      apb= AutopilotBean.getInstance();
       add(apb);
        pack();
        
         setLocationRelativeTo(null); // display in centre of screen
        this.setVisible(true);

        // When the button is read the XML script will be run
        
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

       // setLocationRelativeTo(null); // display in centre of 
        //sett thsi visible in the main method
     //   this.setVisible(true);
    
    }
     public static synchronized TheDBoardControls getInstance()
    {
        if(dbControlPanelInstance==null){
        
        dbControlPanelInstance = new TheDBoardControls();
        }
    return dbControlPanelInstance;
    }
     
    public void ActivateIndicatorsControls(TheController controller )
    {
//    setTitle("Dashboard demonstration controller");
//        setLayout(new FlowLayout());
//       
//         t = new Timer(1000, (ActionListener) wc);
//        panel.add(new JLabel("Speed Value:"));
//         panel.add(txtSpeedValueInput);
         
        // DocumentListener speedListener = new TheDBoardControls.SpeedValueListener();
        txtSpeedValueInput.getDocument().addDocumentListener((DocumentListener) controller);
       // controller.myModell.UpdateViews();
          t = new Timer(1000, (ActionListener) controller);
//         panel.add(new JLabel("Petrol Value:"));
//        panel.add(txtPetrolValueInput);
        
       // DocumentListener petrolListener = new TheDBoardControls.PetrolValueListener();
        txtPetrolValueInput.getDocument().addDocumentListener((DocumentListener) controller);
        
        
         btnScript.addActionListener(controller );
         wb.wbv.addWatchListener((WatchListener) controller);
      //  if(!(apb.ap.isSelected()==false)){
        apb.ap.addPropertyChangeListener((PropertyChangeListener)controller);
       // }
//         {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new Thread() {
//                    public void run() {
//                        runXMLScript();
//                    }
//                }.start();
//            }
//        }
        
        // btnScript.setEnabled(true);
//        panel.add(btnScript);
//        add(panel);
//        pack();
      //   setLocationRelativeTo(null); // display in centre of 
        //sett thsi visible in the main method
      //  this.setVisible(true);
    }
    
        /**
     * Set the speed value to the value entered in the textfield.
     */
    public int getSpeed() {
        int value=0;
        try {
             value = Integer.parseInt(txtSpeedValueInput.getText().trim());
            //update things likes like the comment below on the view dashboard
           // speedDial.setValue(value);
        } catch (NumberFormatException e) {
        }
        // don't set the speed if the input can't be parsed
   return value; }

    /**
     * Set the petrol value to the value entered in the textfield.
     */
    public int getPetrol() {
        int theValue = 0;
        try {
             theValue=Integer.parseInt(txtPetrolValueInput.getText().trim());
           // petrolDial.setValue(value);
           // petrolBar.setValue(value);
        } catch (NumberFormatException e) {
        }
        // don't set the speed if the input can't be parsed
  return theValue;  }
    //@Override
  //  public void refresh(String data) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

//    private static class SpeedValueListener implements DocumentListener {
//
//        public SpeedValueListener() {
//        }
//
//        @Override
//        public void insertUpdate(DocumentEvent de) {
//            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void removeUpdate(DocumentEvent de) {
//            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void changedUpdate(DocumentEvent de) {
//            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }

//    private static class PetrolValueListener implements DocumentListener {
//
//        public PetrolValueListener() {
//        }
//
//        @Override
//        public void insertUpdate(DocumentEvent de) {
//          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void removeUpdate(DocumentEvent de) {
//           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void changedUpdate(DocumentEvent de) {
//           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }

    @Override
    public void refresh(List<String> data) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePetrolBarIndicator(List<String> data) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePetrolDialIndicator(List<String> data) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateSpeedDialIndicator(List<String> data) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePetrolBarIndicator(int p) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePetrolDialIndicator(int p) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateSpeedDialIndicator(int s) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
//    public void StartTime(WatchEvent swe) {
//        
//        swe.getTime();
//        
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//   // @Override
//    public void StopTime(WatchEvent swe) {
//        swe.getTime();
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void updteDigitalTimeIndicator(long[] t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isAutoPilot(String onOff) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValue(int value) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTimeValue(long[] t) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   // @Override
    public Timer theTimer() {
      return t;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public JButton getButton()
    {
    return btnScript;
    }
}
