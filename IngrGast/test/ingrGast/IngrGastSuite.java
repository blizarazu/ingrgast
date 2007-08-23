/*
 * IngrGastSuite.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast;

import junit.framework.*;

/**
 *
 * @author Beñat
 */
public class IngrGastSuite extends TestCase {
    
    public IngrGastSuite(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * metodo de conjunto generado automaticamente por el modulo JUnit
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("IngrGastSuite");
        suite.addTest(ingrGast.interfaces.InterfacesSuite.suite());
        suite.addTest(ingrGast.db.DbSuite.suite());
        suite.addTest(ingrGast.gui.GuiSuite.suite());
        suite.addTest(ingrGast.management.ManagementSuite.suite());
        suite.addTest(ingrGast.objects.ObjectsSuite.suite());
        return suite;
    }
    
}
