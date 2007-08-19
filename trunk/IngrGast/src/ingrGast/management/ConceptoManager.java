/*
 * ConceptoManager.java
 *
 * Created on 11 de agosto de 2007, 12:28
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.management;

import ingrGast.db.ConceptoDB;
import ingrGast.db.Connector;
import ingrGast.objects.AsientoContable;
import ingrGast.objects.Concepto;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Beñat
 */
public class ConceptoManager {
    
    private ConceptoDB cDB;
    
    /** Creates a new instance of ConceptoManager */
    public ConceptoManager(Connector c) throws SQLException {
        this.cDB = new ConceptoDB(c);
    }
    
    public Vector<Concepto> read(String fileName) throws IOException, ClassNotFoundException{
        ObjectInputStream sar = new ObjectInputStream(new FileInputStream(fileName));
        Object[] oArr = (Object[]) sar.readObject();
        Vector<Concepto> vC = new Vector<Concepto>();
        for(Object o: oArr)
            vC.addElement((Concepto)o);
        return vC;
    }
    
    public int guardar(Concepto c) throws SQLException{
        if (c.getID() > 0)
            return cDB.insert(c.getID(), c.getMotivo(), c.getProveedor(),c.getReceptor());
        else
            return cDB.insert(c.getMotivo(), c.getProveedor(), c.getReceptor());
    }
    
    public Concepto find(Concepto con) throws SQLException {
        int id = cDB.find(con.getMotivo(), con.getProveedor(), con.getReceptor());
        if(id >= 0){
            con.setID(id);
            return con;
        } else
            return null;
    }
    
    public Vector<String> getMotivos() throws SQLException{
        return cDB.getMotivos();
    }
    
    public Vector<String> getProveedores() throws SQLException{
        return cDB.getProveedores();
    }
    
    public Vector<String> getReceptores() throws SQLException{
        return cDB.getReceptores();
    }
    
    public void editarMotivo(String motivo, String nuevoMotivo) throws SQLException {
        cDB.updateMotivo(motivo, nuevoMotivo);
    }
    
    void editarProveedor(String proveedor, String nuevoProveedor) throws SQLException {
        cDB.updateProveedor(proveedor, nuevoProveedor);
    }
    
    void editarReceptor(String receptor, String nuevoReceptor) throws SQLException {
        cDB.updateReceptor(receptor, nuevoReceptor);
    }
}
