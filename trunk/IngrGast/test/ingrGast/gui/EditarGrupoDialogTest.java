/*
 * EditarGrupoDialogTest.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;
import ingrGast.management.Manager;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class EditarGrupoDialogTest extends TestCase {
    
    public EditarGrupoDialogTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(EditarGrupoDialogTest.class);
        
        return suite;
    }
    
}
