/*
 * GrupoDBTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.db;

import junit.framework.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class GrupoDBTest extends TestCase {
    
    public GrupoDBTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GrupoDBTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo insert , de la clase ingrGast.db.GrupoDB.
     */
    public void testInsert() throws Exception {
        System.out.println("insert");
        
        int id = 0;
        String nombre = "";
        GrupoDB instance = null;
        
        int expResult = 0;
        int result = instance.insert(id, nombre);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo find , de la clase ingrGast.db.GrupoDB.
     */
    public void testFind() throws Exception {
        System.out.println("find");
        
        String nombre = "";
        GrupoDB instance = null;
        
        int expResult = 0;
        int result = instance.find(nombre);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getNombres , de la clase ingrGast.db.GrupoDB.
     */
    public void testGetNombres() throws Exception {
        System.out.println("getNombres");
        
        GrupoDB instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getNombres();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo update , de la clase ingrGast.db.GrupoDB.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        
        String nombre = "";
        String nuevoNombre = "";
        GrupoDB instance = null;
        
        int expResult = 0;
        int result = instance.update(nombre, nuevoNombre);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
