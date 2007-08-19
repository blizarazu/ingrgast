/*
 * AsientoContableManager.java
 *
 * Created on 8 de agosto de 2007, 17:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.management;

import ingrGast.db.AsientoContableDB;
import ingrGast.db.Connector;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import ingrGast.objects.AsientoContable;

/**
 *
 * @author Be�at
 */
public class AsientoContableManager{
    
    private AsientoContableDB asDB;
    
    /**
     * Creates a new instance of AsientoContableManager
     */
    public AsientoContableManager(Connector c) throws SQLException {
        this.asDB  = new AsientoContableDB(c);
    }
    
    public Vector<AsientoContable> read(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream sar = new ObjectInputStream(new FileInputStream(fileName));
	Object[] oArr = (Object[]) sar.readObject();
        Vector<AsientoContable> vAS = new Vector<AsientoContable>();
        for(Object o: oArr)
            vAS.addElement((AsientoContable)o);
        return vAS;
    }
    
    public int guardar(AsientoContable as) throws SQLException{
        as.constructDate();
        if (as.getID() > 0)
            return asDB.insert(as.getID(), as.getConceptoID(), as.getGrupoID(), as.getImporte(), as.getFecha());
        else
            return asDB.insert(as.getConceptoID(), as.getGrupoID(), as.getImporte(), as.getFecha());
    }

    public Vector<AsientoContable> getAll(int i, String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) throws SQLException {
        String sql = "SELECT A.ID, G.Nombre, C.Motivo, C.Proveedor, C.Receptor, A.Importe, A.Fecha FROM asientoscontables AS A INNER JOIN conceptos AS C ON A.Concepto_ID = C.ID INNER JOIN grupos AS G ON A.Grupo_ID = G.ID WHERE ";
        String s = "";
        if (i > 0)
            s += "A.Importe >= 0";
        else if (i < 0)
            s += "A.Importe < 0";
        else
            s += "TRUE";
        if(grupo != null)
            s += " AND G.Nombre = '" + grupo + "'";
        if(motivo != null)
            s += " AND C.Motivo = '" + motivo + "'";
        if(proveedor != null)
            s += " AND C.Proveedor = '" + proveedor + "'";
        if(receptor != null)
            s += " AND C.Receptor = '" + receptor + "'";
        if(fechaIni != null && fechaFin != null)
            s += " AND A.Fecha BETWEEN '" + String.valueOf(fechaIni.get(Calendar.YEAR)) + "/" + String.valueOf(fechaIni.get(Calendar.MONTH) + 1) + "/" + String.valueOf(fechaIni.get(Calendar.DAY_OF_MONTH)) + "' AND '" + String.valueOf(fechaFin.get(Calendar.YEAR)) + "/" + String.valueOf(fechaFin.get(Calendar.MONTH) + 1) + "/" + String.valueOf(fechaFin.get(Calendar.DAY_OF_MONTH)) + "'";
        sql += s + " ORDER BY A.Fecha";
        Vector<AsientoContable> vTot = new Vector<AsientoContable>();
        ResultSet rs = asDB.executeQuery(sql);
        while (rs.next()){
            String[] f = rs.getString("A.Fecha").split("-");
            vTot.addElement(new AsientoContable(rs.getInt("A.ID"), rs.getString("G.Nombre"), rs.getString("C.Motivo"), rs.getString("C.Proveedor"), rs.getString("C.Receptor"), rs.getDouble("A.Importe"), new GregorianCalendar(Integer.parseInt(f[0]), Integer.parseInt(f[1]) - 1, Integer.parseInt(f[2]))));
        }
        rs.close();
        return vTot;
    }

    public int borrar(int id) throws SQLException {
        return asDB.delete(id);
    }

    String constructQuery(int i, String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        String sql = "SELECT A.ID, G.Nombre, C.Motivo, C.Proveedor, C.Receptor, A.Fecha, A.Importe FROM asientoscontables AS A INNER JOIN conceptos AS C ON A.Concepto_ID = C.ID INNER JOIN grupos AS G ON A.Grupo_ID = G.ID WHERE ";
        String s = "";
        if (i > 0)
            s += "A.Importe >= 0";
        else if (i < 0)
            s += "A.Importe < 0";
        else
            s += "TRUE";
        if(grupo != null)
            s += " AND G.Nombre = '" + grupo + "'";
        if(motivo != null)
            s += " AND C.Motivo = '" + motivo + "'";
        if(proveedor != null)
            s += " AND C.Proveedor = '" + proveedor + "'";
        if(receptor != null)
            s += " AND C.Receptor = '" + receptor + "'";
        if(fechaIni != null && fechaFin != null)
            s += " AND A.Fecha BETWEEN '" + String.valueOf(fechaIni.get(Calendar.YEAR)) + "/" + String.valueOf(fechaIni.get(Calendar.MONTH) + 1) + "/" + String.valueOf(fechaIni.get(Calendar.DAY_OF_MONTH)) + "' AND '" + String.valueOf(fechaFin.get(Calendar.YEAR)) + "/" + String.valueOf(fechaFin.get(Calendar.MONTH) + 1) + "/" + String.valueOf(fechaFin.get(Calendar.DAY_OF_MONTH)) + "'";
        sql += s + " ORDER BY A.Fecha";
        return sql;
    }
}
