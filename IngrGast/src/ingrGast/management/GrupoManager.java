/*
 * GrupoManager.java
 *
 * Created on 11 de agosto de 2007, 13:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.management;

import ingrGast.db.Connector;
import ingrGast.db.GrupoDB;
import ingrGast.objects.Grupo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Blizarazu
 */
public class GrupoManager {
    
    private GrupoDB gDB;
    
    /**
     * Creates a new instance of GrupoManager
     * @param c
     * @throws java.sql.SQLException
     */
    public GrupoManager(Connector c) throws SQLException {
        this.gDB = new GrupoDB(c);
    }
    
    /**
     *
     * @param fileName
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     * @return
     */
    public Vector<Grupo> read(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream sar = new ObjectInputStream(new FileInputStream(fileName));
        Object[] oArr = (Object[]) sar.readObject();
        Vector<Grupo> vG = new Vector<Grupo>();
        for(Object o: oArr)
            vG.addElement((Grupo)o);
        return vG;
    }
    
    /**
     *
     * @param g
     * @throws java.sql.SQLException
     * @return
     */
    public int guardar(Grupo g) throws SQLException{
        if (g.getID() > 0)
            return gDB.insert(g.getID(), g.getNombre());
        else
            return gDB.insert(g.getNombre());
    }
    
    /**
     *
     * @param g
     * @throws java.sql.SQLException
     * @return
     */
    public Grupo find(Grupo g) throws SQLException{
        int id = gDB.find(g.getNombre());
        if(id >= 0){
            g.setID(id);
            return g;
        } else
            return null;
    }
    
    /**
     *
     * @throws java.sql.SQLException
     * @return
     */
    public Vector<String> getNombres() throws SQLException{
        return gDB.getNombres();
    }
    
    /**
     *
     * @param nombre
     * @param nuevoNombre
     * @throws java.sql.SQLException
     * @return
     */
    public int editar(String nombre, String nuevoNombre) throws SQLException {
        return gDB.update(nombre, nuevoNombre);
    }
}
