package ingrGast.gui.themes;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;

/**
 * This class describes a theme using "blue-green" colors.
 *
 * @version 1.4 04/23/99
 * @author Steve Wilson
 */
public class AquaMetalTheme extends DefaultMetalTheme {
    
    public String getName() { return "Oxide"; }
    
    private final ColorUIResource primary1 = new ColorUIResource(102, 153, 153);
    private final ColorUIResource primary2 = new ColorUIResource(128, 192, 192);
    private final ColorUIResource primary3 = new ColorUIResource(159, 235, 235);
    
    protected ColorUIResource getPrimary1() { return primary1; }
    protected ColorUIResource getPrimary2() { return primary2; }
    protected ColorUIResource getPrimary3() { return primary3; }
    
}