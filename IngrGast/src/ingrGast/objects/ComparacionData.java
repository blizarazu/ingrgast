/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ingrGast.objects;

import java.util.HashMap;

/**
 *
 * @author Blizarazu
 */
public class ComparacionData extends HashMap<String, Double>{

    private String grupo;
    private double totalImporteGrupo;

    public ComparacionData(String nombreGrupo, double totalImporteGrupo) {
        super();
        this.grupo = nombreGrupo;
        this.totalImporteGrupo = totalImporteGrupo;
    }

    public ComparacionData(String nombreGrupo) {
        super();
        this.grupo = nombreGrupo;
        this.totalImporteGrupo = 0.0;
    }

    public String getGrupo(){
        return this.grupo;
    }

    public double getTotalImporteGrupo(){
        return this.totalImporteGrupo;
    }

    public void setTotalImporteGrupo(double totalImporteGrupo){
        this.totalImporteGrupo = totalImporteGrupo;
    }

}
