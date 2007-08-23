/*
 * ManagementSuite.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.management;

import junit.framework.*;

/**
 *
 * @author Beñat
 */
public class ManagementSuite extends TestCase {
    
    public ManagementSuite(String testName) {
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
        TestSuite suite = new TestSuite("ManagementSuite");
        suite.addTest(ingrGast.management.GrupoManagerTest.suite());
        suite.addTest(ingrGast.management.ConceptoManagerTest.suite());
        suite.addTest(ingrGast.management.ManagerTest.suite());
        suite.addTest(ingrGast.management.AsientoContableManagerTest.suite());
        return suite;
    }
    
}
