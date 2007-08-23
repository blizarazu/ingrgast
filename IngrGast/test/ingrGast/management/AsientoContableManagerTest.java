/*
 * AsientoContableManagerTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.management;

import junit.framework.*;
import ingrGast.db.AsientoContableDB;
import ingrGast.db.Connector;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import ingrGast.objects.AsientoContable;

/**
 *
 * @author Be�at
 */
public class AsientoContableManagerTest extends TestCase {
    
    public AsientoContableManagerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AsientoContableManagerTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo read , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testRead() throws Exception {
        System.out.println("read");
        
        String fileName = "";
        AsientoContableManager instance = null;
        
        Vector<AsientoContable> expResult = null;
        Vector<AsientoContable> result = instance.read(fileName);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo guardar , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        
        AsientoContable as = null;
        AsientoContableManager instance = null;
        
        int expResult = 0;
        int result = instance.guardar(as);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getSUM , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testGetSUM() throws Exception {
        System.out.println("getSUM");
        
        int i = 0;
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        AsientoContableManager instance = null;
        
        double expResult = 0.0;
        double result = instance.getSUM(i, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo borrar , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testBorrar() throws Exception {
        System.out.println("borrar");
        
        int id = 0;
        AsientoContableManager instance = null;
        
        int expResult = 0;
        int result = instance.borrar(id);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo constructQuery , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testConstructQuery() {
        System.out.println("constructQuery");
        
        int i = 0;
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        AsientoContableManager instance = null;
        
        String expResult = "";
        String result = instance.constructQuery(i, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editar , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testEditar() throws Exception {
        System.out.println("editar");
        
        AsientoContable as = null;
        AsientoContableManager instance = null;
        
        instance.editar(as);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getFechas , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testGetFechas() throws Exception {
        System.out.println("getFechas");
        
        AsientoContableManager instance = null;
        
        Vector<Calendar> expResult = null;
        Vector<Calendar> result = instance.getFechas();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getIngresosA�o , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testGetIngresosA�o() throws Exception {
        System.out.println("getIngresosA�o");
        
        int a�o = 0;
        AsientoContableManager instance = null;
        
        Vector<Double> expResult = null;
        Vector<Double> result = instance.getIngresosA�o(a�o);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getGastosA�o , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testGetGastosA�o() throws Exception {
        System.out.println("getGastosA�o");
        
        int a�o = 0;
        AsientoContableManager instance = null;
        
        Vector<Double> expResult = null;
        Vector<Double> result = instance.getGastosA�o(a�o);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getTotalesA�o , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testGetTotalesA�o() throws Exception {
        System.out.println("getTotalesA�o");
        
        int a�o = 0;
        AsientoContableManager instance = null;
        
        Vector<Double> expResult = null;
        Vector<Double> result = instance.getTotalesA�o(a�o);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo constructLast , de la clase ingrGast.management.AsientoContableManager.
     */
    public void testConstructLast() {
        System.out.println("constructLast");
        
        int i = 0;
        AsientoContableManager instance = null;
        
        String expResult = "";
        String result = instance.constructLast(i);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
