/*
 * GrupoManagerTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.management;

import junit.framework.*;
import ingrGast.db.Connector;
import ingrGast.db.GrupoDB;
import ingrGast.objects.Concepto;
import ingrGast.objects.Grupo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class GrupoManagerTest extends TestCase {
    
    public GrupoManagerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GrupoManagerTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo read , de la clase ingrGast.management.GrupoManager.
     */
    public void testRead() throws Exception {
        System.out.println("read");
        
        String fileName = "";
        GrupoManager instance = null;
        
        Vector<Grupo> expResult = null;
        Vector<Grupo> result = instance.read(fileName);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo guardar , de la clase ingrGast.management.GrupoManager.
     */
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        
        Grupo g = null;
        GrupoManager instance = null;
        
        int expResult = 0;
        int result = instance.guardar(g);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo find , de la clase ingrGast.management.GrupoManager.
     */
    public void testFind() throws Exception {
        System.out.println("find");
        
        Grupo g = null;
        GrupoManager instance = null;
        
        Grupo expResult = null;
        Grupo result = instance.find(g);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getNombres , de la clase ingrGast.management.GrupoManager.
     */
    public void testGetNombres() throws Exception {
        System.out.println("getNombres");
        
        GrupoManager instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getNombres();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editar , de la clase ingrGast.management.GrupoManager.
     */
    public void testEditar() throws Exception {
        System.out.println("editar");
        
        String nombre = "";
        String nuevoNombre = "";
        GrupoManager instance = null;
        
        int expResult = 0;
        int result = instance.editar(nombre, nuevoNombre);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
