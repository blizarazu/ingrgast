/*
 * Concepto.java
 *
 * Created on 5 de agosto de 2007, 12:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.objects;

import java.io.Serializable;

/**
 *
 * @author Blizarazu
 */
public class Concepto implements  Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -458540470410190928L;
	
	private int ID;
    private String Motivo;
    private String Proveedor;
    private String Receptor;
    
    /** Creates a new instance of Concepto */
    public Concepto(String mot, String prov, String recep) {
        this.ID = -1;
        this.Motivo = mot.trim();
        this.Proveedor = prov.trim();
        this.Receptor = recep.trim();
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
    public String getMotivo() {
        return Motivo;
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
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    /**
     *
     * @return
     */
    public String toString(){
        return (String.valueOf(this.ID) + " " +
                this.Motivo + " " +
                this.Proveedor + " " +
                this.Receptor);
    }
}
