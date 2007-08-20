/*
 * MainForm.java
 *
 * Created on July 5, 2007, 5:49 PM
 */

package ingrGast.gui;

import ingrGast.management.Manager;
import java.awt.CardLayout;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author  Be�at
 */
public class MainForm extends javax.swing.JFrame {
    
    /** Creates new form MainForm */
    public MainForm() {
            this.manager = new Manager();
            initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        datosFiltroPanel1 = new DatosFiltroPanel(this);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IngrGast");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/appIcon.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jToolBar1.setFloatable(false);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/NuevoAsiento.png")));
        jButton2.setToolTipText("Nuevo Asiento Contable");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton2);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setMaximumSize(new java.awt.Dimension(3, 50));
        jSeparator3.setPreferredSize(new java.awt.Dimension(10, 5));
        jToolBar1.add(jSeparator3);

        jButton1.setText("Consultar Datos");
        jToolBar1.add(jButton1);

        jButton3.setText("\u00daltimos asientos introducidos");
        jToolBar1.add(jButton3);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel1.add(datosFiltroPanel1, "card2");

        jMenu4.setText("Archivo");
        jMenu5.setText("Nuevo");
        jMenuItem1.setText("Asiento Contable");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("Concepto");
        jMenu5.add(jMenuItem2);

        jMenuItem3.setText("Grupo");
        jMenu5.add(jMenuItem3);

        jMenu4.add(jMenu5);

        jMenu4.add(jSeparator2);

        jMenu6.setText("Importar");
        jMenuItem10.setText("Grupos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });

        jMenu6.add(jMenuItem10);

        jMenuItem9.setText("Conceptos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });

        jMenu6.add(jMenuItem9);

        jMenuItem8.setText("Asientos Contables");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });

        jMenu6.add(jMenuItem8);

        jMenu4.add(jMenu6);

        jMenu7.setText("Exportar");
        jMenuItem11.setText("Grupos");
        jMenu7.add(jMenuItem11);

        jMenuItem12.setText("Conceptos");
        jMenu7.add(jMenuItem12);

        jMenuItem13.setText("Asientos Contables");
        jMenu7.add(jMenuItem13);

        jMenu4.add(jMenu7);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Editar");
        jMenuItem5.setText("Grupo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });

        jMenu3.add(jMenuItem5);

        jMenuItem4.setText("Concepto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });

        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Ver");
        jMenuItem7.setText("Datos por Filtro");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuItem6.setText("Acerca de ...");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.manager.disconnectDB();
        datosFiltroPanel1.disconectResultSetTableModels();
    }//GEN-LAST:event_formWindowClosing
    
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
            JFileChooser jfcC = new JFileChooser();
            jfcC.showOpenDialog(this);
            String fileName = jfcC.getSelectedFile().getPath();
            if (fileName.length() > 0)
                this.manager.importarConceptos(fileName);
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
            JFileChooser jfcAC = new JFileChooser();
            jfcAC.showOpenDialog(this);
            String fileName = jfcAC.getSelectedFile().getPath();
            if (fileName.length() > 0)
                this.manager.importarAsientosContables(fileName);
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
            JFileChooser jfcG = new JFileChooser();
            jfcG.showOpenDialog(this);
            if (jfcG.getSelectedFile() != null)
                this.manager.importarGrupos(jfcG.getSelectedFile().getPath());
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NuevoAsientoDialog naDialog = new NuevoAsientoDialog(this, true);
        currentDialog = naDialog;
        naDialog.setLocationRelativeTo(null);
        naDialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
        
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        EditarConceptoDialog ecDialog = new EditarConceptoDialog(this, true);
        currentDialog = ecDialog;
        ecDialog.setLocationRelativeTo(null);
        ecDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        EditarGrupoDialog egDialog = new EditarGrupoDialog(this, true);
        currentDialog = egDialog;
        egDialog.setLocationRelativeTo(null);
        egDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NuevoAsientoDialog naDialog = new NuevoAsientoDialog(this, true);
        currentDialog = naDialog;
        naDialog.setLocationRelativeTo(null);
        naDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
        
    public void openNuevoAsientoDialog(){
        if(currentDialog != null)
            currentDialog.dispose();
        NuevoAsientoDialog naDialog = new NuevoAsientoDialog(this, true);
        currentDialog = naDialog;
        naDialog.setLocationRelativeTo(null);
        naDialog.setVisible(true);
    }
    
    public void setCurrentDialog(Dialog currentDialog) {
        this.currentDialog = currentDialog;
    }
    
    public Dialog getCurrentDialog() {
        return currentDialog;
    }
    
    public Manager getManager() {
        return manager;
    }
    
    public void updateDatosFiltro(){
        datosFiltroPanel1.updateTables();
        datosFiltroPanel1.updateComboBoxes();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainForm mainForm = new MainForm();
                mainForm.setLocationRelativeTo(null);
                mainForm.setExtendedState(MAXIMIZED_BOTH);
                mainForm.setVisible(true);
            }
        });
    }
    
    // Declaraci�n de varibales -no modificar//GEN-BEGIN:variables
    private ingrGast.gui.DatosFiltroPanel datosFiltroPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // Fin de declaraci�n de variables//GEN-END:variables
    
    private Dialog currentDialog = null;
    private Manager manager;
}