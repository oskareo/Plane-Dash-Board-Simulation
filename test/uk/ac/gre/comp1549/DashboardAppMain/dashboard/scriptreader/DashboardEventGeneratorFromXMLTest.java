/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.DashboardAppMain.dashboard.scriptreader;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import uk.ac.gre.comp1549.DashboardAppMain.dashboard.events.DashBoardEventListener;

/**
 *
 * @author USER
 */
public class DashboardEventGeneratorFromXMLTest {
    DashboardEventGeneratorFromXML instance;
    public DashboardEventGeneratorFromXMLTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of processScriptFile method, of class DashboardEventGeneratorFromXML.
     */
    @Test
    public void testProcessScriptFile() throws Exception {
        System.out.println("processScriptFile");
        String filename = "";
        DashboardEventGeneratorFromXML instance = new DashboardEventGeneratorFromXML();
        instance.processScriptFile(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startElement method, of class DashboardEventGeneratorFromXML.
     */
    @Test
    public void testStartElement() throws Exception {
        System.out.println("startElement");
        String namespaceURI = "";
        String localName = "";
        String qName = "";
        Attributes atts = null;
        DashboardEventGeneratorFromXML instance = new DashboardEventGeneratorFromXML();
        instance.startElement(namespaceURI, localName, qName, atts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of characters method, of class DashboardEventGeneratorFromXML.
     */
    @Test
    public void testCharacters() throws Exception {
        System.out.println("characters");
        char[] ch = null;
        int start = 0;
        int length = 0;
        DashboardEventGeneratorFromXML instance = new DashboardEventGeneratorFromXML();
        instance.characters(ch, start, length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endElement method, of class DashboardEventGeneratorFromXML.
     */
    @Test
    public void testEndElement() throws Exception {
        System.out.println("endElement");
        String uri = "";
        String localName = "";
        String qName = "";
        DashboardEventGeneratorFromXML instance = new DashboardEventGeneratorFromXML();
        instance.endElement(uri, localName, qName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerDashBoardEventListener method, of class DashboardEventGeneratorFromXML.
     */
    @Test
    public void testRegisterDashBoardEventListener() throws Exception {
        System.out.println("registerDashBoardEventListener");
        String type = "";
        DashBoardEventListener dbel = null;
        DashboardEventGeneratorFromXML instance = new DashboardEventGeneratorFromXML();
        instance.registerDashBoardEventListener(type, dbel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDashBoardEventListener method, of class DashboardEventGeneratorFromXML.
     */
    @Test
    public void testRemoveDashBoardEventListener() throws Exception {
        System.out.println("removeDashBoardEventListener");
        String type = "";
        DashBoardEventListener dbel = null;
        DashboardEventGeneratorFromXML instance = new DashboardEventGeneratorFromXML();
        instance.removeDashBoardEventListener(type, dbel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DashboardEventGeneratorFromXML.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        DashboardEventGeneratorFromXML.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
