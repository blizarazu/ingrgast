/*
 * InterfacesSuite.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.interfaces;

import junit.framework.*;

/**
 *
 * @author Beñat
 */
public class InterfacesSuite extends TestCase {
    
    public InterfacesSuite(String testName) {
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
        TestSuite suite = new TestSuite("InterfacesSuite");
        suite.addTest(ingrGast.interfaces.InsidePanelTest.suite());
        return suite;
    }
    
}
