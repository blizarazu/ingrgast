/*
 * CurrencyCellRenderer.java
 *
 * Created on 21 de agosto de 2007, 18:57
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.gui;

import java.awt.Color;
import java.awt.Component;
import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * 
 * @author Blizarazu
 */
public class CurrencyCellRenderer extends JLabel implements TableCellRenderer{
    
    /** Creates a new instance of CurrencyCellRenderer */
    public CurrencyCellRenderer() {
        try {
            setHorizontalAlignment(RIGHT);
            double d = Double.valueOf(getText());
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            setText(nf.format(d));
            if(d > 0)
                setForeground(Color.GREEN);
            else if (d == 0)
                setForeground(Color.BLACK);
            else if (d < 0)
                setForeground(Color.RED);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 
     * @param table 
     * @param value 
     * @param isSelected 
     * @param hasFocus 
     * @param row 
     * @param column 
     * @return 
     */
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         setText((value == null) ? "" : value.toString());
        return this;
    }
    
       
}
