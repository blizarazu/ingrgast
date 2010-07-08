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
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class GrupoDB {

    private Connection connection;

    /**
     * Creates a new instance of GrupoDB
     * @param con
     * @throws java.sql.SQLException
     */
    public GrupoDB(Connector con) throws SQLException {
        this.connection = con.getConnection();
    }

    public Hashtable<String, Double> getGastos() throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Gastos' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE Importe < 0 GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Gastos")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getGastos(int año) throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Gastos' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE Importe < 0 AND A.Fecha BETWEEN ? AND ? GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, año + "/1/1");
        ps.setString(2, año + "/12/31");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Gastos")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getGastos(Calendar calendar, Calendar calendar0) throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Gastos' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE Importe < 0 AND A.Fecha BETWEEN ? AND ? GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
        ps.setString(2, calendar0.get(Calendar.YEAR) + "/" + (calendar0.get(Calendar.MONTH)+1) + "/" + calendar0.get(Calendar.DAY_OF_MONTH));
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Gastos")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getIngresos() throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Ingresos' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE Importe >= 0 GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Ingresos")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getIngresos(int año) throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Ingresos' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE Importe >= 0 AND A.Fecha BETWEEN ? AND ? GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, año + "/1/1");
        ps.setString(2, año + "/12/31");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Ingresos")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getIngresos(Calendar calendar, Calendar calendar0) throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Ingresos' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE Importe >= 0 AND A.Fecha BETWEEN ? AND ? GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
        ps.setString(2, calendar0.get(Calendar.YEAR) + "/" + (calendar0.get(Calendar.MONTH)+1) + "/" + calendar0.get(Calendar.DAY_OF_MONTH));
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Ingresos")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getTotales() throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Importe' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Importe")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getTotales(int año) throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Importe' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE A.Fecha BETWEEN ? AND ? GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, año + "/1/1");
        ps.setString(2, año + "/12/31");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Importe")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    public Hashtable<String, Double> getTotales(Calendar calendar, Calendar calendar0) throws SQLException {
        Hashtable<String, Double> gastos = new Hashtable<String, Double>();
        String sql = "SELECT G.nombre AS Grupo, SUM(A.Importe) AS 'Total Importe' FROM grupos G INNER JOIN asientoscontables A ON G.ID = A.Grupo_ID WHERE A.Fecha BETWEEN ? AND ? GROUP BY G.ID";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
        ps.setString(2, calendar0.get(Calendar.YEAR) + "/" + (calendar0.get(Calendar.MONTH)+1) + "/" + calendar0.get(Calendar.DAY_OF_MONTH));
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            gastos.put(rs.getString("Grupo"), new Double(rs.getDouble("Total Importe")));
        }
        rs.close();
        ps.close();
        return gastos;
    }

    /**
     *
     * @param id
     * @param nombre
     * @throws java.sql.SQLException
     * @return
     */
    public int insert(int id, String nombre) throws SQLException {
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
    public int insert(String nombre) throws SQLException {
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
    public int find(String nombre) throws SQLException {
        String sql = "SELECT ID FROM grupos WHERE Nombre = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        int i;
        if (rs.next()) {
            i = rs.getInt("ID");
        } else {
            i = -1;
        }
        rs.close();
        ps.close();
        return i;
    }

    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getNombres() throws SQLException {
        String sql = "SELECT DISTINCT Nombre FROM grupos ORDER BY Nombre";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Vector<String> vNombres = new Vector<String>();
        while (rs.next()) {
            vNombres.addElement(rs.getString("Nombre"));
        }
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
