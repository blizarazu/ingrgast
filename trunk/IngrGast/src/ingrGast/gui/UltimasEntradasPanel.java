/*
 * UltimasEntradasPanel.java
 *
 * Created on 21 de agosto de 2007, 20:54
 */

package ingrGast.gui;

import ingrGast.db.Connector;
import ingrGast.db.ResultSetTableModel;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import ingrGast.objects.AsientoContable;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * 
 * @author Blizarazu
 */
public class UltimasEntradasPanel extends javax.swing.JPanel implements InsidePanel{
    
    /**
     * Creates new form UltimasEntradasPanel
     */
    public UltimasEntradasPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("\u00daltimas Entradas"));
        jLabel1.setText("Ver las \u00faltimas");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "20", "30", "40", "50" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setText("entradas.");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable1.getSelectedRow() >= 0){
            int row = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());
            AsientoContable as = null;
            if (row >= 0){
                ResultSetTableModel model = (ResultSetTableModel)jTable1.getModel();
                int asID = new Integer(model.getValueAt(row, 0).toString()).intValue();
                String grupo = model.getValueAt(row, jTable1.convertColumnIndexToModel(jTable1.getColumnModel().getColumnIndex("Grupo"))).toString();
                String motivo = model.getValueAt(row, jTable1.convertColumnIndexToModel(jTable1.getColumnModel().getColumnIndex("Motivo"))).toString();
                String proveedor = model.getValueAt(row, jTable1.convertColumnIndexToModel(jTable1.getColumnModel().getColumnIndex("Proveedor"))).toString();
                String receptor = model.getValueAt(row, jTable1.convertColumnIndexToModel(jTable1.getColumnModel().getColumnIndex("Receptor"))).toString();
                double importe;
                try {
                    importe = new Double(model.getValueAt(row, jTable1.convertColumnIndexToModel(jTable1.getColumnModel().getColumnIndex("Importe"))).toString()).doubleValue();
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    importe = 0;
                }
                Date d = (Date)model.getValueAt(row, jTable1.convertColumnIndexToModel(jTable1.getColumnModel().getColumnIndex("Fecha")));
                Calendar fecha = new GregorianCalendar();
                fecha.setTime(d);
                as = new AsientoContable(asID, grupo, motivo, proveedor, receptor, importe, fecha);
            }
            if(as != null){
                EditarAsientoDialog ead = new EditarAsientoDialog(this.owner, true, as);
                ead.setLocationRelativeTo(null);
                this.owner.setCurrentDialog(ead);
                ead.setVisible(true);
            }
        } else{
            JOptionPane jop = new JOptionPane("No has seleccionado ning�n asiento contable. Selecciona una fila e int�ntalo de nuevo.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Imposible editar el asiento contable").setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (jTable1.getSelectedRow() >= 0){
            int row = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());
            if (row >= 0){
                JOptionPane jop = new JOptionPane();
                //0 -> YES, 1 -> NO
                int option =jop.showConfirmDialog(this, "�Estas seguro de que quieres borrar el asiento seleccionado?", "Se va a borrar un asiento contable", JOptionPane.YES_NO_OPTION);
                if(option == 0){
                    Integer asID = new Integer(((ResultSetTableModel)jTable1.getModel()).getValueAt(row, 0).toString());
                    manager.borrarAsiento(asID.intValue());
                }
            }
            this.owner.updateData();
        } else{
            JOptionPane jop = new JOptionPane("No has seleccionado ning�n asiento contable. Selecciona una fila e int�ntalo de nuevo.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Imposible borrar el asiento contable").setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int i = 10;
        try {
            i = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        try {
            ((ResultSetTableModel)jTable1.getModel()).setQuery(this.manager.constructUltimosAsientos(i));
            jTable1.getColumnModel().removeColumn(jTable1.getColumnModel().getColumn(jTable1.getColumnModel().getColumnIndex("ID")));
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    
    /**
     * 
     * @param parent 
     */
    public void initData(MainForm parent) {
        this.owner = parent;
        this.manager = this.owner.getManager();
        int i = 10;
        try {
            i = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        jTable1.setModel(new ResultSetTableModel(Connector.JDBC_DRIVER, Connector.DATABASE_URL, this.manager.getConnector().getUsername(), this.manager.getConnector().getPassword(), this.manager.constructUltimosAsientos(i)));
        jTable1.getColumnModel().removeColumn(jTable1.getColumnModel().getColumn(jTable1.getColumnModel().getColumnIndex("ID")));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void updateData() {
        try {
            ((ResultSetTableModel)jTable1.getModel()).refress();
            jTable1.getColumnModel().removeColumn(jTable1.getColumnModel().getColumn(jTable1.getColumnModel().getColumnIndex("ID")));
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Error al acceder a la base de datos.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error de base de datos").setVisible(true);
        }
    }

    public void disconnectResultSetTableModels() {
        ((ResultSetTableModel)jTable1.getModel()).disconnectFromDatabase();
    }
    
    
    // Declaraci�n de varibales -no modificar//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // Fin de declaraci�n de variables//GEN-END:variables
    
    private MainForm owner;
    
    private Manager manager;
    
}
