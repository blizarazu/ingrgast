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
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import ingrGast.objects.AsientoContable;

/**
 * 
 * @author Blizarazu
 */
public class AsientoContableManager{
    
    private AsientoContableDB asDB;
    
    /**
     * Creates a new instance of AsientoContableManager
     * @param c 
     * @throws java.sql.SQLException 
     */
    public AsientoContableManager(Connector c) throws SQLException {
        this.asDB  = new AsientoContableDB(c);
    }
    
    /**
     * 
     * @param fileName 
     * @throws java.io.FileNotFoundException 
     * @throws java.io.IOException 
     * @throws java.lang.ClassNotFoundException 
     * @return 
     */
    public Vector<AsientoContable> read(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream sar = new ObjectInputStream(new FileInputStream(fileName));
        Object[] oArr = (Object[]) sar.readObject();
        Vector<AsientoContable> vAS = new Vector<AsientoContable>();
        for(Object o: oArr)
            vAS.addElement((AsientoContable)o);
        return vAS;
    }
    
    /**
     * 
     * @param as 
     * @throws java.sql.SQLException 
     * @return 
     */
    public int guardar(AsientoContable as) throws SQLException{
        as.constructDate();
        if (as.getID() > 0)
            return asDB.insert(as.getID(), as.getConceptoID(), as.getGrupoID(), as.getImporte(), as.getFecha());
        else
            return asDB.insert(as.getConceptoID(), as.getGrupoID(), as.getImporte(), as.getFecha());
    }
    
    /**
     * 
     * @param i 
     * @param grupo 
     * @param motivo 
     * @param proveedor 
     * @param receptor 
     * @param fechaIni 
     * @param fechaFin 
     * @throws java.sql.SQLException 
     * @return 
     */
    public double getSUM(int i, String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) throws SQLException {
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
        String sql = s + " ORDER BY A.Fecha";
        return asDB.SUM(sql);
    }
    
    /**
     * 
     * @param id 
     * @throws java.sql.SQLException 
     * @return 
     */
    public int borrar(int id) throws SQLException {
        return asDB.delete(id);
    }
    
    String constructQuery(int i, String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        String sql = "SELECT A.ID AS ID, G.Nombre AS Grupo, C.Motivo AS Motivo, C.Proveedor AS Proveedor, C.Receptor AS Receptor, A.Fecha AS Fecha, A.Importe AS Importe FROM asientoscontables AS A INNER JOIN conceptos AS C ON A.Concepto_ID = C.ID INNER JOIN grupos AS G ON A.Grupo_ID = G.ID WHERE ";
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
    
    /**
     * 
     * @param as 
     * @throws java.sql.SQLException 
     */
    public void editar(AsientoContable as) throws SQLException {
        as.constructDate();
        asDB.update(as.getID(), as.getConceptoID(), as.getGrupoID(), as.getImporte(), as.getFecha());
    }
    
    /**
     * 
     * @throws java.sql.SQLException 
     * @return 
     */
    public Vector<Calendar> getFechas() throws SQLException {
        Vector<String> vDate = asDB.getDates();
        Vector<Calendar> vCal = new Vector<Calendar>();
        String[] s;
        for(String d: vDate){
            s = d.split("-");
            vCal.addElement(new GregorianCalendar(Integer.parseInt(s[0]), (Integer.parseInt(s[1])-1), Integer.parseInt(s[2])));
        }
        return vCal;
    }
    
    /**
     * 
     * @param a�o 
     * @throws java.sql.SQLException 
     * @return 
     */
    public Vector<Double> getIngresosA�o(int a�o) throws SQLException{
        Vector<Double> ingA�o = new Vector<Double>();
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        int j = 12;
        if(cal.get(Calendar.YEAR) == a�o)
            j = (cal.get(Calendar.MONTH)+1);
        for(int i = 1; i <= j; i++)
            ingA�o.addElement(new Double(asDB.getIngresos(i, a�o)));
        ingA�o.addElement(new Double(asDB.getIngresos(1, j, a�o)));
        return ingA�o;
    }
    
    /**
     * 
     * @param a�o 
     * @throws java.sql.SQLException 
     * @return 
     */
    public Vector<Double> getGastosA�o(int a�o) throws SQLException{
        Vector<Double> gastA�o = new Vector<Double>();
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        int j = 12;
        if(cal.get(Calendar.YEAR) == a�o)
            j = (cal.get(Calendar.MONTH)+1);
        for(int i = 1; i <= j; i++)
            gastA�o.addElement(new Double(asDB.getGastos(i, a�o)));
        gastA�o.addElement(new Double(asDB.getGastos(1, j, a�o)));
        return gastA�o;
    }
    
    /**
     * 
     * @param a�o 
     * @throws java.sql.SQLException 
     * @return 
     */
    public Vector<Double> getTotalesA�o(int a�o) throws SQLException{
        Vector<Double> totA�o = new Vector<Double>();
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        int j = 12;
        if(cal.get(Calendar.YEAR) == a�o)
            j = (cal.get(Calendar.MONTH)+1);
        for(int i = 1; i <= j; i++)
            totA�o.addElement(new Double(asDB.getTotales(i, a�o)));
        totA�o.addElement(new Double(asDB.getTotales(1, j, a�o)));
        return totA�o;
    }

    /**
     * 
     * @param i 
     * @return 
     */
    public String constructLast(int i) {
        return "SELECT A.ID AS ID, A.Fecha_creacion AS 'Fecha de Entrada', G.Nombre AS Grupo, C.Motivo AS Motivo, C.Proveedor AS Proveedor, C.Receptor AS Receptor, A.Fecha AS Fecha, A.Importe AS Importe FROM asientoscontables AS A INNER JOIN conceptos AS C ON A.Concepto_ID = C.ID INNER JOIN grupos AS G ON A.Grupo_ID = G.ID ORDER BY Fecha_creacion DESC LIMIT " + String.valueOf(i);
    }
}
