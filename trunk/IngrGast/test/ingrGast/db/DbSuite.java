/*
 * DbSuite.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.db;

import junit.framework.*;

/**
 *
 * @author Beñat
 */
public class DbSuite extends TestCase {
    
    public DbSuite(String testName) {
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
        TestSuite suite = new TestSuite("DbSuite");
        suite.addTest(ingrGast.db.GrupoDBTest.suite());
        suite.addTest(ingrGast.db.ResultSetTableModelTest.suite());
        suite.addTest(ingrGast.db.AsientoContableDBTest.suite());
        suite.addTest(ingrGast.db.ConnectorTest.suite());
        suite.addTest(ingrGast.db.ConceptoDBTest.suite());
        return suite;
    }
    
}
