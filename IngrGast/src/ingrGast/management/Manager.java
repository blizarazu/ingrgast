/*
 * Manager.java
 *
 * Created on 9 de agosto de 2007, 18:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.management;

import ingrGast.db.Connector;
import ingrGast.objects.AsientoContable;
import ingrGast.objects.Concepto;
import ingrGast.objects.Grupo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Beñat
 */
public class Manager {
    
    private Connector connector;
    private AsientoContableManager asm;
    private ConceptoManager cm;
    private GrupoManager gm;
    
    /** Creates a new instance of Manager */
    public Manager() {
        try {
            this.connector = new Connector();
            this.asm = new AsientoContableManager(this.connector);
            this.cm = new ConceptoManager(this.connector);
            this.gm= new GrupoManager(this.connector);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al establecer la conexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Conexión fallida").setVisible(true);
        }
    }
    
    public void importarAsientosContables(String fileName) {
        try {
            Vector<AsientoContable> vAS  = this.asm.read(fileName);
            for (AsientoContable as: vAS)
                this.asm.guardar(as);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("El archivo seleccionado no existe.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "No existe el archivo").setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los asientos contables.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los asientos contables.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los asientos contables.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        }
    }
    
    public void importarConceptos(String fileName) {
        try {
            Vector<Concepto> vC = this.cm.read(fileName);
            for (Concepto c: vC)
                this.cm.guardar(c);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("El archivo seleccionado no existe.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "No existe el archivo").setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los conceptos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los conceptos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los conceptos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        }
    }
    
    public void importarGrupos(String fileName){
        try {
            Vector<Grupo> vG = this.gm.read(fileName);
            for (Grupo g: vG)
                this.gm.guardar(g);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("El archivo seleccionado no existe.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "No existe el archivo").setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los grupos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los grupos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al importar los grupos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de importación").setVisible(true);
        }
    }
    
    public void guardarAsientoContable(String grupo, String motivo, String proveedor, String receptor, double importe, Calendar cal){
        try {
            if(grupo.length() != 0 && motivo.length() != 0 && proveedor.length() != 0 && receptor.length() != 0 && !Double.isNaN(importe) && cal != null){
                Grupo gr = new Grupo(grupo);
                Grupo g = gm.find(gr);
                if(g == null){
                    gm.guardar(gr);
                    g = gm.find(gr);
                }
                Concepto con = new Concepto(motivo, proveedor, receptor);
                Concepto c = cm.find(con);
                if(c == null){
                    cm.guardar(con);
                    c = cm.find(con);
                }
                AsientoContable as = new AsientoContable(c.getID(), g.getID(), importe, cal);
                if (as.getGrupoID() != -1 && as.getConceptoID() != -1)
                    asm.guardar(as);
                else{
                    JOptionPane jop = new JOptionPane("Se ha producido un error al guardar el asiento contable.", JOptionPane.ERROR_MESSAGE);
                    jop.createDialog(null, "Error al guardar el asiento contable").setVisible(true);
                }
            } else{
                JOptionPane jop = new JOptionPane("No ha sido posible guardar el asiento contable.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error al guardar el asiento contable").setVisible(true);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("No ha sido posible guardar el asiento contable.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error al guardar el asiento contable").setVisible(true);
        }
    }
    
    public Vector<String> getGruposNombres(){
        try {
            return gm.getNombres();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
            return null;
        }
    }
    
    public Vector<String> getConceptosMotivos(){
        try {
            return cm.getMotivos();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
            return null;
        }
    }
    
    public Vector<String> getConceptosProveedores(){
        try {
            return cm.getProveedores();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
            return null;
        }
    }
    
    public Vector<String> getConceptosReceptores(){
        try {
            return cm.getReceptores();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
            return null;
        }
    }
    
    public void editarGrupo(String nombre, String nuevoNombre) {
        try {
            if (nuevoNombre.length() > 0)
                gm.editar(nombre, nuevoNombre);
            else{
                JOptionPane jop = new JOptionPane("No ha sido posible editar el grupo.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error al editar el grupo").setVisible(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("No ha sido posible editar el grupo.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error al editar el grupo").setVisible(true);
        }
    }
    
    public void editarConceptoMotivo(String motivo, String nuevoMotivo) {
        try {
            if (nuevoMotivo.length() > 0)
                cm.editarMotivo(motivo, nuevoMotivo);
            else{
                JOptionPane jop = new JOptionPane("No ha sido posible editar el concepto.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error al editar el concepto").setVisible(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("No ha sido posible editar el concepto.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error al editar el concepto").setVisible(true);
        }
    }
    
    public void editarConceptoProveedor(String proveedor, String nuevoProveedor) {
        try {
            if (nuevoProveedor.length() > 0)
                cm.editarProveedor(proveedor, nuevoProveedor);
            else {
                JOptionPane jop = new JOptionPane("No ha sido posible editar el concepto.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error al editar el concepto").setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane("No ha sido posible editar el concepto.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error al editar el concepto").setVisible(true);
            ex.printStackTrace();
        }
    }
    
    public void editarConceptoReceptor(String receptor, String nuevoReceptor) {
        try {
            if (nuevoReceptor.length() > 0)
                cm.editarReceptor(receptor, nuevoReceptor);
            else {
                JOptionPane jop = new JOptionPane("No ha sido posible editar el concepto.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error al editar el concepto").setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane("No ha sido posible editar el concepto.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error al editar el concepto").setVisible(true);
            ex.printStackTrace();
        }
    }
    
    public double getTotalIngresos(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        try {
            return asm.getSUM(1, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
            return 0;
        }
    }
    
    public double getTotalGastos(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        try {
            return asm.getSUM(-1, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
            return 0;
        }
    }
    
    public double getTotal(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        try {
            return asm.getSUM(0, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
            return 0;
        }
    }
    
    public String constructQueryIngresos(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin){
        return asm.constructQuery(1, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
    }
    
    public String constructQueryGastos(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin){
        return asm.constructQuery(-1, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
    }
    
    public String constructQueryTotales(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin){
        return asm.constructQuery(0, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
    }
    
    public void borrarAsiento(int id){
        try {
            asm.borrar(id);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("No ha sido posible borrar el asiento contable.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error as borrar el asiento contable").setVisible(true);
        }
    }
    
    public Connector getConnector(){
        return this.connector;
    }
    
    public void disconnectDB(){
        try {
            connector.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Se ha producido un error al intentar la desconexión con la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de desconexión").setVisible(true);
        }
    }
    
    public void editarAsientoContable(int id, String grupo, String motivo, String proveedor, String receptor, double importe, Calendar fecha) {
        try {
            if(grupo.length() != 0 && motivo.length() != 0 && proveedor.length() != 0 && receptor.length() != 0 && !Double.isNaN(importe) && fecha != null){
                Grupo gr = new Grupo(grupo);
                Grupo g = gm.find(gr);
                if(g == null){
                    gm.guardar(gr);
                    g = gm.find(gr);
                }
                Concepto con = new Concepto(motivo, proveedor, receptor);
                Concepto c = cm.find(con);
                if(c == null){
                    cm.guardar(con);
                    c = cm.find(con);
                }
                AsientoContable as = new AsientoContable(c.getID(), g.getID(), importe, fecha);
                as.setID(id);
                if (as.getGrupoID() != -1 && as.getConceptoID() != -1)
                    asm.editar(as);
                else{
                    JOptionPane jop = new JOptionPane("No ha sido posible editar el asiento contable.", JOptionPane.ERROR_MESSAGE);
                    jop.createDialog(null, "Error al editar el asiento contable").setVisible(true);
                }
            } else{
                JOptionPane jop = new JOptionPane("No ha sido posible editar el asiento contable.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Error al editar el asiento contable").setVisible(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("No ha sido posible editar el asiento contable.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error al editar el asiento contable").setVisible(true);
        }
    }

    public Vector<Integer> getAñosAsientos() {
        try {
            Vector<Calendar> vFechas = asm.getFechas();
            Vector<Integer> vYears = new Vector<Integer>();
            Integer year;
            for (Calendar cal: vFechas){
                year = new Integer(cal.get(Calendar.YEAR));
                if(!vYears.contains(year)){
                    vYears.addElement(year);
                }
            }
            return vYears;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void getTotalesAño(int i) {
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
