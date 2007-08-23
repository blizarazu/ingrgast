/*
 * MainFormTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Beñat
 */
public class MainFormTest extends TestCase {
    
    public MainFormTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MainFormTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo openNuevoAsientoDialog , de la clase ingrGast.gui.MainForm.
     */
    public void testOpenNuevoAsientoDialog() {
        System.out.println("openNuevoAsientoDialog");
        
        MainForm instance = new MainForm();
        
        instance.openNuevoAsientoDialog();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setCurrentDialog , de la clase ingrGast.gui.MainForm.
     */
    public void testSetCurrentDialog() {
        System.out.println("setCurrentDialog");
        
        Dialog currentDialog = null;
        MainForm instance = new MainForm();
        
        instance.setCurrentDialog(currentDialog);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getCurrentDialog , de la clase ingrGast.gui.MainForm.
     */
    public void testGetCurrentDialog() {
        System.out.println("getCurrentDialog");
        
        MainForm instance = new MainForm();
        
        Dialog expResult = null;
        Dialog result = instance.getCurrentDialog();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getManager , de la clase ingrGast.gui.MainForm.
     */
    public void testGetManager() {
        System.out.println("getManager");
        
        MainForm instance = new MainForm();
        
        Manager expResult = null;
        Manager result = instance.getManager();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateData , de la clase ingrGast.gui.MainForm.
     */
    public void testUpdateData() {
        System.out.println("updateData");
        
        MainForm instance = new MainForm();
        
        instance.updateData();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo main , de la clase ingrGast.gui.MainForm.
     */
    public void testMain() {
        System.out.println("main");
        
        String[] args = null;
        
        MainForm.main(args);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
