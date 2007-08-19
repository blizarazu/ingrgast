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
 * @author Beñat
 */
public class Concepto implements  Serializable{
    
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

    public int getID() {
        return ID;
    }

    public String getMotivo() {
        return Motivo;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String toString(){
        return (String.valueOf(this.ID) + " " +
                this.Motivo + " " +
                this.Proveedor + " " +
                this.Receptor);
    }
}
