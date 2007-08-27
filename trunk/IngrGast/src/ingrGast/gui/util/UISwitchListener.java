/*
 * UISwitchListener.java
 *
 * Created on 24 de agosto de 2007, 11:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.gui.util;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beñat
 */
public class UISwitchListener implements PropertyChangeListener{
    
    JComponent componentToSwitch;
    /** Creates a new instance of UISwitchListener */
    public UISwitchListener(JComponent c) {
        componentToSwitch = c;
    }
    
    public void propertyChange(PropertyChangeEvent e) {
        String name = e.getPropertyName();
        if (name.equals("lookAndFeel")) {
            SwingUtilities.updateComponentTreeUI(componentToSwitch);
            componentToSwitch.invalidate();
            componentToSwitch.validate();
            componentToSwitch.repaint();
        }
    }
}
