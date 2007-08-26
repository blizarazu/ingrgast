/*
 * ModifiedDefaultCategoryDataset.java
 *
 * Created on 26 de agosto de 2007, 14:58
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.gui.charts.datasets;

import java.util.Vector;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Beñat
 */
public class ModifiedDefaultCategoryDataset extends DefaultCategoryDataset{
    
    /** Creates a new instance of ModifiedDefaultCategoryDataset */
    public ModifiedDefaultCategoryDataset() {
        super();
    }
    
    public void addValuesToDataset(Vector<Double> data, String key, String[] group) {
        int i = 0;
        for(Double value: data){
            this.addValue(value.doubleValue(), key, group[i]);
            i++;
        }
    }
}
