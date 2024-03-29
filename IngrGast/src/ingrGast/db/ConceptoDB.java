/*
 * ConceptoDB.java
 *
 * Created on 9 de agosto de 2007, 14:19
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package ingrGast.db;

import ingrGast.objects.ComparacionData;

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
public class ConceptoDB {

    private Connection connection;

    /**
     * Creates a new instance of ConceptoDB
     * @param con
     * @throws java.sql.SQLException
     */
    public ConceptoDB(Connector con) throws SQLException {
        this.connection = con.getConnection();
    }

    public Hashtable<String, Double> getGastos(String grupo) throws SQLException {
        Hashtable<String, Double> hash = new Hashtable<String, Double>();
        String sql = "SELECT Motivo AS Concepto, SUM(A.Importe) AS 'Total Gastos' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Importe < 0 AND G.Nombre=? GROUP BY C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, grupo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hash.put(rs.getString("Concepto"), rs.getDouble("Total Gastos"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, Double> getGastos(int año, String grupo) throws SQLException {
        Hashtable<String, Double> hash = new Hashtable<String, Double>();
        String sql = "SELECT Motivo AS Concepto, SUM(A.Importe) AS 'Total Gastos' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Importe < 0 AND A.Fecha BETWEEN ? AND ? AND G.Nombre=? GROUP BY C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, año + "/1/1");
        ps.setString(2, año + "/12/31");
        ps.setString(3, grupo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hash.put(rs.getString("Concepto"), rs.getDouble("Total Gastos"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, ComparacionData> getGastos(Calendar calendar, Calendar calendar0) throws SQLException {
        String sql = "SELECT G.nombre AS Grupo, Motivo AS Concepto, SUM(A.Importe) AS 'Total Gastos' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Importe < 0 AND A.Fecha BETWEEN ? AND ? GROUP BY G.nombre, C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
        ps.setString(2, calendar0.get(Calendar.YEAR) + "/" + (calendar0.get(Calendar.MONTH) + 1) + "/" + calendar0.get(Calendar.DAY_OF_MONTH));
        ResultSet rs = ps.executeQuery();
        Hashtable<String, ComparacionData> hash = new Hashtable<String, ComparacionData>();
        ComparacionData cp;
        while (rs.next()) {
            String grupo = rs.getString("Grupo");
            if ((cp = hash.get(grupo)) == null) {
                cp = new ComparacionData(grupo);
                hash.put(grupo, cp);
            }
            cp.put(rs.getString("Concepto"), rs.getDouble("Total Gastos"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, Double> getIngresos(String grupo) throws SQLException {
        Hashtable<String, Double> hash = new Hashtable<String, Double>();
        String sql = "SELECT Motivo AS Concepto, SUM(A.Importe) AS 'Total Ingresos' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Importe > 0 AND G.Nombre=? GROUP BY C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, grupo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hash.put(rs.getString("Concepto"), rs.getDouble("Total Ingresos"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, Double> getIngresos(int año, String grupo) throws SQLException {
        Hashtable<String, Double> hash = new Hashtable<String, Double>();
        String sql = "SELECT Motivo AS Concepto, SUM(A.Importe) AS 'Total Ingresos' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Importe > 0 AND A.Fecha BETWEEN ? AND ? AND G.Nombre=? GROUP BY C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, año + "/1/1");
        ps.setString(2, año + "/12/31");
        ps.setString(3, grupo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hash.put(rs.getString("Concepto"), rs.getDouble("Total Ingresos"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, ComparacionData> getIngresos(Calendar calendar, Calendar calendar0) throws SQLException {
        String sql = "SELECT G.nombre AS Grupo, Motivo AS Concepto, SUM(A.Importe) AS 'Total Ingresos' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Importe > 0 AND A.Fecha BETWEEN ? AND ? GROUP BY G.nombre, C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
        ps.setString(2, calendar0.get(Calendar.YEAR) + "/" + (calendar0.get(Calendar.MONTH) + 1) + "/" + calendar0.get(Calendar.DAY_OF_MONTH));
        ResultSet rs = ps.executeQuery();
        Hashtable<String, ComparacionData> hash = new Hashtable<String, ComparacionData>();
        ComparacionData cp;
        while (rs.next()) {
            String grupo = rs.getString("Grupo");
            if ((cp = hash.get(grupo)) == null) {
                cp = new ComparacionData(grupo);
                hash.put(grupo, cp);
            }
            cp.put(rs.getString("Concepto"), rs.getDouble("Total Ingresos"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, Double> getTotales(String grupo) throws SQLException {
        Hashtable<String, Double> hash = new Hashtable<String, Double>();
        String sql = "SELECT Motivo AS Concepto, SUM(A.Importe) AS 'Total Importe' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE G.Nombre=? GROUP BY C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, grupo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hash.put(rs.getString("Concepto"), rs.getDouble("Total Importe"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, Double> getTotales(int año, String grupo) throws SQLException {
        Hashtable<String, Double> hash = new Hashtable<String, Double>();
        String sql = "SELECT Motivo AS Concepto, SUM(A.Importe) AS 'Total Importe' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Fecha BETWEEN ? AND ? AND G.Nombre=? GROUP BY C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, año + "/1/1");
        ps.setString(2, año + "/12/31");
        ps.setString(3, grupo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hash.put(rs.getString("Concepto"), rs.getDouble("Total Importe"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    public Hashtable<String, ComparacionData> getTotales(Calendar calendar, Calendar calendar0) throws SQLException {
        String sql = "SELECT G.nombre AS Grupo, Motivo AS Concepto, SUM(A.Importe) AS 'Total Importe' FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE A.Fecha BETWEEN ? AND ? GROUP BY G.nombre, C.Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
        ps.setString(2, calendar0.get(Calendar.YEAR) + "/" + (calendar0.get(Calendar.MONTH) + 1) + "/" + calendar0.get(Calendar.DAY_OF_MONTH));
        ResultSet rs = ps.executeQuery();
        Hashtable<String, ComparacionData> hash = new Hashtable<String, ComparacionData>();
        ComparacionData cp;
        while (rs.next()) {
            String grupo = rs.getString("Grupo");
            if ((cp = hash.get(grupo)) == null) {
                cp = new ComparacionData(grupo);
                hash.put(grupo, cp);
            }
            cp.put(rs.getString("Concepto"), rs.getDouble("Total Importe"));
        }
        rs.close();
        ps.close();
        return hash;
    }

    /**
     *
     * @param motivo
     * @param proveedor
     * @param receptor
     * @throws java.sql.SQLException
     * @return
     */
    public int insert(String motivo, String proveedor, String receptor) throws SQLException {
        String sql = "INSERT INTO conceptos SET Motivo = ?, Proveedor = ?, Receptor = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, motivo);
        ps.setString(2, proveedor);
        ps.setString(3, receptor);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

    /**
     *
     * @param id
     * @param motivo
     * @param proveedor
     * @param receptor
     * @throws java.sql.SQLException
     * @return
     */
    public int insert(int id, String motivo, String proveedor, String receptor) throws SQLException {
        String sql = "INSERT INTO conceptos SET ID = ?, Motivo = ?, Proveedor = ?, Receptor = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, motivo);
        ps.setString(3, proveedor);
        ps.setString(4, receptor);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

    /**
     *
     * @param motivo
     * @param proveedor
     * @param receptor
     * @throws java.sql.SQLException
     * @return
     */
    public int find(String motivo, String proveedor, String receptor) throws SQLException {
        String sql = "SELECT ID FROM conceptos WHERE Motivo = ? AND Proveedor = ? AND Receptor = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, motivo);
        ps.setString(2, proveedor);
        ps.setString(3, receptor);
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
    public Vector<String> getMotivos() throws SQLException {
        String sql = "SELECT DISTINCT Motivo FROM conceptos ORDER BY Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Vector<String> vMotivos = new Vector<String>();
        while (rs.next()) {
            vMotivos.addElement(rs.getString("Motivo"));
        }
        rs.close();
        ps.close();
        return vMotivos;
    }

    public Vector<String> getMotivos(String grupo) throws SQLException {
        String sql = "SELECT DISTINCT Motivo FROM (conceptos C INNER JOIN asientoscontables A ON C.ID = A.Concepto_ID) INNER JOIN grupos G ON A.Grupo_ID = G.ID WHERE G.nombre = ? ORDER BY Motivo";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, grupo);
        ResultSet rs = ps.executeQuery();
        Vector<String> vMotivos = new Vector<String>();
        while (rs.next()) {
            vMotivos.addElement(rs.getString("Motivo"));
        }
        rs.close();
        ps.close();
        return vMotivos;
    }

    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getProveedores() throws SQLException {
        String sql = "SELECT DISTINCT Proveedor FROM conceptos ORDER BY Proveedor";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Vector<String> vProveedor = new Vector<String>();
        while (rs.next()) {
            vProveedor.addElement(rs.getString("Proveedor"));
        }
        rs.close();
        ps.close();
        return vProveedor;
    }

    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getReceptores() throws SQLException {
        String sql = "SELECT DISTINCT Receptor FROM conceptos ORDER BY Receptor";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Vector<String> vReceptor = new Vector<String>();
        while (rs.next()) {
            vReceptor.addElement(rs.getString("Receptor"));
        }
        rs.close();
        ps.close();
        return vReceptor;
    }

    /**
     *
     * @param proveedor
     * @param nuevoProveedor
     * @throws java.sql.SQLException
     * @return
     */
    public int updateProveedor(String proveedor, String nuevoProveedor) throws SQLException {
        String sql = "UPDATE conceptos SET Proveedor = ? WHERE Proveedor = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, nuevoProveedor);
        ps.setString(2, proveedor);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

    /**
     *
     * @param motivo
     * @param nuevoMotivo
     * @throws java.sql.SQLException
     * @return
     */
    public int updateMotivo(String motivo, String nuevoMotivo) throws SQLException {
        String sql = "UPDATE conceptos SET Motivo = ? WHERE Motivo = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, nuevoMotivo);
        ps.setString(2, motivo);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

    /**
     *
     * @param receptor
     * @param nuevoReceptor
     * @throws java.sql.SQLException
     * @return
     */
    public int updateReceptor(String receptor, String nuevoReceptor) throws SQLException {
        String sql = "UPDATE conceptos SET Receptor = ? WHERE Receptor = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, nuevoReceptor);
        ps.setString(2, receptor);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
}
