/*
 * ObjectsSuite.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.objects;

import junit.framework.*;

/**
 *
 * @author Beñat
 */
public class ObjectsSuite extends TestCase {
    
    public ObjectsSuite(String testName) {
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
        TestSuite suite = new TestSuite("ObjectsSuite");
        suite.addTest(ingrGast.objects.GrupoTest.suite());
        suite.addTest(ingrGast.objects.ConceptoTest.suite());
        suite.addTest(ingrGast.objects.AsientoContableTest.suite());
        return suite;
    }
    
}
