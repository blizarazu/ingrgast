/*
 * GrupoTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.objects;

import junit.framework.*;
import java.io.Serializable;

/**
 *
 * @author Beñat
 */
public class GrupoTest extends TestCase {
    
    public GrupoTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GrupoTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo getID , de la clase ingrGast.objects.Grupo.
     */
    public void testGetID() {
        System.out.println("getID");
        
        Grupo instance = null;
        
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getNombre , de la clase ingrGast.objects.Grupo.
     */
    public void testGetNombre() {
        System.out.println("getNombre");
        
        Grupo instance = null;
        
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setID , de la clase ingrGast.objects.Grupo.
     */
    public void testSetID() {
        System.out.println("setID");
        
        int ID = 0;
        Grupo instance = null;
        
        instance.setID(ID);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo toString , de la clase ingrGast.objects.Grupo.
     */
    public void testToString() {
        System.out.println("toString");
        
        Grupo instance = null;
        
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
