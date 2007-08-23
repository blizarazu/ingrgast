/*
 * GrupoDB.java
 *
 * Created on 9 de agosto de 2007, 18:42
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class GrupoDB {
    
    private Connection connection;
    private Statement statement;
    
    /**
     * Creates a new instance of GrupoDB
     * @param con 
     * @throws java.sql.SQLException 
     */
    public GrupoDB(Connector con) throws SQLException {
        this.connection = con.getConnection();
        this.statement = con.getStatement();
    }
    
    /**
     * 
     * @param id 
     * @param nombre 
     * @throws java.sql.SQLException 
     * @return 
     */
    public int insert(int id, String nombre) throws SQLException{
        String sql = "INSERT INTO grupos SET ID=?, Nombre=?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, nombre);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
    
    /**
     * 
     * @param nombre 
     * @throws java.sql.SQLException 
     * @return 
     */
    public int insert(String nombre) throws SQLException{
        String sql = "INSERT INTO grupos SET Nombre = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, nombre);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
    
    /**
     * 
     * @param nombre 
     * @throws java.sql.SQLException 
     * @return 
     */
    public int find(String nombre) throws SQLException{
        String sql = "SELECT ID FROM grupos WHERE Nombre = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        int i;
        if(rs.next())
            i = rs.getInt("ID");
        else
            i = -1;
        rs.close();
        ps.close();
        return i;
    }
    
    /**
     * 
     * @throws java.sql.SQLException 
     * @return 
     */
    public Vector<String> getNombres() throws SQLException{
        String sql = "SELECT DISTINCT Nombre FROM grupos ORDER BY Nombre";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Vector<String> vNombres = new Vector<String>();
        while(rs.next())
            vNombres.addElement(rs.getString("Nombre"));
        rs.close();
        ps.close();
        return vNombres;
    }

    /**
     * 
     * @param nombre 
     * @param nuevoNombre 
     * @throws java.sql.SQLException 
     * @return 
     */
    public int update(String nombre, String nuevoNombre) throws SQLException {
        String sql = "UPDATE grupos SET Nombre = ? WHERE Nombre = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, nuevoNombre);
        ps.setString(2, nombre);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
}
