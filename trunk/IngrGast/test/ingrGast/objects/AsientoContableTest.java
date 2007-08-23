/*
 * AsientoContableTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.objects;

import junit.framework.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Beñat
 */
public class AsientoContableTest extends TestCase {
    
    public AsientoContableTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AsientoContableTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo setID , de la clase ingrGast.objects.AsientoContable.
     */
    public void testSetID() {
        System.out.println("setID");
        
        int ID = 0;
        AsientoContable instance = null;
        
        instance.setID(ID);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getConceptoID , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetConceptoID() {
        System.out.println("getConceptoID");
        
        AsientoContable instance = null;
        
        int expResult = 0;
        int result = instance.getConceptoID();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getFecha , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetFecha() {
        System.out.println("getFecha");
        
        AsientoContable instance = null;
        
        Calendar expResult = null;
        Calendar result = instance.getFecha();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getGrupoID , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetGrupoID() {
        System.out.println("getGrupoID");
        
        AsientoContable instance = null;
        
        int expResult = 0;
        int result = instance.getGrupoID();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getID , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetID() {
        System.out.println("getID");
        
        AsientoContable instance = null;
        
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getImporte , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetImporte() {
        System.out.println("getImporte");
        
        AsientoContable instance = null;
        
        double expResult = 0.0;
        double result = instance.getImporte();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo constructDate , de la clase ingrGast.objects.AsientoContable.
     */
    public void testConstructDate() {
        System.out.println("constructDate");
        
        AsientoContable instance = null;
        
        instance.constructDate();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setGrupoID , de la clase ingrGast.objects.AsientoContable.
     */
    public void testSetGrupoID() {
        System.out.println("setGrupoID");
        
        int GrupoID = 0;
        AsientoContable instance = null;
        
        instance.setGrupoID(GrupoID);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setConceptoID , de la clase ingrGast.objects.AsientoContable.
     */
    public void testSetConceptoID() {
        System.out.println("setConceptoID");
        
        int ConceptoID = 0;
        AsientoContable instance = null;
        
        instance.setConceptoID(ConceptoID);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getGrupo , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetGrupo() {
        System.out.println("getGrupo");
        
        AsientoContable instance = null;
        
        String expResult = "";
        String result = instance.getGrupo();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getMotivo , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetMotivo() {
        System.out.println("getMotivo");
        
        AsientoContable instance = null;
        
        String expResult = "";
        String result = instance.getMotivo();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setGrupo , de la clase ingrGast.objects.AsientoContable.
     */
    public void testSetGrupo() {
        System.out.println("setGrupo");
        
        String Grupo = "";
        AsientoContable instance = null;
        
        instance.setGrupo(Grupo);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setMotivo , de la clase ingrGast.objects.AsientoContable.
     */
    public void testSetMotivo() {
        System.out.println("setMotivo");
        
        String Motivo = "";
        AsientoContable instance = null;
        
        instance.setMotivo(Motivo);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setReceptor , de la clase ingrGast.objects.AsientoContable.
     */
    public void testSetReceptor() {
        System.out.println("setReceptor");
        
        String Receptor = "";
        AsientoContable instance = null;
        
        instance.setReceptor(Receptor);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo setProveedor , de la clase ingrGast.objects.AsientoContable.
     */
    public void testSetProveedor() {
        System.out.println("setProveedor");
        
        String Proveedor = "";
        AsientoContable instance = null;
        
        instance.setProveedor(Proveedor);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getProveedor , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetProveedor() {
        System.out.println("getProveedor");
        
        AsientoContable instance = null;
        
        String expResult = "";
        String result = instance.getProveedor();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getReceptor , de la clase ingrGast.objects.AsientoContable.
     */
    public void testGetReceptor() {
        System.out.println("getReceptor");
        
        AsientoContable instance = null;
        
        String expResult = "";
        String result = instance.getReceptor();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo toString , de la clase ingrGast.objects.AsientoContable.
     */
    public void testToString() {
        System.out.println("toString");
        
        AsientoContable instance = null;
        
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
