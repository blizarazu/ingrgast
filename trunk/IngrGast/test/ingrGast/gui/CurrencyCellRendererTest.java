/*
 * CurrencyCellRendererTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;
import java.awt.Color;
import java.awt.Component;
import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Beñat
 */
public class CurrencyCellRendererTest extends TestCase {
    
    public CurrencyCellRendererTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CurrencyCellRendererTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo getTableCellRendererComponent , de la clase ingrGast.gui.CurrencyCellRenderer.
     */
    public void testGetTableCellRendererComponent() {
        System.out.println("getTableCellRendererComponent");
        
        JTable table = null;
        Object value = null;
        boolean isSelected = true;
        boolean hasFocus = true;
        int row = 0;
        int column = 0;
        CurrencyCellRenderer instance = new CurrencyCellRenderer();
        
        Component expResult = null;
        Component result = instance.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        assertEquals(expResult, result);
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
