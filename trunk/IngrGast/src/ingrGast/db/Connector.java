/*
 * Connector.java
 *
 * Created on 8 de agosto de 2007, 13:19
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Beñat
 */
public class Connector {
    
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DATABASE_URL = "jdbc:mysql://localhost/ingrgast_db";
    public static final String USERNAME = "ingrgastuser";
    public static final String PASSWORD = "ingrgastuser";
    
    private java.sql.Connection connection;
    private boolean connectedToDatabase = false;
    private java.sql.Statement statement;
    
    /**
     * Creates a new instance of Connector
     */
    public Connector() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            this.statement = (Statement) connection.createStatement();
            connectedToDatabase = true;
            System.out.println("Driverra Kargatuta");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
            System.exit(1);
        }
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public Statement getStatement() {
        return statement;
    }
    
    public void close() throws SQLException{
        this.connection.close();
        this.statement.close();
        this.connectedToDatabase = false;
    }
    
    public boolean isConnectedToDatabase() {
        return connectedToDatabase;
    }
}
