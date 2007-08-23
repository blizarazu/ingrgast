/*
 * NuevoAsientoDialogTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import ingrGast.management.Manager;
import ingrGast.objects.AsientoContable;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Beñat
 */
public class NuevoAsientoDialogTest extends TestCase {
    
    public NuevoAsientoDialogTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NuevoAsientoDialogTest.class);
        
        return suite;
    }

    /**
     * Prueba del metodo setData , de la clase ingrGast.gui.NuevoAsientoDialog.
     */
    public void testSetData() {
        System.out.println("setData");
        
        NuevoAsientoDialog instance = null;
        
        instance.setData();
        
        // TODO revisar el cadigo de prueba generado y eliminar la llamada predeterminada que falta.
        fail("El caso de prueba es un prototipo.");
    }
    
}
