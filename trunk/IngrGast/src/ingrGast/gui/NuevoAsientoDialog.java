/*
 * NuevoAsientoDialog.java
 *
 * Created on 16 de julio de 2007, 19:31
 */

package ingrGast.gui;

import com.toedter.calendar.JDateChooser;
import ingrGast.management.Manager;
import ingrGast.objects.AsientoContable;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author  Be�at
 */
public class NuevoAsientoDialog extends javax.swing.JDialog {
    
    /** Creates new form NuevoAsientoDialog */
    public NuevoAsientoDialog(MainForm parent, boolean modal) {
        super(parent, modal);
        System.out.println(this.getOwner().toString());
        this.owner = parent;
        this.manager = this.owner.getManager();
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Asiento Contable");
        setResizable(false);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jLabel2.setText("Grupo:");

        jLabel3.setText("Concepto:");

        jLabel4.setText("Importe:");

        jLabel5.setText("Fecha:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Ingreso");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setEnabled(false);
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                setTipoImporte(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Gasto");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setEnabled(false);
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                setTipoImporte(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Tipo de Importe");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(manager.getGruposNombres()));
        jComboBox1.setSelectedItem(null);

        jComboBox2.setEditable(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(manager.getConceptosMotivos()));
        jComboBox2.setSelectedItem(null);

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(manager.getConceptosProveedores()));
        jComboBox3.setSelectedItem(null);

        jComboBox4.setEditable(true);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(manager.getConceptosReceptores()));
        jComboBox4.setSelectedItem(null);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar y Seguir ->");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("\u20ac");

        jDateChooser1.setToolTipText("D\u00eda-Mes-A\u00f1o");
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        jDateChooser1.setCalendar(cal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 152, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(380, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1)))
                            .addComponent(jLabel6))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, jComboBox2, jComboBox3, jComboBox4, jDateChooser1, jTextField1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String importe = jTextField1.getText().replace(',', '.');
        try{
            Double d = Double.valueOf(importe);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            if(d != 0){
                if(importe.startsWith("-")){
                    jTextField1.setForeground(Color.RED);
                    jRadioButton2.setSelected(true);
                    jRadioButton1.setSelected(false);
                } else{
                    jTextField1.setForeground(Color.GREEN);
                    jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(true);
                }
                jRadioButton1.setEnabled(true);
                jRadioButton2.setEnabled(true);
            } else {
                jTextField1.setForeground(Color.BLACK);
                jRadioButton2.setSelected(false);
                jRadioButton1.setSelected(true);
                jRadioButton1.setEnabled(false);
                jRadioButton2.setEnabled(false);
            }
        } catch(NumberFormatException ex) {
            jTextField1.setForeground(Color.BLACK);
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(true);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField1KeyReleased
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            this.setData();
            this.manager.guardarAsientoContable(this.grupo, this.motivo, this.proveedor, this.receptor, this.importe, this.fecha);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }catch (NumberFormatException ex){
            JOptionPane jop = new JOptionPane("El importe introducido no es correcto", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(this, "Importe incorrecto");
        }
        this.owner.updateDatosFiltro();
        this.owner.openNuevoAsientoDialog();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void setTipoImporte(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_setTipoImporte
        try {
            String importe = jTextField1.getText().replace(',', '.');
            if(Double.valueOf(importe) != 0){
                if(jRadioButton2.isSelected()) {
                    if(!jTextField1.getText().startsWith("-")) {
                        jTextField1.setText("-" + jTextField1.getText());
                        jTextField1.setForeground(Color.RED);
                    }
                } else if(jRadioButton1.isSelected()) {
                    jTextField1.setText(jTextField1.getText().replaceAll("-", ""));
                    jTextField1.setForeground(Color.GREEN);
                }
            }
        } catch (NumberFormatException ex){
            JOptionPane jop = new JOptionPane("El importe introducido no es correcto", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(this, "Importe incorrecto").setVisible(true);
        }
        
    }//GEN-LAST:event_setTipoImporte
    
    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        try{
            String importe = jTextField1.getText().replace(',', '.');
            if(importe.length() == 0)
                jTextField1.setText("0");
            if(Double.valueOf(importe) != 0){
                if(importe.startsWith("-")){
                    jTextField1.setForeground(Color.RED);
                    jRadioButton2.setSelected(true);
                    jRadioButton1.setSelected(false);
                } else{
                    jTextField1.setForeground(Color.GREEN);
                    jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(true);
                }
                jRadioButton1.setEnabled(true);
                jRadioButton2.setEnabled(true);
            } else {
                jTextField1.setForeground(Color.BLACK);
                jRadioButton2.setSelected(false);
                jRadioButton1.setSelected(true);
                jRadioButton1.setEnabled(false);
                jRadioButton2.setEnabled(false);
            }
        }catch(NumberFormatException ex) {
            jTextField1.setText("0");
            jTextField1.setForeground(Color.BLACK);
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(true);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            JOptionPane jop = new JOptionPane("El importe introducido no es correcto", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(this, "Importe incorrecto").setVisible(true);
        }
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jTextField1FocusLost
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            this.setData();
            this.manager.guardarAsientoContable(this.grupo, this.motivo, this.proveedor, this.receptor, this.importe, this.fecha);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane jop = new JOptionPane("El importe introducido no es correcto", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(this, "Importe incorrecto").setVisible(true);
        }
        if (this.owner.getCurrentDialog() == this)
            this.owner.setCurrentDialog(null);
        this.owner.updateDatosFiltro();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void setData() throws NumberFormatException{
        this.grupo = jComboBox1.getSelectedItem().toString().trim();
        this.motivo = jComboBox2.getSelectedItem().toString().trim();
        this.proveedor = jComboBox3.getSelectedItem().toString().trim();
        this.receptor = jComboBox4.getSelectedItem().toString().trim();
        this.importe = Double.valueOf(jTextField1.getText().replace(',', '.').trim());
        this.fecha = jDateChooser1.getCalendar();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.owner.getCurrentDialog() == this)
            this.owner.setCurrentDialog(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Declaraci�n de varibales -no modificar//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // Fin de declaraci�n de variables//GEN-END:variables
    
    private MainForm owner;
    private Manager manager;
    private String grupo;
    private String motivo;
    private String proveedor;
    private String receptor;
    private double importe;
    private Calendar fecha;
}