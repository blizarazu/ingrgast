package ingrGast.db;

import java.sql.*;
import javax.swing.JOptionPane;

import javax.swing.table.AbstractTableModel;

/**
 *
 * ResultSet rows and columns are counted from 1 and JTable
 * rows and columns are counted from 0. When processing
 * ResultSet rows or columns for use in a JTable, it is
 * necessary to add 1 to the row or column number to manipulate
 * the appropriate ResultSet column (i.e., JTable column 0 is
 * ResultSet column 1 and JTable row 0 is ResultSet row 1).
 */
public class ResultSetTableModel extends AbstractTableModel {
    
    private static final long serialVersionUID = 1L;
    
    private Connection connection;
    
    private Statement statement;
    
    private ResultSet resultSet;
    
    private ResultSetMetaData metaData;
    
    private int numberOfRows;
    
    private String lastQuery;
    
    // keep track of database connection status
    private boolean connectedToDatabase = false;
    
    /**
     *
     * constructor initializes resultSet and obtains its meta data object
     * determines number of rows
     *
     * @param driver
     * @param url
     * @param username
     * @param password
     * @param query
     */
    public ResultSetTableModel(String driver, String url, String username,
            String password, String query) {
        try {
            // load database driver class
            Class.forName(driver);
            // connect to database
            connection = DriverManager.getConnection(url, username, password);
            // create Statement to query database
            statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // update database connection status
            connectedToDatabase = true;
            try {
                // set query and execute it
                setQuery(query);
            } catch (IllegalStateException ex) {
                ex.printStackTrace();
                JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error de base de datos").setVisible(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error de base de datos").setVisible(true);
            }
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
        }
    } // end constructor ResultSetTableModel
    // get class that represents column type
    
    /**
     *
     * @param column
     * @throws java.lang.IllegalStateException
     * @return
     */
    public Class getColumnClass(int column) throws IllegalStateException {
        // ensure database connection is available
        if (!connectedToDatabase)
            throw new IllegalStateException("Not Connected to Database");
        // determine Java class of column
        try {
            String className = metaData.getColumnClassName(column + 1);
            // return Class object that represents className
            return Class.forName(className);
        } // end try
        catch (Exception exception) {
            exception.printStackTrace();
        } // end catch
        return Object.class; // if problems occur above, assume type Object
    } // end method getColumnClass
    // get number of columns in ResultSet
    
    /**
     *
     * @throws java.lang.IllegalStateException
     * @return
     */
    public int getColumnCount() throws IllegalStateException {
        // ensure database connection is available
        if (!connectedToDatabase)
            throw new IllegalStateException("Not Connected to Database");
        // determine number of columns
        try {
            return metaData.getColumnCount();
        } // end try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // end catch
        return 0; // if problems occur above, return 0 for number of columns
    } // end method getColumnCount
    // get name of a particular column in ResultSet
    
    /**
     *
     * @param column
     * @throws java.lang.IllegalStateException
     * @return
     */
    public String getColumnName(int column) throws IllegalStateException {
        // ensure database connection is available
        if (!connectedToDatabase)
            throw new IllegalStateException("Not Connected to Database");
        // determine column name
        try {
            return metaData.getColumnName(column + 1);
        } // end try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // end catch
        return ""; // if problems, return empty string for column name
    } // end method getColumnName
    // return number of rows in ResultSet
    
    /**
     *
     * @throws java.lang.IllegalStateException
     * @return
     */
    public int getRowCount() throws IllegalStateException {
        // ensure database connection is available
        if (!connectedToDatabase)
            throw new IllegalStateException("Not Connected to Database");
        return numberOfRows;
    } // end method getRowCount
    // obtain value in particular row and column
    
    /**
     *
     * @param row
     * @param column
     * @throws java.lang.IllegalStateException
     * @return
     */
    public Object getValueAt(int row, int column) throws IllegalStateException {
        // ensure database connection is available
        if (!connectedToDatabase)
            throw new IllegalStateException("Not Connected to Database");
        // obtain a value at specified ResultSet row and column
        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        } // end try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // end catch
        return ""; // if problems, return empty string object
    } // end method getValueAt
    // set new database query string
    
    /**
     *
     * @param query
     * @throws java.sql.SQLException
     * @throws java.lang.IllegalStateException
     */
    public void setQuery(String query) throws SQLException,
            IllegalStateException {
        // ensure database connection is available
        if (!connectedToDatabase)
            throw new IllegalStateException("Not Connected to Database");
        // specify query and execute it
        resultSet = statement.executeQuery(query);
        // obtain meta data for ResultSet
        metaData = resultSet.getMetaData();
        // determine number of rows in ResultSet
        resultSet.last(); // move to last row
        numberOfRows = resultSet.getRow(); // get row number
        // notify JTable that model has changed
        fireTableStructureChanged();
        this.lastQuery = query;
    } // end method setQuery
    // close Statement and Connection
    
    /**
     *
     * @throws java.sql.SQLException
     */
    public void refress() throws SQLException{
        this.setQuery(this.lastQuery);
    }
    
    
    /**
     * Closes the connection to the database and all the created statement.
     */
    public void disconnectFromDatabase() {
        if (!connectedToDatabase)
            return;
        // close Statement and Connection
        try {
            statement.close();
            connection.close();
        } // end try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // end catch
        finally // update database connection status
        {
            connectedToDatabase = false;
        } // end finally
    } // end method disconnectFromDatabase
} // end class ResultSetTableModel
