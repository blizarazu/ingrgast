/*
 * InsidePanelTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.interfaces;

import junit.framework.*;
import ingrGast.gui.*;

/**
 *
 * @author Beñat
 */
public class InsidePanelTest extends TestCase {
    
    public InsidePanelTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(InsidePanelTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo initData , de la clase ingrGast.interfaces.InsidePanel.
     */
    public void testInitData() {
        System.out.println("initData");
        
        MainForm parent = null;
        InsidePanel instance = new InsidePanel();
        
        instance.initData(parent);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo updateData , de la clase ingrGast.interfaces.InsidePanel.
     */
    public void testUpdateData() {
        System.out.println("updateData");
        
        InsidePanel instance = new InsidePanel();
        
        instance.updateData();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Prueba del metodo disconnectResultSetTableModels , de la clase ingrGast.interfaces.InsidePanel.
     */
    public void testDisconectResultSetTableModels() {
        System.out.println("disconectResultSetTableModels");
        
        InsidePanel instance = new InsidePanel();
        
        instance.disconnectResultSetTableModels();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }

    /**
     * Implementacion generada de la clase abstracta ingrGast.interfaces.InsidePanel. Por favor llene los cuerpos de prueba de los metodos generados.
     */
    private class InsidePanelImpl implements InsidePanel {

        public void initData(ingrGast.gui.MainForm parent) {
            // TODO llene el cuerpo para proporcionar una implementacion de utilidad
            
        }

        public void updateData() {
            // TODO llene el cuerpo para proporcionar una implementacion de utilidad
            
        }

        public void disconnectResultSetTableModels() {
            // TODO llene el cuerpo para proporcionar una implementacion de utilidad
            
        }
    }

    
}
