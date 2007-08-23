/*
 * ConnectorTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.db;

import junit.framework.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Beñat
 */
public class ConnectorTest extends TestCase {
    
    public ConnectorTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ConnectorTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo getConnection , de la clase ingrGast.db.Connector.
     */
    public void testGetConnection() {
        System.out.println("getConnection");
        
        Connector instance = new Connector();
        
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getStatement , de la clase ingrGast.db.Connector.
     */
    public void testGetStatement() {
        System.out.println("getStatement");
        
        Connector instance = new Connector();
        
        Statement expResult = null;
        Statement result = instance.getStatement();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo close , de la clase ingrGast.db.Connector.
     */
    public void testClose() throws Exception {
        System.out.println("close");
        
        Connector instance = new Connector();
        
        instance.close();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo isConnectedToDatabase , de la clase ingrGast.db.Connector.
     */
    public void testIsConnectedToDatabase() {
        System.out.println("isConnectedToDatabase");
        
        Connector instance = new Connector();
        
        boolean expResult = true;
        boolean result = instance.isConnectedToDatabase();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
