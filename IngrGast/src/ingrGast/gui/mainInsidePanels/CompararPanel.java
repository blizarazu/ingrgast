/*
 * CompararPanel.java
 *
 * Created on 29 de julio de 2008, 11:14
 */
package ingrGast.gui.mainInsidePanels;

import ingrGast.gui.MainFrame;
import ingrGast.gui.util.TreeTable.ComparacionTreeTableNode;
import ingrGast.gui.util.TreeTable.ComparationModel;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import ingrGast.objects.ComparacionData;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.JOptionPane;

/**
 *
 * @author  blizarazu
 */
public class CompararPanel extends javax.swing.JPanel implements InsidePanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** Creates new form CompararPanel */
    public CompararPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXTreeTable2 = new org.jdesktop.swingx.JXTreeTable();
        TableCellRenderer renderer2 = jXTreeTable2.getTableHeader().getDefaultRenderer();
        JLabel label2 = (JLabel)renderer2;
        label2.setHorizontalAlignment(JLabel.CENTER);
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTreeTable1 = new org.jdesktop.swingx.JXTreeTable();
        TableCellRenderer renderer1 = jXTreeTable1.getTableHeader().getDefaultRenderer();
        JLabel label1 = (JLabel)renderer1;
        label1.setHorizontalAlignment(JLabel.CENTER);
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jXTreeTable3 = new org.jdesktop.swingx.JXTreeTable();
        TableCellRenderer renderer3 = jXTreeTable3.getTableHeader().getDefaultRenderer();
        JLabel label3 = (JLabel)renderer3;
        label3.setHorizontalAlignment(JLabel.CENTER);
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Comparación"));

        jXTreeTable2.setAutoCreateRowSorter(true);
        jScrollPane2.setViewportView(jXTreeTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresos", jPanel2);

        jXTreeTable1.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(jXTreeTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gastos", jPanel1);

        jXTreeTable3.setAutoCreateRowSorter(true);
        jScrollPane3.setViewportView(jXTreeTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Totales", jPanel3);

        jLabel1.setText("Comparar desde el"); // NOI18N

        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        jDateChooser1.setToolTipText("Día-Mes-Año"); // NOI18N
        jDateChooser1.setCalendar(cal);
        ((JTextFieldDateEditor)jDateChooser1.getComponent(1)).setEditable(false);

        jButton1.setText("Añadir"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setEnabled(false);

        jButton2.setText("Quitar"); // NOI18N
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Calendar cal2 = new GregorianCalendar();
        cal2.setTime(new Date());
        jDateChooser2.setToolTipText("Día-Mes-Año"); // NOI18N
        jDateChooser2.setCalendar(cal2);
        ((JTextFieldDateEditor)jDateChooser2.getComponent(1)).setEditable(false);

        jLabel2.setText("hasta el"); // NOI18N

        jLabel3.setText("Quitar comparación:"); // NOI18N
        jLabel3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jButton2))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calendar cal1 = jDateChooser1.getCalendar();
        Calendar cal2 = jDateChooser2.getCalendar();
        String columnName = cal1.get(Calendar.DAY_OF_MONTH) + "/" + (cal1.get(Calendar.MONTH) + 1) + "/" + cal1.get(Calendar.YEAR) + " - " + cal2.get(Calendar.DAY_OF_MONTH) + "/" + (cal2.get(Calendar.MONTH) + 1) + "/" + cal2.get(Calendar.YEAR);

        Hashtable<String, ComparacionData> gastosGrupos = this.manager.getGastosGruposConceptos(cal1, cal2);
        gastosGrupos.put("Total", new ComparacionData("Total", this.manager.getTotalGastos(cal1, cal2)));
        Hashtable<String, ComparacionData> ingresosGrupos = this.manager.getIngresosGruposConceptos(cal1, cal2);
        ingresosGrupos.put("Total", new ComparacionData("Total", this.manager.getTotalIngresos(cal1, cal2)));
        Hashtable<String, ComparacionData> totalesGrupos = this.manager.getTotalesGruposConceptos(cal1, cal2);
        totalesGrupos.put("Total", new ComparacionData("Total", this.manager.getTotal(cal1, cal2)));

        gastosModel.addColumn(columnName, gastosGrupos);
        ingresosModel.addColumn(columnName, ingresosGrupos);
        totalesModel.addColumn(columnName, totalesGrupos);

        /*TableCellRenderer renderer1 = new DefaultTableCellRenderer();
        JLabel label1 = (JLabel) renderer1;
        label1.setHorizontalAlignment(JLabel.LEFT);
        jXTreeTable1.getColumn(0).setHeaderRenderer(renderer1);

        TableCellRenderer renderer2 = new DefaultTableCellRenderer();
        JLabel label2 = (JLabel) renderer2;
        label2.setHorizontalAlignment(JLabel.LEFT);
        jXTreeTable2.getColumn(0).setHeaderRenderer(renderer2);

        TableCellRenderer renderer3 = new DefaultTableCellRenderer();
        JLabel label3 = (JLabel) renderer3;
        label3.setHorizontalAlignment(JLabel.LEFT);
        jXTreeTable3.getColumn(0).setHeaderRenderer(renderer3);*/
        
        /* //Tabla gastos
        TableCellRenderer renderer1 = new DefaultTableCellRenderer();
        JLabel label1 = (JLabel) renderer1;
        label1.setHorizontalAlignment(JLabel.RIGHT);

        jXTreeTable1.setAutoCreateColumnsFromModel(false);
        TableColumn column1 = new TableColumn(jXTreeTable1.getColumnCount());
        column1.setHeaderRenderer(renderer1);
        column1.setHeaderValue(columnName);
        jXTreeTable1.addColumn(column1);

        //Tabla ingresos
        TableCellRenderer renderer2 = new DefaultTableCellRenderer();
        JLabel label2 = (JLabel) renderer2;
        label2.setHorizontalAlignment(JLabel.RIGHT);

        jXTreeTable2.setAutoCreateColumnsFromModel(false);
        TableColumn column2 = new TableColumn(jXTreeTable2.getColumnCount());
        column2.setHeaderRenderer(renderer2);
        column2.setHeaderValue(columnName);
        jXTreeTable2.addColumn(column2);

        //Tabla totales
        TableCellRenderer renderer3 = new DefaultTableCellRenderer();
        JLabel label3 = (JLabel) renderer3;
        label3.setHorizontalAlignment(JLabel.RIGHT);

        jXTreeTable3.setAutoCreateColumnsFromModel(false);
        TableColumn column3 = new TableColumn(jXTreeTable3.getColumnCount());
        column3.setHeaderRenderer(renderer3);
        column3.setHeaderValue(columnName);
        jXTreeTable3.addColumn(column3);*/

        jComboBox1.addItem(columnName);
        jLabel3.setEnabled(true);
        jComboBox1.setEnabled(true);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String columnName = jComboBox1.getSelectedItem().toString();

        try {

            int index1 = jXTreeTable1.getColumn(columnName).getModelIndex();
            int index2 = jXTreeTable2.getColumn(columnName).getModelIndex();
            int index3 = jXTreeTable3.getColumn(columnName).getModelIndex();

           /* System.out.println(columnName + ": " +index1 + " - " + index2 + " - " + index3);

            System.out.println("Columns: " + gastosModel.getColumnCount());

            jXTreeTable1.removeColumn(jXTreeTable1.getColumn(columnName));
            jXTreeTable2.removeColumn(jXTreeTable2.getColumn(columnName));
            jXTreeTable3.removeColumn(jXTreeTable3.getColumn(columnName));*/

            gastosModel.removeColumn(index1);
            ingresosModel.removeColumn(index2);
            totalesModel.removeColumn(index3);

            /*System.out.println("Columns table: " +  jXTreeTable1.getColumnCount());

            System.out.println("-------------------");

            System.out.println("Columns: " + gastosModel.getColumnCount());*/

            jComboBox1.removeItem(columnName);

            if (jComboBox1.getItemCount() == 0) {
                jLabel3.setEnabled(false);
                jComboBox1.setEnabled(false);
                jButton2.setEnabled(false);
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "No se ha podido eliminar la columna seleccionada", "Error al quitar la columna", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    public void initData(MainFrame parent) {
        this.owner = parent;
        this.manager = this.owner.getManager();

        List<String> columns = new ArrayList<String>();

        columns.add("Grupos/Conceptos");

        constructRoot();

        gastosModel = new ComparationModel(constructRoot(), columns);
        ingresosModel = new ComparationModel(constructRoot(), new ArrayList<String>(columns));
        totalesModel = new ComparationModel(constructRoot(), new ArrayList<String>(columns));

        jXTreeTable1.setTreeTableModel(gastosModel);
        jXTreeTable2.setTreeTableModel(ingresosModel);
        jXTreeTable3.setTreeTableModel(totalesModel);

        /*TableCellRenderer renderer1 = new DefaultTableCellRenderer();
        JLabel label1 = (JLabel) renderer1;
        label1.setHorizontalAlignment(JLabel.LEFT);
        jXTreeTable1.getColumn(0).setHeaderRenderer(renderer1);

        TableCellRenderer renderer2 = new DefaultTableCellRenderer();
        JLabel label2 = (JLabel) renderer2;
        label2.setHorizontalAlignment(JLabel.LEFT);
        jXTreeTable2.getColumn(0).setHeaderRenderer(renderer2);

        TableCellRenderer renderer3 = new DefaultTableCellRenderer();
        JLabel label3 = (JLabel) renderer3;
        label3.setHorizontalAlignment(JLabel.LEFT);
        jXTreeTable3.getColumn(0).setHeaderRenderer(renderer3);*/
    }

    private ComparacionTreeTableNode constructRoot() {
        Vector<String> vGrupos = this.manager.getGruposNombres();
        vGrupos.addElement("Total");

        ComparacionTreeTableNode root = new ComparacionTreeTableNode();

        for (String grupo : vGrupos) {
            Vector<String> vMotivos = this.manager.getConceptosMotivos(grupo);
            ComparacionTreeTableNode grupoNode = new ComparacionTreeTableNode(grupo);
            for (String motivo : vMotivos) {
                ComparacionTreeTableNode conceptoNode = new ComparacionTreeTableNode(motivo, false);
                grupoNode.add(conceptoNode);
            }

            root.add(grupoNode);
        }
        return root;
    }

    @Override
    public void updateData() {
        gastosModel.setRoot(constructRoot());
        ingresosModel.setRoot(constructRoot());
        totalesModel.setRoot(constructRoot());
    }

    @Override
    public void disconnectResultSetTableModels() {
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXTreeTable jXTreeTable1;
    private org.jdesktop.swingx.JXTreeTable jXTreeTable2;
    private org.jdesktop.swingx.JXTreeTable jXTreeTable3;
    // End of variables declaration//GEN-END:variables
    ComparationModel gastosModel;
    ComparationModel ingresosModel;
    ComparationModel totalesModel;
    private MainFrame owner;
    private Manager manager;
}
