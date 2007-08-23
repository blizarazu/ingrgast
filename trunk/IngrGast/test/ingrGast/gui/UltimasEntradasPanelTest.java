/*
 * UltimasEntradasPanelTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;
import ingrGast.db.Connector;
import ingrGast.db.ResultSetTableModel;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import ingrGast.objects.AsientoContable;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Beñat
 */
public class UltimasEntradasPanelTest extends TestCase {
    
    public UltimasEntradasPanelTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UltimasEntradasPanelTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo initData , de la clase ingrGast.gui.UltimasEntradasPanel.
     */
    public void testInitData() {
        System.out.println("initData");
        
        MainForm parent = null;
        UltimasEntradasPanel instance = new UltimasEntradasPanel();
        
        instance.initData(parent);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateData , de la clase ingrGast.gui.UltimasEntradasPanel.
     */
    public void testUpdateData() {
        System.out.println("updateData");
        
        UltimasEntradasPanel instance = new UltimasEntradasPanel();
        
        instance.updateData();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo disconnectResultSetTableModels , de la clase ingrGast.gui.UltimasEntradasPanel.
     */
    public void testDisconectResultSetTableModels() {
        System.out.println("disconectResultSetTableModels");
        
        UltimasEntradasPanel instance = new UltimasEntradasPanel();
        
        instance.disconnectResultSetTableModels();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
