package ingrGast.gui.util.TreeTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import javax.swing.tree.TreePath;
import org.jdesktop.swingx.treetable.AbstractTreeTableModel;
import org.jdesktop.swingx.treetable.MutableTreeTableNode;
import org.jdesktop.swingx.treetable.TreeTableNode;
import org.jdesktop.swingx.treetable.TreeTableNode;

public class ComparationModel extends AbstractTreeTableModel {

    /** The <code>List</code> of column identifiers. */
    protected List<String> columnIdentifiers;
    private boolean useAutoCalculatedIdentifiers;

    /**
     * Creates a new {@code DefaultTreeTableModel} with a {@code null} root.
     */
    public ComparationModel() {
        this(null);
    }

    /**
     * Creates a new {@code DefaultTreeTableModel} with the specified
     * {@code root}. {@code asksAllowsChildren} is disabled and {@code isLeaf}
     * will provide the same semantics as {@code AbstractTreeTableModel.isLeaf}.
     * 
     * @param root
     *            the root node of the tree
     */
    public ComparationModel(TreeTableNode root) {
        this(root, null);
    }

    /**
     * Creates a new {@code DefaultTreeTableModel} with the specified
     * {@code root}. {@code asksAllowsChildren} is disabled and {@code isLeaf}
     * will provide the same semantics as {@code AbstractTreeTableModel.isLeaf}.
     * 
     * @param root
     *            the root node of the tree
     */
    public ComparationModel(TreeTableNode root, List<String> columnNames) {
        super(root);
        setColumnIdentifiers(columnNames);

    }

    private boolean isValidTreeTableNode(Object node) {
        boolean result = false;

        if (node instanceof ComparacionTreeTableNode) {
            TreeTableNode ttn = (ComparacionTreeTableNode) node;

            while (!result && ttn != null) {
                result = ttn == root;

                ttn = ttn.getParent();
            }
        }

        return result;
    }

    /**
     * Replaces the column identifiers in the model. If the number of
     * <code>newIdentifier</code>s is greater than the current number of
     * columns, new columns are added to the end of each row in the model. If
     * the number of <code>newIdentifier</code>s is less than the current
     * number of columns, all the extra columns at the end of a row are
     * discarded.
     * <p>
     * 
     * @param columnIdentifiers
     *            vector of column identifiers. If <code>null</code>, set the
     *            model to zero columns
     */
    // from DefaultTableModel
    public void setColumnIdentifiers(List<String> columnIdentifiers) {
        useAutoCalculatedIdentifiers = columnIdentifiers == null;

        this.columnIdentifiers = useAutoCalculatedIdentifiers
                ? getAutoCalculatedIdentifiers(getRoot())
                : columnIdentifiers;

        modelSupport.fireNewRoot();
    }

    private static List<String> getAutoCalculatedIdentifiers(
            TreeTableNode exemplar) {
        List<String> autoCalculatedIndentifiers = new ArrayList<String>();

        if (exemplar != null) {
            for (int i = 0,  len = exemplar.getColumnCount(); i < len; i++) {
                // forces getColumnName to use super.getColumnName
                autoCalculatedIndentifiers.add(null);
            }
        }

        return autoCalculatedIndentifiers;
    }

    /**
     * Returns the root of the tree. Returns {@code null} only if the tree has
     * no nodes.
     * 
     * @return the root of the tree
     * 
     * @throws ClassCastException
     *             if {@code root} is not a {@code TreeTableNode}. Even though
     *             subclasses have direct access to {@code root}, they should
     *             avoid accessing it directly.
     * @see AbstractTreeTableModel#root
     * @see #setRoot(TreeTableNode)
     */
    @Override
    public TreeTableNode getRoot() {
        return (TreeTableNode) root;
    }

    /**
     * Gets the value for the {@code node} at {@code column}.
     * 
     * @impl delegates to {@code TreeTableNode.getValueAt(int)}
     * @param node
     *            the node whose value is to be queried
     * @param column
     *            the column whose value is to be queried
     * @return the value Object at the specified cell
     * @throws IllegalArgumentException
     *             if {@code node} is not an instance of {@code TreeTableNode}
     *             or is not managed by this model, or {@code column} is not a
     *             valid column index
     */
    public Object getValueAt(Object node, int column) {
        if (!isValidTreeTableNode(node)) {
            throw new IllegalArgumentException(
                    "node must be a valid node managed by this model");
        }

        if (column < 0 || column >= getColumnCount()) {
            throw new IllegalArgumentException("column must be a valid index");
        }

        TreeTableNode ttn = (TreeTableNode) node;

        if (column >= ttn.getColumnCount()) {
            return null;
        }

        return ttn.getValueAt(column);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValueAt(Object value, Object node, int column) {
        if (!isValidTreeTableNode(node)) {
            throw new IllegalArgumentException(
                    "node must be a valid node managed by this model");
        }

        if (column < 0 || column >= getColumnCount()) {
            throw new IllegalArgumentException("column must be a valid index");
        }

        ComparacionTreeTableNode ttn = (ComparacionTreeTableNode) node;

        if (column < ttn.getColumnCount()) {
            ttn.setValueAt(value, column);

            modelSupport.firePathChanged(new TreePath(getPathToRoot(ttn)));
        } else {
            ttn.addColumn(value);

            modelSupport.firePathChanged(new TreePath(getPathToRoot(ttn)));
        }
    }

    /**
     * {@inheritDoc}
     */
    public int getColumnCount() {
        return columnIdentifiers.size();
    }

    /**
     * {@inheritDoc}
     */
    // Can we make getColumnClass final and avoid the complex DTM copy? -- kgs
    @Override
    public String getColumnName(int column) {
        // Copied from DefaultTableModel.
        Object id = null;

        // This test is to cover the case when
        // getColumnCount has been subclassed by mistake ...
        if (column < columnIdentifiers.size() && (column >= 0)) {
            id = columnIdentifiers.get(column);
        }

        return (id == null) ? super.getColumnName(column) : id.toString();
    }

    @Override
    public Class<?> getColumnClass(int index) {
        if (index > 0) {
            return Double.class;
        } else {
            return String.class;
        }
    }

    /**
     * {@inheritDoc}
     */
    public Object getChild(Object parent, int index) {
        if (!isValidTreeTableNode(parent)) {
            throw new IllegalArgumentException(
                    "parent must be a TreeTableNode managed by this model");
        }

        return ((TreeTableNode) parent).getChildAt(index);
    }

    /**
     * {@inheritDoc}
     */
    public int getChildCount(Object parent) {
        if (!isValidTreeTableNode(parent)) {
            throw new IllegalArgumentException(
                    "parent must be a TreeTableNode managed by this model");
        }

        return ((TreeTableNode) parent).getChildCount();
    }

    /**
     * {@inheritDoc}
     */
    public int getIndexOfChild(Object parent, Object child) {
        if (!isValidTreeTableNode(parent)) {
            throw new IllegalArgumentException(
                    "parent must be a TreeTableNode managed by this model");
        }

        if (!isValidTreeTableNode(parent)) {
            throw new IllegalArgumentException(
                    "child must be a TreeTableNode managed by this model");
        }

        return ((TreeTableNode) parent).getIndex((TreeTableNode) child);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCellEditable(Object node, int column) {
        if (!isValidTreeTableNode(node)) {
            throw new IllegalArgumentException(
                    "node must be a valid node managed by this model");
        }

        if (column < 0 || column >= getColumnCount()) {
            throw new IllegalArgumentException("column must be a valid index");
        }

        TreeTableNode ttn = (TreeTableNode) node;

        if (column >= ttn.getColumnCount()) {
            return false;
        }

        return ttn.isEditable(column);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isLeaf(Object node) {
        if (!isValidTreeTableNode(node)) {
            throw new IllegalArgumentException(
                    "node must be a TreeTableNode managed by this model");
        }

        return ((TreeTableNode) node).isLeaf();
    }

    /**
     * Gets the path from the root to the specified node.
     * 
     * @param aNode
     *            the node to query
     * @return an array of {@code TreeTableNode}s, where
     *         {@code arr[0].equals(getRoot())} and
     *         {@code arr[arr.length - 1].equals(aNode)}, or an empty array if
     *         the node is not found.
     * @throws NullPointerException
     *             if {@code aNode} is {@code null}
     */
    public TreeTableNode[] getPathToRoot(TreeTableNode aNode) {
        List<TreeTableNode> path = new ArrayList<TreeTableNode>();
        TreeTableNode node = aNode;

        while (node != root) {
            path.add(0, node);

            node = (TreeTableNode) node.getParent();
        }

        if (node == root) {
            path.add(0, node);
        }

        return path.toArray(new TreeTableNode[0]);
    }

    /**
     * Sets the root for this table model. If no column identifiers have been
     * specified, this will rebuild the identifier list, using {@code root} as
     * an examplar of the table.
     * 
     * @param root
     *            the node to set as root
     */
    public void setRoot(TreeTableNode root) {
        this.root = root;

        if (useAutoCalculatedIdentifiers) {
            // rebuild the list
            //this already fires an event don't duplicate
            setColumnIdentifiers(null);
        } else {
            modelSupport.fireNewRoot();
        }
    }

    /**
     * Invoked this to insert newChild at location index in parents children.
     * This will then message nodesWereInserted to create the appropriate event.
     * This is the preferred way to add children as it will create the
     * appropriate event.
     */
    public void insertNodeInto(MutableTreeTableNode newChild,
            MutableTreeTableNode parent, int index) {
        parent.insert(newChild, index);

        modelSupport.fireChildAdded(new TreePath(getPathToRoot(parent)), index,
                newChild);
    }

    /**
     * Message this to remove node from its parent. This will message
     * nodesWereRemoved to create the appropriate event. This is the preferred
     * way to remove a node as it handles the event creation for you.
     */
    public void removeNodeFromParent(MutableTreeTableNode node) {
        MutableTreeTableNode parent = (MutableTreeTableNode) node.getParent();

        if (parent == null) {
            throw new IllegalArgumentException("node does not have a parent.");
        }

        int index = parent.getIndex(node);
        node.removeFromParent();

        modelSupport.fireChildRemoved(new TreePath(getPathToRoot(parent)),
                index, node);
    }

    public void addColumn(String columnName, Hashtable<String, Double> data) {
        columnIdentifiers.add(columnName);

        TreeTableNode rootNode = (TreeTableNode) root;

        //setValueAt(data.get(rootNode.getUserObject()), root, columnIdentifiers.size() - 1);
        List<? extends TreeTableNode> children = Collections.list(rootNode.children());
        for (TreeTableNode node : children) {
            if (data.get(node.getUserObject()) != null) {
                setValueAt(data.get(node.getUserObject()), node, columnIdentifiers.size() - 1);
            } else {
                setValueAt(new Double(0.0), node, columnIdentifiers.size() - 1);
            }
            List<? extends TreeTableNode> children2 = Collections.list(node.children());
            for (TreeTableNode node2 : children2) {
                if (data.get(node2.getUserObject()) != null) {
                    setValueAt(data.get(node2.getUserObject()), node2, columnIdentifiers.size() - 1);
                } else {
                    setValueAt(new Double(0.0), node2, columnIdentifiers.size() - 1);
                }
            }
        }

        modelSupport.fireNewRoot();
    }

    public void removeColumn(int index) {
        columnIdentifiers.remove(index);
        ComparacionTreeTableNode rootNode = (ComparacionTreeTableNode) root;
//        if (index < rootNode.getColumnCount()) {
//            rootNode.removeColumn(index);
//        }
        List<ComparacionTreeTableNode> children = (List<ComparacionTreeTableNode>) Collections.list(rootNode.children());
        for (ComparacionTreeTableNode node : children) {
            if (index < node.getColumnCount()) {
                node.removeColumn(index);
            }
            if (!node.isLeaf()) {
                List<ComparacionTreeTableNode> nodeChildren = (List<ComparacionTreeTableNode>) Collections.list(node.children());
                for (ComparacionTreeTableNode child : nodeChildren) {
                    if (index < child.getColumnCount()) {
                        child.removeColumn(index);
                    }
                }
            }
        }
        modelSupport.fireNewRoot();
    }

    public List<String> getColumnIdentifiers() {
        return columnIdentifiers;
    }
}
