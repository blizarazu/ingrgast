/*
 * ConceptoTest.java
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
public class ConceptoTest extends TestCase {
    
    public ConceptoTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ConceptoTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo getID , de la clase ingrGast.objects.Concepto.
     */
    public void testGetID() {
        System.out.println("getID");
        
        Concepto instance = null;
        
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getMotivo , de la clase ingrGast.objects.Concepto.
     */
    public void testGetMotivo() {
        System.out.println("getMotivo");
        
        Concepto instance = null;
        
        String expResult = "";
        String result = instance.getMotivo();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getProveedor , de la clase ingrGast.objects.Concepto.
     */
    public void testGetProveedor() {
        System.out.println("getProveedor");
        
        Concepto instance = null;
        
        String expResult = "";
        String result = instance.getProveedor();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getReceptor , de la clase ingrGast.objects.Concepto.
     */
    public void testGetReceptor() {
        System.out.println("getReceptor");
        
        Concepto instance = null;
        
        String expResult = "";
        String result = instance.getReceptor();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setID , de la clase ingrGast.objects.Concepto.
     */
    public void testSetID() {
        System.out.println("setID");
        
        int ID = 0;
        Concepto instance = null;
        
        instance.setID(ID);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo toString , de la clase ingrGast.objects.Concepto.
     */
    public void testToString() {
        System.out.println("toString");
        
        Concepto instance = null;
        
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
