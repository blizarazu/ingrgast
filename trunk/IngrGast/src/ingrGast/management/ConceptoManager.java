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
import ingrGast.objects.Concepto;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Blizarazu
 */
public class ConceptoManager {

    private ConceptoDB cDB;

    /**
     * Creates a new instance of ConceptoManager
     * @param c
     * @throws java.sql.SQLException
     */
    public ConceptoManager(Connector c) throws SQLException {
        this.cDB = new ConceptoDB(c);
    }

    /**
     *
     * @param fileName
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     * @return
     */
    public Vector<Concepto> read(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream sar = new ObjectInputStream(new FileInputStream(fileName));
        Object[] oArr = (Object[]) sar.readObject();
        Vector<Concepto> vC = new Vector<Concepto>();
        for (Object o : oArr) {
            vC.addElement((Concepto) o);
        }
        return vC;
    }

    /**
     *
     * @param c
     * @throws java.sql.SQLException
     * @return
     */
    public int guardar(Concepto c) throws SQLException {
        if (c.getID() > 0) {
            return cDB.insert(c.getID(), c.getMotivo(), c.getProveedor(), c.getReceptor());
        } else {
            return cDB.insert(c.getMotivo(), c.getProveedor(), c.getReceptor());
        }
    }

    /**
     *
     * @param con
     * @throws java.sql.SQLException
     * @return
     */
    public Concepto find(Concepto con) throws SQLException {
        int id = cDB.find(con.getMotivo(), con.getProveedor(), con.getReceptor());
        if (id >= 0) {
            con.setID(id);
            return con;
        } else {
            return null;
        }
    }

    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getMotivos() throws SQLException {
        return cDB.getMotivos();
    }

    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getProveedores() throws SQLException {
        return cDB.getProveedores();
    }

    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getReceptores() throws SQLException {
        return cDB.getReceptores();
    }

    /**
     *
     * @param motivo
     * @param nuevoMotivo
     * @throws java.sql.SQLException
     */
    public void editarMotivo(String motivo, String nuevoMotivo) throws SQLException {
        cDB.updateMotivo(motivo, nuevoMotivo);
    }

    public void editarProveedor(String proveedor, String nuevoProveedor) throws SQLException {
        cDB.updateProveedor(proveedor, nuevoProveedor);
    }

    public void editarReceptor(String receptor, String nuevoReceptor) throws SQLException {
        cDB.updateReceptor(receptor, nuevoReceptor);
    }

    Hashtable<String, Double> getGastosConcepto(int a�o, String grupo) throws SQLException {
        if (a�o >= 0) {
            return cDB.getGastos(a�o, grupo);
        } else {
            return cDB.getGastos(grupo);
        }
    }

    Hashtable<String, Double> getIngresosConcepto(int a�o, String grupo) throws SQLException {
        if (a�o >= 0) {
            return cDB.getIngresos(a�o, grupo);
        } else {
            return cDB.getIngresos(grupo);
        }
    }

    Hashtable<String, Double> getTotalesConcepto(int a�o, String grupo) throws SQLException {
        if (a�o >= 0) {
            return cDB.getTotales(a�o, grupo);
        } else {
            return cDB.getTotales(grupo);
        }
    }
}
