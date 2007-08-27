/*
 * AsientoContable.java
 *
 * Created on 5 de agosto de 2007, 11:59
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.objects;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Blizarazu
 */
public class AsientoContable implements Serializable{
    
    private int ID;
    private int ConceptoID;
    private int GrupoID;
    private double Importe;
    private Calendar Fecha;
    private int year;
    private int month;
    private int day;
    private String Grupo;
    private String Motivo;
    private String Proveedor;
    private String Receptor;
    
    /** Creates a new instance of AsientoContable */
    public AsientoContable(int cid, int gid, double imp, Calendar date) {
        this.ConceptoID = cid;
        this.GrupoID = gid;
        this.Importe = imp;
        //this.Fecha = date;
        this.year = date.get(Calendar.YEAR);
        this.month = date.get(Calendar.MONTH);
        this.day = date.get(Calendar.DAY_OF_MONTH);
        this.ID = -1;
    }
    
    /**
     *
     * @param ID
     * @param gNombre
     * @param cMotivo
     * @param cProveedor
     * @param cReceptor
     * @param imp
     * @param date
     */
    public AsientoContable(int ID, String gNombre, String cMotivo, String cProveedor, String cReceptor, double imp, Calendar date){
        this.ID = ID;
        this.Grupo = gNombre;
        this.Motivo = cMotivo;
        this.Proveedor = cProveedor;
        this.Receptor = cReceptor;
        this.Importe = imp;
        this.Fecha = date;
    }
    
    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    /**
     *
     * @return
     */
    public int getConceptoID() {
        return ConceptoID;
    }
    
    /**
     *
     * @return
     */
    public Calendar getFecha() {
        return Fecha;
    }
    
    /**
     *
     * @return
     */
    public int getGrupoID() {
        return GrupoID;
    }
    
    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }
    
    /**
     *
     * @return
     */
    public double getImporte() {
        return Importe;
    }
    
    public void constructDate(){
        this.Fecha = new GregorianCalendar(this.year, this.month, this.day);
    }
    
    /**
     *
     * @param GrupoID
     */
    public void setGrupoID(int GrupoID) {
        this.GrupoID = GrupoID;
    }
    
    /**
     *
     * @param ConceptoID
     */
    public void setConceptoID(int ConceptoID) {
        this.ConceptoID = ConceptoID;
    }
    
    /**
     *
     * @return
     */
    public String getGrupo() {
        return Grupo;
    }
    
    /**
     *
     * @return
     */
    public String getMotivo() {
        return Motivo;
    }
    
    /**
     *
     * @param Grupo
     */
    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }
    
    /**
     *
     * @param Motivo
     */
    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
    
    /**
     *
     * @param Receptor
     */
    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }
    
    /**
     *
     * @param Proveedor
     */
    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }
    
    /**
     *
     * @return
     */
    public String getProveedor() {
        return Proveedor;
    }
    
    /**
     *
     * @return
     */
    public String getReceptor() {
        return Receptor;
    }
    
    /**
     *
     * @return
     */
    public String toString(){
        return (String.valueOf(this.ID) + " " +
                String.valueOf(this.GrupoID) + " " +
                String.valueOf(this.ConceptoID) + " " +
                String.valueOf(this.Importe) + " " +
                String.valueOf(this.Fecha.get(Calendar.YEAR)) + "/" + String.valueOf(this.Fecha.get(Calendar.MONTH)) + "/" + String.valueOf(this.Fecha.get(Calendar.DAY_OF_MONTH)));
    }
}
