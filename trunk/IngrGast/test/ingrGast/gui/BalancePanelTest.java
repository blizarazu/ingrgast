/*
 * BalancePanelTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import java.awt.Color;
import java.awt.Component;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Beñat
 */
public class BalancePanelTest extends TestCase {
    
    public BalancePanelTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(BalancePanelTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo initData , de la clase ingrGast.gui.BalancePanel.
     */
    public void testInitData() {
        System.out.println("initData");
        
        MainForm parent = null;
        BalancePanel instance = new BalancePanel();
        
        instance.initData(parent);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateData , de la clase ingrGast.gui.BalancePanel.
     */
    public void testUpdateData() {
        System.out.println("updateData");
        
        BalancePanel instance = new BalancePanel();
        
        instance.updateData();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo disconnectResultSetTableModels , de la clase ingrGast.gui.BalancePanel.
     */
    public void testDisconectResultSetTableModels() {
        System.out.println("disconectResultSetTableModels");
        
        BalancePanel instance = new BalancePanel();
        
        instance.disconnectResultSetTableModels();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
