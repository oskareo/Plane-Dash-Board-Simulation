/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.controls;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;

import javax.swing.JPanel;
/**
 *
 * @author USER
 */
public class DigitalDrawPanel extends JPanel implements IDraw{
private long hourValue; // current value - will be indicated on the bar
private long minuteValue;
private long secondValue;

    private int digitalLength; // length/width of the bar
    private int digitalHeight; // height of the bar
    
    private int padding;
    private JLabel showHour= new JLabel(Long.toString(hourValue));
    private JLabel showMin= new JLabel(Long.toString(minuteValue));
    private JLabel showSec= new JLabel(Long.toString(secondValue));
    
    
    public DigitalDrawPanel()
    {
    this(80,50,8,0,0,0);
    }
    
    
    
    public DigitalDrawPanel(int length, int height, int padding, long hourvalue, long minvalue, long secvalue)
    {    
        setPreferredSize(new Dimension(length + (2 * padding), height + (2 * padding)));
        
    this.digitalLength=length;
    this.digitalHeight=height;
    this.padding= padding;
    this.hourValue= hourvalue;
    this.minuteValue= minvalue;
    this.secondValue= secvalue;
    
    
    this.add(showHour);
    this.add(showMin);
    this.add(showSec);
    
    }
    
    //@Override
    public void setTimeValue(long[] t) {
     
      this.hourValue=t[0];
      this.minuteValue=t[1];
      this.secondValue=t[2];
      showHour.setText(Long.toString(hourValue) );
      showMin.setText(Long.toString(minuteValue) );
      showSec.setText(Long.toString(secondValue) );
      
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   // @Override
    public void setValue(int value) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
