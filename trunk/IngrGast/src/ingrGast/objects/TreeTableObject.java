/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ingrGast.objects;

/**
 *
 * @author Blizarazu
 */
public class TreeTableObject {

    public static final int TIPO_TOTAL_GRUPO = 0;
    public static final int TIPO_CANTIDAD_CONCEPTO = 1;

    private String grupo;
    private String concepto;
    private double importe;
    private int tipo;

    public TreeTableObject(String grupo, String concepto, double importe) {
        this.grupo = grupo;
        this.concepto = concepto;
        this.importe = importe;
        this.tipo = TreeTableObject.TIPO_CANTIDAD_CONCEPTO;
    }

    public TreeTableObject(String grupo, double importe) {
        this.grupo = grupo;
        this.concepto = null;
        this.importe = importe;
        this.tipo = TreeTableObject.TIPO_TOTAL_GRUPO;
    }

    public String getNombreGrupo(){
        return this.grupo;
    }

    public String getNombreConcepto(){
        return this.concepto;
    }

    public double getImporte(){
        return this.importe;
    }

    public boolean isTotalGrupo(){
        return this.tipo == TreeTableObject.TIPO_TOTAL_GRUPO;
    }
}
