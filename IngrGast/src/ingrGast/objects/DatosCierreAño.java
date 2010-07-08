/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingrGast.objects;

/**
 *
 * @author Blizarazu
 */
public class DatosCierreAño {

    public static int TOTALES = 0;
    public static int GASTOS = 1;
    public static int INGRESOS = 2;
    private int tipo;
    private Integer año;
    private String grupos_Nombre;
    private Double importeGrupo;
    private Double importe;
    private String conceptos_Motivo;

    public DatosCierreAño() {
    }

    public DatosCierreAño(int tipo, int año, String grupos_Nombre, double ImporteGrupo, String conceptos_Motivo, double importe) {
        this.tipo = tipo;
        this.año = año;
        this.grupos_Nombre = grupos_Nombre;
        this.importeGrupo = ImporteGrupo;
        this.importe = importe;
        this.conceptos_Motivo = conceptos_Motivo;
    }

    public String getConceptos_Motivo() {
        return conceptos_Motivo;
    }

    public String getGrupos_Nombre() {
        return grupos_Nombre;
    }

    public Double getImporteGrupo() {
        return importeGrupo;
    }

    public Integer getAño() {
        return año;
    }

    public Double getImporte() {
        return importe;
    }

    public String getTipo() {
        switch (this.tipo){
            case 0:
                return "Cierre";
            case 1:
                return "Gastos";
            case 2:
                return "Ingresos";
        }
        return null;
    }
}
