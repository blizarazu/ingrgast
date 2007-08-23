/*
 * ConceptoDBTest.java
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
public class ConceptoDBTest extends TestCase {
    
    public ConceptoDBTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ConceptoDBTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo insert , de la clase ingrGast.db.ConceptoDB.
     */
    public void testInsert() throws Exception {
        System.out.println("insert");
        
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        ConceptoDB instance = null;
        
        int expResult = 0;
        int result = instance.insert(motivo, proveedor, receptor);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo find , de la clase ingrGast.db.ConceptoDB.
     */
    public void testFind() throws Exception {
        System.out.println("find");
        
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        ConceptoDB instance = null;
        
        int expResult = 0;
        int result = instance.find(motivo, proveedor, receptor);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getMotivos , de la clase ingrGast.db.ConceptoDB.
     */
    public void testGetMotivos() throws Exception {
        System.out.println("getMotivos");
        
        ConceptoDB instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getMotivos();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getProveedores , de la clase ingrGast.db.ConceptoDB.
     */
    public void testGetProveedores() throws Exception {
        System.out.println("getProveedores");
        
        ConceptoDB instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getProveedores();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getReceptores , de la clase ingrGast.db.ConceptoDB.
     */
    public void testGetReceptores() throws Exception {
        System.out.println("getReceptores");
        
        ConceptoDB instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getReceptores();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateProveedor , de la clase ingrGast.db.ConceptoDB.
     */
    public void testUpdateProveedor() throws Exception {
        System.out.println("updateProveedor");
        
        String proveedor = "";
        String nuevoProveedor = "";
        ConceptoDB instance = null;
        
        int expResult = 0;
        int result = instance.updateProveedor(proveedor, nuevoProveedor);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateMotivo , de la clase ingrGast.db.ConceptoDB.
     */
    public void testUpdateMotivo() throws Exception {
        System.out.println("updateMotivo");
        
        String motivo = "";
        String nuevoMotivo = "";
        ConceptoDB instance = null;
        
        int expResult = 0;
        int result = instance.updateMotivo(motivo, nuevoMotivo);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateReceptor , de la clase ingrGast.db.ConceptoDB.
     */
    public void testUpdateReceptor() throws Exception {
        System.out.println("updateReceptor");
        
        String receptor = "";
        String nuevoReceptor = "";
        ConceptoDB instance = null;
        
        int expResult = 0;
        int result = instance.updateReceptor(receptor, nuevoReceptor);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
