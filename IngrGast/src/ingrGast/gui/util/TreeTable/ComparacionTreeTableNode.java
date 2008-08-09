package ingrGast.gui.util.TreeTable;

import java.util.Vector;
import org.jdesktop.swingx.treetable.AbstractMutableTreeTableNode;
import org.jdesktop.swingx.treetable.TreeTableNode;

public class ComparacionTreeTableNode extends AbstractMutableTreeTableNode implements TreeTableNode{

    private Vector<Object> data;

    public ComparacionTreeTableNode() {
        super();
        data = new Vector<Object>();
    }

    public ComparacionTreeTableNode(Object userObject) {
        super(userObject);
        data = new Vector<Object>();
        data.add(0, userObject);
    }

    public ComparacionTreeTableNode(Object userObject, boolean allowsChildren) {
        super(userObject, allowsChildren);
        data = new Vector<Object>();
        data.add(0, userObject);
    }

    public Object getValueAt(int column) {
        if (column == 0) {
            return userObject;
        } else {
            return data.elementAt(column);
        }
    }

    @Override
    public void setValueAt(Object aValue, int column) {
        if (column == 0) {
            setUserObject(aValue);
        } else if (column < getColumnCount())  {
            data.setElementAt(aValue, column);
        } else
            addColumn(aValue);
    }

    public int getColumnCount() {
        return data.size();
    }

    @Override
    public void setUserObject(Object userObject) {
        super.setUserObject(userObject);
        if (data.firstElement() == null) {
            data.add(0, userObject);
        } else {
            data.setElementAt(userObject, 0);
        }
    }

    void addColumn(Object value) {
        data.addElement(value);
    }
    
    void removeColumn(int column){
        if(column > 0)
            data.remove(column);
    }
}
