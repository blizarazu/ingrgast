/*
 * ConceptoManagerTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.management;

import junit.framework.*;
import ingrGast.db.ConceptoDB;
import ingrGast.db.Connector;
import ingrGast.objects.AsientoContable;
import ingrGast.objects.Concepto;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class ConceptoManagerTest extends TestCase {
    
    public ConceptoManagerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ConceptoManagerTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo read , de la clase ingrGast.management.ConceptoManager.
     */
    public void testRead() throws Exception {
        System.out.println("read");
        
        String fileName = "";
        ConceptoManager instance = null;
        
        Vector<Concepto> expResult = null;
        Vector<Concepto> result = instance.read(fileName);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo guardar , de la clase ingrGast.management.ConceptoManager.
     */
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        
        Concepto c = null;
        ConceptoManager instance = null;
        
        int expResult = 0;
        int result = instance.guardar(c);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo find , de la clase ingrGast.management.ConceptoManager.
     */
    public void testFind() throws Exception {
        System.out.println("find");
        
        Concepto con = null;
        ConceptoManager instance = null;
        
        Concepto expResult = null;
        Concepto result = instance.find(con);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getMotivos , de la clase ingrGast.management.ConceptoManager.
     */
    public void testGetMotivos() throws Exception {
        System.out.println("getMotivos");
        
        ConceptoManager instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getMotivos();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getProveedores , de la clase ingrGast.management.ConceptoManager.
     */
    public void testGetProveedores() throws Exception {
        System.out.println("getProveedores");
        
        ConceptoManager instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getProveedores();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getReceptores , de la clase ingrGast.management.ConceptoManager.
     */
    public void testGetReceptores() throws Exception {
        System.out.println("getReceptores");
        
        ConceptoManager instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getReceptores();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarMotivo , de la clase ingrGast.management.ConceptoManager.
     */
    public void testEditarMotivo() throws Exception {
        System.out.println("editarMotivo");
        
        String motivo = "";
        String nuevoMotivo = "";
        ConceptoManager instance = null;
        
        instance.editarMotivo(motivo, nuevoMotivo);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarProveedor , de la clase ingrGast.management.ConceptoManager.
     */
    public void testEditarProveedor() throws Exception {
        System.out.println("editarProveedor");
        
        String proveedor = "";
        String nuevoProveedor = "";
        ConceptoManager instance = null;
        
        instance.editarProveedor(proveedor, nuevoProveedor);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarReceptor , de la clase ingrGast.management.ConceptoManager.
     */
    public void testEditarReceptor() throws Exception {
        System.out.println("editarReceptor");
        
        String receptor = "";
        String nuevoReceptor = "";
        ConceptoManager instance = null;
        
        instance.editarReceptor(receptor, nuevoReceptor);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
