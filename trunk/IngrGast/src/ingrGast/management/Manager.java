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
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
    public Manager() throws SQLException {
        this.connector = new Connector();
        this.asm = new AsientoContableManager(this.connector);
        this.cm = new ConceptoManager(this.connector);
        this.gm= new GrupoManager(this.connector);
    }
    
    public void importarAsientosContables(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        Vector<AsientoContable> vAS  = this.asm.read(fileName);
        for (AsientoContable as: vAS)
            this.asm.guardar(as);
    }
    
    public void importarConceptos(String fileName) throws IOException, ClassNotFoundException, SQLException{
        Vector<Concepto> vC = this.cm.read(fileName);
        for (Concepto c: vC)
            this.cm.guardar(c);
    }
    
    public void importarGrupos(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        Vector<Grupo> vG = this.gm.read(fileName);
        for (Grupo g: vG)
            this.gm.guardar(g);
    }
    
    public void guardarAsientoContable(String grupo, String motivo, String proveedor, String receptor, double importe, Calendar cal) throws SQLException{
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
            else
                System.out.println("Error al guardar el asiento contable");
        } else
            System.out.println("Error al guardar el asiento contable");
    }
    
    public Vector<String> getGruposNombres(){
        try {
            return gm.getNombres();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public Vector<String> getConceptosMotivos(){
        try {
            return cm.getMotivos();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public Vector<String> getConceptosProveedores(){
        try {
            return cm.getProveedores();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public Vector<String> getConceptosReceptores(){
        try {
            return cm.getReceptores();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void editarGrupo(String nombre, String nuevoNombre) {
        try {
            if (nuevoNombre.length() > 0)
                gm.editar(nombre, nuevoNombre);
            else
                System.out.println("Error al editar el grupo.");
        } catch (SQLException ex) {
           System.out.println("Error al editar el grupo.");
        }
    }
    
    public void editarConceptoMotivo(String motivo, String nuevoMotivo) {
        try {
            if (nuevoMotivo.length() > 0)
                cm.editarMotivo(motivo, nuevoMotivo);
            else
                System.out.println("Error al editar el concepto.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void editarConceptoProveedor(String proveedor, String nuevoProveedor) {
        try {
            if (nuevoProveedor.length() > 0)
                cm.editarProveedor(proveedor, nuevoProveedor);
            else
                System.out.println("Error al editar el concepto.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void editarConceptoReceptor(String receptor, String nuevoReceptor) {
        try {
            if (nuevoReceptor.length() > 0)
                cm.editarReceptor(receptor, nuevoReceptor);
            else
                System.out.println("Erroe al editar el concepto.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Vector<AsientoContable> getIngresos(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        try {
            return asm.getAll(1, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Vector<AsientoContable> getGastos(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        try {
            return asm.getAll(-1, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Vector<AsientoContable> getTotales(String grupo, String motivo, String proveedor, String receptor, Calendar fechaIni, Calendar fechaFin) {
        try {
            return asm.getAll(0, grupo, motivo, proveedor, receptor, fechaIni, fechaFin);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
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
        }
    }
}
