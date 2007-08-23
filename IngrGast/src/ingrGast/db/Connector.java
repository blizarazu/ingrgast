/*
 * Connector.java
 *
 * Created on 8 de agosto de 2007, 13:19
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.db;

import java.net.ConnectException;
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
    
    /**
     * The jdbc driver used to connect to the database
     */
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    /**
     * The URL of the server where the database is hosted
     */
    public static final String DATABASE_URL = "jdbc:mysql://localhost/ingrgast_db";

    private String username;
    private String password;
    
    private java.sql.Connection connection;
    private boolean connectedToDatabase = false;
    private java.sql.Statement statement;
    
    /**
     * Creates a new instance of Connector
     */
    public Connector(String user, String pass) throws SQLException {
        try {
            username = user;
            password = pass;
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, username, password);
            this.statement = (Statement) connection.createStatement();
            connectedToDatabase = true;
            System.out.println("Driverra Kargatuta");
        /*} catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
            System.exit(1);*/
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
            System.exit(1);
        } /*catch (Exception ex){
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
            System.exit(1);
        }*/
    }
    
    /**
     *
     * @return
     */
    public Connection getConnection(){
        return this.connection;
    }
    
    /**
     *
     * @return
     */
    public Statement getStatement() {
        return statement;
    }
    
    /**
     *
     * @throws java.sql.SQLException
     */
    public void close() throws SQLException{
        this.connection.close();
        this.statement.close();
        this.connectedToDatabase = false;
    }
    
    /**
     *
     * @return
     */
    public boolean isConnectedToDatabase() {
        return connectedToDatabase;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
