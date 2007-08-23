/*
 * ManagerTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.management;

import junit.framework.*;
import ingrGast.db.Connector;
import ingrGast.objects.AsientoContable;
import ingrGast.objects.Concepto;
import ingrGast.objects.Grupo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Beñat
 */
public class ManagerTest extends TestCase {
    
    public ManagerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ManagerTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo importarAsientosContables , de la clase ingrGast.management.Manager.
     */
    public void testImportarAsientosContables() {
        System.out.println("importarAsientosContables");
        
        String fileName = "";
        Manager instance = new Manager();
        
        instance.importarAsientosContables(fileName);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo importarConceptos , de la clase ingrGast.management.Manager.
     */
    public void testImportarConceptos() {
        System.out.println("importarConceptos");
        
        String fileName = "";
        Manager instance = new Manager();
        
        instance.importarConceptos(fileName);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo importarGrupos , de la clase ingrGast.management.Manager.
     */
    public void testImportarGrupos() {
        System.out.println("importarGrupos");
        
        String fileName = "";
        Manager instance = new Manager();
        
        instance.importarGrupos(fileName);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo guardarAsientoContable , de la clase ingrGast.management.Manager.
     */
    public void testGuardarAsientoContable() {
        System.out.println("guardarAsientoContable");
        
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        double importe = 0.0;
        Calendar cal = null;
        Manager instance = new Manager();
        
        instance.guardarAsientoContable(grupo, motivo, proveedor, receptor, importe, cal);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getGruposNombres , de la clase ingrGast.management.Manager.
     */
    public void testGetGruposNombres() {
        System.out.println("getGruposNombres");
        
        Manager instance = new Manager();
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getGruposNombres();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getConceptosMotivos , de la clase ingrGast.management.Manager.
     */
    public void testGetConceptosMotivos() {
        System.out.println("getConceptosMotivos");
        
        Manager instance = new Manager();
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getConceptosMotivos();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getConceptosProveedores , de la clase ingrGast.management.Manager.
     */
    public void testGetConceptosProveedores() {
        System.out.println("getConceptosProveedores");
        
        Manager instance = new Manager();
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getConceptosProveedores();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getConceptosReceptores , de la clase ingrGast.management.Manager.
     */
    public void testGetConceptosReceptores() {
        System.out.println("getConceptosReceptores");
        
        Manager instance = new Manager();
        
        Vector<String> expResult = null;
        Vector<String> result = instance.getConceptosReceptores();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarGrupo , de la clase ingrGast.management.Manager.
     */
    public void testEditarGrupo() {
        System.out.println("editarGrupo");
        
        String nombre = "";
        String nuevoNombre = "";
        Manager instance = new Manager();
        
        instance.editarGrupo(nombre, nuevoNombre);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarConceptoMotivo , de la clase ingrGast.management.Manager.
     */
    public void testEditarConceptoMotivo() {
        System.out.println("editarConceptoMotivo");
        
        String motivo = "";
        String nuevoMotivo = "";
        Manager instance = new Manager();
        
        instance.editarConceptoMotivo(motivo, nuevoMotivo);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarConceptoProveedor , de la clase ingrGast.management.Manager.
     */
    public void testEditarConceptoProveedor() {
        System.out.println("editarConceptoProveedor");
        
        String proveedor = "";
        String nuevoProveedor = "";
        Manager instance = new Manager();
        
        instance.editarConceptoProveedor(proveedor, nuevoProveedor);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarConceptoReceptor , de la clase ingrGast.management.Manager.
     */
    public void testEditarConceptoReceptor() {
        System.out.println("editarConceptoReceptor");
        
        String receptor = "";
        String nuevoReceptor = "";
        Manager instance = new Manager();
        
        instance.editarConceptoReceptor(receptor, nuevoReceptor);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getTotalIngresos , de la clase ingrGast.management.Manager.
     */
    public void testGetTotalIngresos() {
        System.out.println("getTotalIngresos");
        
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        Manager instance = new Manager();
        
        double expResult = 0.0;
        double result = instance.getTotalIngresos(grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getTotalGastos , de la clase ingrGast.management.Manager.
     */
    public void testGetTotalGastos() {
        System.out.println("getTotalGastos");
        
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        Manager instance = new Manager();
        
        double expResult = 0.0;
        double result = instance.getTotalGastos(grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getTotal , de la clase ingrGast.management.Manager.
     */
    public void testGetTotal() {
        System.out.println("getTotal");
        
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        Manager instance = new Manager();
        
        double expResult = 0.0;
        double result = instance.getTotal(grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo constructQueryIngresos , de la clase ingrGast.management.Manager.
     */
    public void testConstructQueryIngresos() {
        System.out.println("constructQueryIngresos");
        
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        Manager instance = new Manager();
        
        String expResult = "";
        String result = instance.constructQueryIngresos(grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo constructQueryGastos , de la clase ingrGast.management.Manager.
     */
    public void testConstructQueryGastos() {
        System.out.println("constructQueryGastos");
        
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        Manager instance = new Manager();
        
        String expResult = "";
        String result = instance.constructQueryGastos(grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo constructQueryTotales , de la clase ingrGast.management.Manager.
     */
    public void testConstructQueryTotales() {
        System.out.println("constructQueryTotales");
        
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        Calendar fechaIni = null;
        Calendar fechaFin = null;
        Manager instance = new Manager();
        
        String expResult = "";
        String result = instance.constructQueryTotales(grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo borrarAsiento , de la clase ingrGast.management.Manager.
     */
    public void testBorrarAsiento() {
        System.out.println("borrarAsiento");
        
        int id = 0;
        Manager instance = new Manager();
        
        instance.borrarAsiento(id);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getConnector , de la clase ingrGast.management.Manager.
     */
    public void testGetConnector() {
        System.out.println("getConnector");
        
        Manager instance = new Manager();
        
        Connector expResult = null;
        Connector result = instance.getConnector();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo disconnectDB , de la clase ingrGast.management.Manager.
     */
    public void testDisconnectDB() {
        System.out.println("disconnectDB");
        
        Manager instance = new Manager();
        
        instance.disconnectDB();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo editarAsientoContable , de la clase ingrGast.management.Manager.
     */
    public void testEditarAsientoContable() {
        System.out.println("editarAsientoContable");
        
        int id = 0;
        String grupo = "";
        String motivo = "";
        String proveedor = "";
        String receptor = "";
        double importe = 0.0;
        Calendar fecha = null;
        Manager instance = new Manager();
        
        instance.editarAsientoContable(id, grupo, motivo, proveedor, receptor, importe, fecha);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getAñosAsientos , de la clase ingrGast.management.Manager.
     */
    public void testGetAñosAsientos() {
        System.out.println("getAñosAsientos");
        
        Manager instance = new Manager();
        
        Vector<Integer> expResult = null;
        Vector<Integer> result = instance.getAñosAsientos();
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo getBalanceAño , de la clase ingrGast.management.Manager.
     */
    public void testGetBalanceAño() {
        System.out.println("getBalanceAño");
        
        int año = 0;
        Manager instance = new Manager();
        
        Vector<Vector<Double>> expResult = null;
        Vector<Vector<Double>> result = instance.getBalanceAño(año);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo constructUltimosAsientos , de la clase ingrGast.management.Manager.
     */
    public void testConstructUltimosAsientos() {
        System.out.println("constructUltimosAsientos");
        
        int i = 0;
        Manager instance = new Manager();
        
        String expResult = "";
        String result = instance.constructUltimosAsientos(i);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
