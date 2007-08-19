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

/**
 *
 * @author Beñat
 */
public class Connector {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/ingrgast_db";
    private static final String USERNAME = "ingrgastuser";
    private static final String PASSWORD = "ingrgastuser";
    
    private java.sql.Connection connection;
    private boolean connectedToDatabase = false;
    
    /**
     * Creates a new instance of Connector
     */
    public Connector() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            connectedToDatabase = true;
            System.out.println("Driverra Kargatuta");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public void close() throws SQLException{
        this.connection.close();
        this.connectedToDatabase = false;
    }

    public boolean isConnectedToDatabase() {
        return connectedToDatabase;
    }
}
