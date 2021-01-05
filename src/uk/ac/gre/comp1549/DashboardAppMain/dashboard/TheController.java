/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import WatchBean.WatchListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.nio.file.WatchEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static uk.ac.gre.comp1549.DashboardAppMain.dashboard.TheDBoardControls.dbControlPanelInstance;

/**
 *
 * @author USER
 */
public class TheController implements ActionListener, DocumentListener,WatchListener, PropertyChangeListener {
    //public static TheController theControllerInstance=null;
    UpdateIndicators myModell;
            TheDBoardControls controlsView;
    
    public TheController(TheDBoardControls v, UpdateIndicators ui)
    {
    myModell=ui;
    controlsView=v;
    }
    
//    public static synchronized TheController getInstance()
//    {
//        if(theControllerInstance==null){
//        
//        theControllerInstance = new TheController(controlsView,myModell);
//        }
//    return theControllerInstance;
//    }

    //@Override
    public void actionPerformed(ActionEvent ae) {
      
      
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if(ae.getSource()==controlsView.getButton()){
      
        new Thread() {
                    public void run() {
                        myModell.runXMLScript();
                    }
                }.start();}
         if(ae.getSource()==controlsView.t)
        {
      myModell.UpdateTimeIndicator( myModell.getWatch());  
        }
    }

    //@Override
    public void insertUpdate(DocumentEvent de) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    myModell.UpdatePetrolIndicator(controlsView.getPetrol());
    myModell.UpdateSpeedIndicator(controlsView.getSpeed());
    
    }

    //@Override
    public void removeUpdate(DocumentEvent de) {
      myModell.UpdatePetrolIndicator(controlsView.getPetrol());
    myModell.UpdateSpeedIndicator(controlsView.getSpeed());
        
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void changedUpdate(DocumentEvent de) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 //   @Override
    public void StartTime(WatchBean.WatchEvent swe) {
      
     myModell.UpdateTimeIndicator( swe.getTime());   //swe.getTime();
// throw new UnsupportedOperationException("Not supp//orted yet."); //To change body of generated methods, choose Tools | Templates.
    }

   // @Override
    public void StopTime(WatchBean.WatchEvent swe) {
      
      myModell.UpdateTimeIndicator(swe.getTime());  //swe.getTime();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //  @Override
    public void UpdateTime(WatchBean.WatchEvent swe) {
      myModell.UpdateTimeIndicator(swe.getTime());
        
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void propertyChange(PropertyChangeEvent pce) {
     // pce.getNewValue()
        myModell.updateSwitchIndicator(pce.getNewValue());
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
