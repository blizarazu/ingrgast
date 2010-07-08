/*
 * RowHeaderRenderer.java
 *
 * Created on 21 de agosto de 2007, 18:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.gui.util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Beñat
 */
public class RowHeaderRenderer extends JLabel implements TableCellRenderer {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RowHeaderRenderer(JTable table) {
        JTableHeader header = table.getTableHeader();
        setOpaque(true);
        setBorder(UIManager.getBorder("JTableHeader.cellBorder"));
        setHorizontalAlignment(RIGHT);
        setForeground(header.getForeground());
        setBackground(header.getBackground());
        setFont(header.getFont());
    }
    
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        setText((value == null) ? "" : value.toString());
        return this;
    }
}
