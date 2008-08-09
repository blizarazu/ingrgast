/*
 * AsientoContableDB.java
 *
 * Created on 7 de agosto de 2007, 15:05
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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Blizarazu
 */
public class AsientoContableDB {
    
    private Connection connection;
    private Statement statement;
    
    /**
     * Creates a new instance of AsientoContableDB
     * @param con
     * @throws java.sql.SQLException
     */
    public AsientoContableDB(Connector con) throws SQLException {
        this.connection = con.getConnection();
        this.statement = con.getStatement();
        Calendar cal = new GregorianCalendar();
    }
    
    /**
     *
     * @param conceptoID
     * @param grupoID
     * @param importe
     * @param fecha
     * @throws java.sql.SQLException
     * @return
     */
    public int insert(int conceptoID, int grupoID, double importe, Calendar fecha) throws SQLException{
        String sql = "INSERT INTO asientoscontables SET Concepto_ID = ?, Grupo_ID = ?, importe = ?, Fecha = ?, Fecha_creacion = NOW()";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, conceptoID);
        ps.setInt(2, grupoID);
        ps.setDouble(3, importe);
        ps.setString(4, fecha.get(Calendar.YEAR) + "/" + String.valueOf(fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.DAY_OF_MONTH));
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
    
    /**
     *
     * @param ID
     * @param conceptoID
     * @param grupoID
     * @param importe
     * @param fecha
     * @throws java.sql.SQLException
     * @return
     */
    public int insert(int ID, int conceptoID, int grupoID, double importe, Calendar fecha) throws SQLException{
        String sql = "INSERT INTO asientoscontables SET ID=?, Concepto_ID = ?, Grupo_ID = ?, importe = ?, Fecha = ?, Fecha_creacion = NOW()";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, ID);
        ps.setInt(2, conceptoID);
        ps.setInt(3, grupoID);
        ps.setDouble(4, importe);
        ps.setString(5, fecha.get(Calendar.YEAR) + "/" + String.valueOf(fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.DAY_OF_MONTH));
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
    
    /**
     *
     * @param sql
     * @throws java.sql.SQLException
     * @return
     */
    public ResultSet executeQuery(String sql) throws SQLException {
        return statement.executeQuery(sql);
    }
    
    /**
     *
     * @param id
     * @throws java.sql.SQLException
     * @return
     */
    public int delete(int id) throws SQLException {
        String sql = "DELETE FROM asientoscontables WHERE ID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
    
    /**
     *
     * @param s
     * @throws java.sql.SQLException
     * @return
     */
    public double SUM(String s) throws SQLException {
        String sql = "SELECT SUM(Importe) AS Total FROM asientoscontables AS A INNER JOIN conceptos AS C ON A.Concepto_ID = C.ID INNER JOIN grupos AS G ON A.Grupo_ID = G.ID WHERE " + s;
        ResultSet rs = statement.executeQuery(sql);
        double result = 0;
        if (rs.next()){
            result = rs.getDouble("Total");
        }
        rs.close();
        return result;
    }
    
    /**
     *
     * @param id
     * @param cId
     * @param gId
     * @param imp
     * @param fecha
     * @throws java.sql.SQLException
     * @return
     */
    public int update(int id, int cId, int gId, double imp, Calendar fecha) throws SQLException {
        String sql = "UPDATE asientoscontables SET Concepto_ID = ?, Grupo_ID = ?, Importe = ?, Fecha = ? WHERE ID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, cId);
        ps.setInt(2, gId);
        ps.setDouble(3, imp);
        ps.setString(4, fecha.get(Calendar.YEAR) + "/" + String.valueOf(fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.DAY_OF_MONTH));
        ps.setInt(5, id);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
    
    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getDates() throws SQLException {
        String sql = "SELECT Fecha FROM asientoscontables ORDER BY Fecha DESC";
        ResultSet rs = statement.executeQuery(sql);
        Vector<String> vDate = new Vector<String>();
        while(rs.next())
            vDate.addElement(rs.getString("Fecha"));
        return vDate;
    }
    
    /**
     *
     * @param mes
     * @param año
     * @throws java.sql.SQLException
     * @return
     */
    public double getIngresos(int mes, int año) throws SQLException{
        return getIngresos(1, 31, mes, mes, año, año);
    }
    
    /**
     *
     * @param mes1
     * @param mes2
     * @param año
     * @throws java.sql.SQLException
     * @return
     */
    public double getIngresos(int mes1, int mes2, int año) throws SQLException{
        return getIngresos(1, 31, mes1, mes2, año, año);
    }
    
    /**
     *
     * @param mes1
     * @param mes2
     * @param año
     * @throws java.sql.SQLException
     * @return
     */
    public double getIngresos(int dia1, int dia2, int mes1, int mes2, int año, int año2) throws SQLException{
        String sql = "SELECT SUM(Importe) AS Total FROM asientoscontables WHERE Importe >= 0 AND Fecha BETWEEN ? AND ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.valueOf(año) + "/" + String.valueOf(mes1) + "/" + dia1);
        ps.setString(2, String.valueOf(año2) + "/" + String.valueOf(mes2) + "/" + dia2);
        ResultSet rs = ps.executeQuery();
        double result = 0;
        if(rs.next())
            result = rs.getDouble("Total");
        rs.close();
        ps.close();
        return result;
    }
    
    /**
     *
     * @param mes
     * @param año
     * @throws java.sql.SQLException
     * @return
     */
    public double getGastos(int mes, int año) throws SQLException{
        return getGastos(1, 31, mes, mes, año, año);
    }
    
    /**
     *
     * @param mes1
     * @param mes2
     * @param año
     * @throws java.sql.SQLException
     * @return
     */
    public double getGastos(int mes1, int mes2, int año) throws SQLException{
        return getGastos(1, 31, mes1, mes2, año, año);
    }
    
    public double getGastos(int dia1, int dia2, int mes1, int mes2, int año1, int año2) throws SQLException{
        String sql = "SELECT SUM(Importe) AS Total FROM asientoscontables WHERE Importe < 0 AND Fecha BETWEEN ? AND ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.valueOf(año1) + "/" + String.valueOf(mes1) + "/" + String.valueOf(dia1));
        ps.setString(2, String.valueOf(año2) + "/" + String.valueOf(mes2) + "/" + String.valueOf(dia2));
        ResultSet rs = ps.executeQuery();
        double result = 0;
        if(rs.next())
            result = rs.getDouble("Total");
        rs.close();
        ps.close();
        return result;
    }
    
    /**
     *
     * @param mes
     * @param año
     * @throws java.sql.SQLException
     * @return
     */
    public double getTotales(int mes, int año) throws SQLException{
        return getTotales(1, 31, mes, mes, año, año);
    }
    
    /**
     *
     * @param mes1
     * @param mes2
     * @param año
     * @throws java.sql.SQLException
     * @return
     */
    public double getTotales(int mes1, int mes2, int año) throws SQLException{
        return getTotales(1, 31, mes1, mes2, año, año);
    }
    
    public double getTotales(int dia1, int dia2, int mes1, int mes2, int año, int año2) throws SQLException{
        String sql = "SELECT SUM(Importe) AS Total FROM asientoscontables WHERE Fecha BETWEEN ? AND ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.valueOf(año) + "/" + String.valueOf(mes1) + "/" + dia1);
        ps.setString(2, String.valueOf(año2) + "/" + String.valueOf(mes2) + "/" + dia2);
        ResultSet rs = ps.executeQuery();
        double result = 0;
        if(rs.next())
            result = rs.getDouble("Total");
        rs.close();
        ps.close();
        return result;
    }
}
