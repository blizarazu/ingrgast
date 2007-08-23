/*
 * ResultSetTableModelTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.db;

import junit.framework.*;
import ingrGast.db.Connector;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Beñat
 */
public class ResultSetTableModelTest extends TestCase {
    
    public ResultSetTableModelTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ResultSetTableModelTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo getColumnClass , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testGetColumnClass() {
        System.out.println("getColumnClass");
        
        int column = 0;
        ResultSetTableModel instance = null;
        
        Class expResult = null;
        Class result = instance.getColumnClass(column);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getColumnCount , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        
        ResultSetTableModel instance = null;
        
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getColumnName , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testGetColumnName() {
        System.out.println("getColumnName");
        
        int column = 0;
        ResultSetTableModel instance = null;
        
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getRowCount , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testGetRowCount() {
        System.out.println("getRowCount");
        
        ResultSetTableModel instance = null;
        
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getValueAt , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testGetValueAt() {
        System.out.println("getValueAt");
        
        int row = 0;
        int column = 0;
        ResultSetTableModel instance = null;
        
        Object expResult = null;
        Object result = instance.getValueAt(row, column);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setQuery , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testSetQuery() throws Exception {
        System.out.println("setQuery");
        
        String query = "";
        ResultSetTableModel instance = null;
        
        instance.setQuery(query);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo refress , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testRefress() throws Exception {
        System.out.println("refress");
        
        ResultSetTableModel instance = null;
        
        instance.refress();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo disconnectFromDatabase , de la clase ingrGast.db.ResultSetTableModel.
     */
    public void testDisconnectFromDatabase() {
        System.out.println("disconnectFromDatabase");
        
        ResultSetTableModel instance = null;
        
        instance.disconnectFromDatabase();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
