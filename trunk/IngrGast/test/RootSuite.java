import junit.framework.*;
/*
 * RootSuite.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

/**
 *
 * @author Beñat
 */
public class RootSuite extends TestCase {
    
    public RootSuite(String testName) {
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
        TestSuite suite = new TestSuite("RootSuite");
        suite.addTest(ingrGast.IngrGastSuite.suite());
        return suite;
    }
    
}
