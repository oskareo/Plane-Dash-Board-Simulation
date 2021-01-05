/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard;

import WatchBean.WatchActions;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static uk.ac.gre.comp1549.DashboardAppMain.dashboard.TheDBoardControls.XML_SCRIPT;
import static uk.ac.gre.comp1549.DashboardAppMain.dashboard.TheDashboardView.DashboardMainInstance;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.events.DashBoardEvent;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.events.DashBoardEventListener;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.scriptreader.DashboardEventGeneratorFromXML;

/**
 *
 * @author USER
 */
//This is the model part of the MVC
public class UpdateIndicators {
    
   // public static UpdateIndicators modelInstance=null;
    List<IView> indicators;
    List<String> speedIndicatorData= new ArrayList<>();;
    List<String> petrolIndicatorData= new ArrayList<>();;
   public int speedValue;
    public int petrolValue;
    public Object switchValue;
    public long[] timeValue=new long[3];
    public long[]timeScript=new long[3];
    public UpdateIndicators(List<IView> ind)
    {
        indicators=ind;
       // speedIndicatorData= new ArrayList<>();
       // petrolIndicatorData= new ArrayList<>();
    }
    
//    public void RunScript(List<String> s)
//    {
//        
//    }
//     public static synchronized UpdateIndicators getInstance()
//    {
//        if(modelInstance==null){
//        
//        modelInstance= new UpdateIndicators(indicators);
//        }
//    return modelInstance;
//    }
    public void UpdateSpeedIndicator(int s)
    {
    speedValue=s;
    //speedIndicatorData.add(speedValue);
    UpdateViews();
    
    }
    
    public void UpdatePetrolIndicator(int p)
    {
    petrolValue=p;
   // petrolIndicatorData.add(petrolValue);
    UpdateViews();
    
    }
    public void UpdateTimeIndicator(long[] t)
    {
    timeValue=t;
    UpdateViews();
    }
    
    public void runXMLScript() {
        try {
            //add the time update
            DashboardEventGeneratorFromXML dbegXML = new DashboardEventGeneratorFromXML();

            // Register for speed events from the XML script file
            DashBoardEventListener dbelSpeed = new DashBoardEventListener() {
                @Override
                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
                    //speedDial.setValue(
                         UpdateSpeedIndicator(Integer.parseInt(dbe.getValue()));  // Integer.parseInt(dbe.getValue());
                                //    );
                }
            };
            dbegXML.registerDashBoardEventListener("speed", dbelSpeed);

            // Register for petrol events from the XML script file
            DashBoardEventListener dbelPetril = new DashBoardEventListener() {
                @Override
                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
                   // petrolDial.setValue(
                           UpdatePetrolIndicator(Integer.parseInt(dbe.getValue()));// Integer.parseInt(dbe.getValue())
                                    //);
                   // petrolBar.setValue(
                            UpdatePetrolIndicator(Integer.parseInt(dbe.getValue()));
                                  //  );
                }
            };
            dbegXML.registerDashBoardEventListener("petrol", dbelPetril);

            DashBoardEventListener dbelWatch = new DashBoardEventListener() {
                @Override
                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
                    
                   
                     for (int i = 0; i < indicators.size(); i++)
    { //indicators[i].refresh(count);
        
        if(indicators.get(i) instanceof TheDBoardControls)
        {
             if(dbe.getValue().equals("start")){
                   indicators.get(i).theTimer().start();
             }
             if(dbe.getValue().equals("stop")){
                   indicators.get(i).theTimer().stop();
             }
        }
    }
                    
                    
                    
                  // UpdateTimeIndicator();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                UpdateTimeIndicator(timeScript);
                }           
            };
             dbegXML.registerDashBoardEventListener("watch", dbelWatch);
            
             DashBoardEventListener dbelAutoPilot = new DashBoardEventListener()
             {
                @Override
                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
                    updateSwitchIndicator(dbe.getValue());

//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
             
             };
             
             dbegXML.registerDashBoardEventListener("autopilot", dbelAutoPilot);
            // Process the script file - it willgenerate events as it runs
            dbegXML.processScriptFile(XML_SCRIPT);

        } catch (Exception ex) {
            Logger.getLogger(TheDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UpdateViews()
    {
    for (int i = 0; i < indicators.size(); i++)
    { //indicators[i].refresh(count);
        
        if(indicators.get(i) instanceof TheDashboardView)
        {
      indicators.get(i).updatePetrolBarIndicator(petrolValue);
      indicators.get(i).updatePetrolDialIndicator(petrolValue);
      indicators.get(i).updateSpeedDialIndicator(speedValue);
     indicators.get(i).updteDigitalTimeIndicator(timeValue);
     //String s=switchValue.toString();
  
        }
    }
    
    }

    void updateSwitchIndicator(Object newValue) {
      if (newValue.equals(null))
      {
      newValue="off";
      }
        switchValue=newValue;
        
        for (int i = 0; i < indicators.size(); i++)
    { //indicators[i].refresh(count);
        
        if(indicators.get(i) instanceof TheDashboardView)
        {
         indicators.get(i).isAutoPilot(switchValue.toString());
        }
    }
       // UpdateViews();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public long[] getWatch()
    {
    timeScript[0]=getHour();
    timeScript[1]=getMinute();
    timeScript[2]=getSecond();
   return timeScript;
    }
     public long getHour()
     {
           Calendar c = Calendar.getInstance();
        
          long  sendHour=c.get(Calendar.HOUR_OF_DAY);
                
               //txtHourTimeInput.getText();
    
     return sendHour; 
     }
         
      public long getMinute()
     {
         Calendar c = Calendar.getInstance();
         
     
          long  sendMinute=c.get(Calendar.MINUTE);;
                 
    
     return sendMinute;
     }
      
      public long getSecond()
      {
          
           Calendar c = Calendar.getInstance();
     
          long  sendSecond=c.get(Calendar.SECOND);
                
    
     return sendSecond;
      }
}
