/*
 * DatosFiltroPanelTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;
import com.toedter.calendar.JTextFieldDateEditor;
import ingrGast.db.Connector;
import ingrGast.db.ResultSetTableModel;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import ingrGast.objects.AsientoContable;
import java.awt.Color;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Beñat
 */
public class DatosFiltroPanelTest extends TestCase {
    
    public DatosFiltroPanelTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DatosFiltroPanelTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo initData , de la clase ingrGast.gui.DatosFiltroPanel.
     */
    public void testInitData() {
        System.out.println("initData");
        
        MainForm parent = null;
        DatosFiltroPanel instance = new DatosFiltroPanel();
        
        instance.initData(parent);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateData , de la clase ingrGast.gui.DatosFiltroPanel.
     */
    public void testUpdateData() {
        System.out.println("updateData");
        
        DatosFiltroPanel instance = new DatosFiltroPanel();
        
        instance.updateData();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo disconnectResultSetTableModels , de la clase ingrGast.gui.DatosFiltroPanel.
     */
    public void testDisconectResultSetTableModels() {
        System.out.println("disconectResultSetTableModels");
        
        DatosFiltroPanel instance = new DatosFiltroPanel();
        
        instance.disconnectResultSetTableModels();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
