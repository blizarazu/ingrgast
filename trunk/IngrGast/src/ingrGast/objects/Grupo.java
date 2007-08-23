/*
 * Grupo.java
 *
 * Created on 5 de agosto de 2007, 12:25
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
public class Grupo implements Serializable{
    
    private int ID;
    private String Nombre;
    
    /** Creates a new instance of Grupo */
    public Grupo(String name) {
        this.ID = -1;
        this.Nombre = name.trim();
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
    public String getNombre() {
        return Nombre;
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
                this.Nombre);
    }
}
