/*
 * MainFrame.java
 *
 * Created on July 5, 2007, 5:49 PM
 */

package ingrGast.gui;

import ingrGast.db.Connector;
import ingrGast.gui.dialogs.EditarConceptoDialog;
import ingrGast.gui.dialogs.EditarGrupoDialog;
import ingrGast.gui.dialogs.NuevoAsientoDialog;
import ingrGast.gui.themes.AquaMetalTheme;
import ingrGast.gui.themes.ContrastMetalTheme;
import ingrGast.gui.themes.GreenMetalTheme;
import ingrGast.gui.themes.SandMetalTheme;
import ingrGast.gui.util.UISwitchListener;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dialog;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.plaf.metal.OceanTheme;

/**
 *
 * @author Blizarazu
 */
public class MainFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame(Connector con) {
        UIManager.addPropertyChangeListener(new UISwitchListener((JComponent)getRootPane()));
        this.manager = new Manager(con);
        initComponents();
        InsidePanel ip;
        for(Component c: jPanel2.getComponents()){
            ip = (InsidePanel)c;
            ip.initData(this);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        balancePanel1 = new ingrGast.gui.mainInsidePanels.BalancePanel();
        consultarDatosPanel1 = new ingrGast.gui.mainInsidePanels.ConsultarDatosPanel();
        ultimasEntradasPanel1 = new ingrGast.gui.mainInsidePanels.UltimasEntradasPanel();
        graficosPanel1 = new ingrGast.gui.mainInsidePanels.GraficosPanel();
        cierreAñoPanel1 = new ingrGast.gui.mainInsidePanels.CierreAñoPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IngrGast");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/appIcon_48x48.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/NuevoAsiento_48x48.png"))); // NOI18N
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/BalanceAnual_48x48.png"))); // NOI18N
        jButton3.setToolTipText("Balance Anual");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/ConsultarDatos_48x48.png"))); // NOI18N
        jButton1.setToolTipText("Consultar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/UltimasEntradas_48x48.png"))); // NOI18N
        jButton4.setToolTipText("Últimas Entradas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/Graficos_48x48.png"))); // NOI18N
        jButton5.setToolTipText("Gráficos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setText("Cierre Del Año");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jPanel2.setLayout(new java.awt.CardLayout());
        jPanel2.add(balancePanel1, "Balance");
        jPanel2.add(consultarDatosPanel1, "Consultar");
        jPanel2.add(ultimasEntradasPanel1, "Ultimas");
        jPanel2.add(graficosPanel1, "Graficos");
        jPanel2.add(cierreAñoPanel1, "CierreAño");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jMenu4.setText("Archivo");

        jMenu5.setText("Nuevo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/NuevoAsiento_24x24.png"))); // NOI18N
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

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/BalanceAnual_24x24.png"))); // NOI18N
        jMenuItem7.setText("Balance Anual");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/ConsultarDatos_24x24.png"))); // NOI18N
        jMenuItem14.setText("Consultar Datos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/UltimasEntradas_24x24.png"))); // NOI18N
        jMenuItem15.setText("Últimas Entradas");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/Graficos_24x24.png"))); // NOI18N
        jMenuItem16.setText("Gráficos");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("Opciones");

        jMenu9.setText("Apariencia");

        buttonGroup1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Sistema");
        jRadioButtonMenuItem1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonMenuItem1ItemStateChanged(evt);
            }
        });
        jMenu9.add(jRadioButtonMenuItem1);

        jMenu10.setText("Metal");

        buttonGroup1.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Ocean (Predeterminado)");
        jRadioButtonMenuItem2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonMenuItem2ItemStateChanged(evt);
            }
        });
        jMenu10.add(jRadioButtonMenuItem2);

        buttonGroup1.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText("Aqua");
        jRadioButtonMenuItem3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonMenuItem3ItemStateChanged(evt);
            }
        });
        jMenu10.add(jRadioButtonMenuItem3);

        buttonGroup1.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Contrast");
        jRadioButtonMenuItem4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonMenuItem4ItemStateChanged(evt);
            }
        });
        jMenu10.add(jRadioButtonMenuItem4);

        buttonGroup1.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setText("Green");
        jRadioButtonMenuItem5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonMenuItem5ItemStateChanged(evt);
            }
        });
        jMenu10.add(jRadioButtonMenuItem5);

        buttonGroup1.add(jRadioButtonMenuItem6);
        jRadioButtonMenuItem6.setText("Sand");
        jRadioButtonMenuItem6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonMenuItem6ItemStateChanged(evt);
            }
        });
        jMenu10.add(jRadioButtonMenuItem6);

        jMenu9.add(jMenu10);

        jMenu8.add(jMenu9);

        jMenuBar1.add(jMenu8);

        jMenu2.setText("Ayuda");

        jMenuItem6.setText("Acerca de ...");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Graficos");
    }//GEN-LAST:event_jMenuItem16ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Graficos");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButtonMenuItem6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ItemStateChanged
        try {
            MetalTheme theme=new SandMetalTheme();
            MetalLookAndFeel.setCurrentTheme(theme);
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButtonMenuItem6ItemStateChanged

    private void jRadioButtonMenuItem5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ItemStateChanged
        try {
            MetalTheme theme=new GreenMetalTheme();
            MetalLookAndFeel.setCurrentTheme(theme);
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButtonMenuItem5ItemStateChanged
    
    private void jRadioButtonMenuItem4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ItemStateChanged
        try {
            MetalTheme theme=new ContrastMetalTheme();
            MetalLookAndFeel.setCurrentTheme(theme);
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButtonMenuItem4ItemStateChanged
    
    private void jRadioButtonMenuItem3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ItemStateChanged
        try {
            MetalTheme theme=new AquaMetalTheme();
            MetalLookAndFeel.setCurrentTheme(theme);
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButtonMenuItem3ItemStateChanged
    
    private void jRadioButtonMenuItem2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ItemStateChanged
        try {
            MetalTheme theme = new OceanTheme();
            MetalLookAndFeel.setCurrentTheme(theme);
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Problema al cargar la nueva apariencia.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error").setVisible(true);
        }
    }//GEN-LAST:event_jRadioButtonMenuItem2ItemStateChanged
    
    private void jRadioButtonMenuItem1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ItemStateChanged
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane jop = new JOptionPane("Problema al cargar la nueva apariencia.", JOptionPane.ERROR_MESSAGE);
            jop.createDialog(null, "Error").setVisible(true);
        }
    }//GEN-LAST:event_jRadioButtonMenuItem1ItemStateChanged
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NuevoAsientoDialog naDialog = new NuevoAsientoDialog(this, true);
        currentDialog = naDialog;
        naDialog.setLocationRelativeTo(null);
        naDialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Ultimas");
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Ultimas");
    }//GEN-LAST:event_jMenuItem15ActionPerformed
    
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Consultar");
    }//GEN-LAST:event_jMenuItem14ActionPerformed
    
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Balance");
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Balance");
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((CardLayout)jPanel2.getLayout()).show(jPanel2, "Consultar");
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.manager.disconnectDB();
        InsidePanel ip;
        for(Component c: jPanel2.getComponents()){
            ip = (InsidePanel)c;
            ip.disconnectResultSetTableModels();
        }
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

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    ((CardLayout)jPanel2.getLayout()).show(jPanel2, "CierreAño");
}//GEN-LAST:event_jButton6ActionPerformed
    
    public void openNuevoAsientoDialog(){
        if(currentDialog != null)
            currentDialog.dispose();
        NuevoAsientoDialog naDialog = new NuevoAsientoDialog(this, true);
        currentDialog = naDialog;
        naDialog.setLocationRelativeTo(null);
        naDialog.setVisible(true);
    }
    
    /**
     *
     * @param currentDialog
     */
    public void setCurrentDialog(Dialog currentDialog) {
        this.currentDialog = currentDialog;
    }
    
    /**
     *
     * @return
     */
    public Dialog getCurrentDialog() {
        return currentDialog;
    }
    
    /**
     *
     * @return
     */
    public Manager getManager() {
        return manager;
    }
    
    public void updateData(){
        InsidePanel ip;
        for(Component c: jPanel2.getComponents()){
            ip = (InsidePanel)c;
            ip.updateData();
        }
    }
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainForm = new MainFrame(con);
                mainForm.setLocationRelativeTo(null);
                mainForm.setExtendedState(MAXIMIZED_BOTH);
                mainForm.setVisible(true);
            }
        });
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ingrGast.gui.mainInsidePanels.BalancePanel balancePanel1;
    private javax.swing.ButtonGroup buttonGroup1;
    private ingrGast.gui.mainInsidePanels.CierreAñoPanel cierreAñoPanel1;
    private ingrGast.gui.mainInsidePanels.ConsultarDatosPanel consultarDatosPanel1;
    private ingrGast.gui.mainInsidePanels.GraficosPanel graficosPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private ingrGast.gui.mainInsidePanels.UltimasEntradasPanel ultimasEntradasPanel1;
    // End of variables declaration//GEN-END:variables
    
    private Dialog currentDialog = null;
    private Manager manager;
}
