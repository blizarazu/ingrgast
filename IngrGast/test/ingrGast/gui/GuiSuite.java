/*
 * GuiSuite.java
 * JUnit based test
 *
 * Created on 22 de agosto de 2007, 13:12
 */

package ingrGast.gui;

import junit.framework.*;

/**
 *
 * @author Beñat
 */
public class GuiSuite extends TestCase {
    
    public GuiSuite(String testName) {
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
        TestSuite suite = new TestSuite("GuiSuite");
        suite.addTest(ingrGast.gui.EditarGrupoDialogTest.suite());
        suite.addTest(ingrGast.gui.UltimasEntradasPanelTest.suite());
        suite.addTest(ingrGast.gui.MainFormTest.suite());
        suite.addTest(ingrGast.gui.DatosFiltroPanelTest.suite());
        suite.addTest(ingrGast.gui.EditarAsientoDialogTest.suite());
        suite.addTest(ingrGast.gui.BalancePanelTest.suite());
        suite.addTest(ingrGast.gui.NuevoAsientoDialogTest.suite());
        suite.addTest(ingrGast.gui.CurrencyCellRendererTest.suite());
        suite.addTest(ingrGast.gui.EditarConceptoDialogTest.suite());
        return suite;
    }
    
}
