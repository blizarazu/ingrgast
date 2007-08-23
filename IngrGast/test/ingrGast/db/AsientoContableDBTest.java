/*
 * AsientoContableDBTest.java
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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class AsientoContableDBTest extends TestCase {
    
    public AsientoContableDBTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AsientoContableDBTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo insert , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testInsert() throws Exception {
        System.out.println("insert");
        
        int conceptoID = 0;
        int grupoID = 0;
        double importe = 0.0;
        Calendar fecha = null;
        AsientoContableDB instance = null;
        
        int expResult = 0;
        int result = instance.insert(conceptoID, grupoID, importe, fecha);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo executeQuery , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testExecuteQuery() throws Exception {
        System.out.println("executeQuery");
        
        String sql = "";
        AsientoContableDB instance = null;
        
        ResultSet expResult = null;
        ResultSet result = instance.executeQuery(sql);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo delete , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testDelete() throws Exception {
        System.out.println("delete");
        
        int id = 0;
        AsientoContableDB instance = null;
        
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo SUM , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testSUM() throws Exception {
        System.out.println("SUM");
        
        String s = "";
        AsientoContableDB instance = null;
        
        double expResult = 0.0;
        double result = instance.SUM(s);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo update , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        
        int id = 0;
        int cId = 0;
        int gId = 0;
        double imp = 0.0;
        Calendar fecha = null;
        AsientoContableDB instance = null;
        
        int expResult = 0;
        int result = instance.update(id, cId, gId, imp, fecha);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getDates , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testGetDates() throws Exception {
        System.out.println("getDates");
        
        AsientoContableDB instance = null;
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getDates();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getIngresos , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testGetIngresos() throws Exception {
        System.out.println("getIngresos");
        
        int mes = 0;
        int año = 0;
        AsientoContableDB instance = null;
        
        double expResult = 0.0;
        double result = instance.getIngresos(mes, año);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getGastos , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testGetGastos() throws Exception {
        System.out.println("getGastos");
        
        int mes = 0;
        int año = 0;
        AsientoContableDB instance = null;
        
        double expResult = 0.0;
        double result = instance.getGastos(mes, año);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getTotales , de la clase ingrGast.db.AsientoContableDB.
     */
    public void testGetTotales() throws Exception {
        System.out.println("getTotales");
        
        int mes = 0;
        int año = 0;
        AsientoContableDB instance = null;
        
        double expResult = 0.0;
        double result = instance.getTotales(mes, año);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
