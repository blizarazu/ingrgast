/*
 * InsidePanel.java
 *
 * Created on 20 de agosto de 2007, 20:27
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.interfaces;

import ingrGast.gui.*;

/**
 * Panel that is created into a MainFrame
 *
 * @author Blizarazu
 */
public interface InsidePanel {
    /**
     * Initialices the data into the panel
     *
     * @param parent The MainFrame where the InsidePanel is created
     */
    public void initData(MainFrame parent);
    /**
     * Updates de data of the InsidePannel
     */
    public void updateData();
    /**
     * Disconnects the ResultSetTableModels of the InsidePanel
     */
    public void disconnectResultSetTableModels();
}
