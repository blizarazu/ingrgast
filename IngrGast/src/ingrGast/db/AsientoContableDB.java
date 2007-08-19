/*
 * AsientoContableDB.java
 *
 * Created on 7 de agosto de 2007, 15:05
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.db;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
 *
 * @author Be�at
 */
public class AsientoContableDB {
    
    private Connection connection;
    private Statement statement;
    
    /** Creates a new instance of AsientoContableDB */
    public AsientoContableDB(Connector con) throws SQLException {
        this.connection = con.getConnection();
        this.statement = (Statement) connection.createStatement();
        Calendar cal = new GregorianCalendar();
    }
    
    public int insert(int conceptoID, int grupoID, double importe, Calendar fecha) throws SQLException{
        String sql = "INSERT INTO asientoscontables SET Concepto_ID = ?, Grupo_ID = ?, importe = ?, Fecha = ?, Fecha_creacion = NOW()";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, conceptoID);
        ps.setInt(2, grupoID);
        ps.setDouble(3, importe);
        ps.setString(4, fecha.get(Calendar.YEAR) + "/" + String.valueOf(fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.DAY_OF_MONTH));
        return ps.executeUpdate();
    }
    
    public int insert(int ID, int conceptoID, int grupoID, double importe, Calendar fecha) throws SQLException{
        String sql = "INSERT INTO asientoscontables SET ID=?, Concepto_ID = ?, Grupo_ID = ?, importe = ?, Fecha = ?, Fecha_creacion = NOW()";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, ID);
        ps.setInt(2, conceptoID);
        ps.setInt(3, grupoID);
        ps.setDouble(4, importe);
        ps.setString(5, fecha.get(Calendar.YEAR) + "/" + String.valueOf(fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.DAY_OF_MONTH));
        return ps.executeUpdate();
    }
    
    public ResultSet executeQuery(String sql) throws SQLException {
        return statement.executeQuery(sql);
    }

    public int delete(int id) throws SQLException {
        String sql = "DELETE FROM asientoscontables WHERE ID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeUpdate();
    }
}
