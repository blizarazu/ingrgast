/*
 * LoginFrame.java
 *
 * Created on 22 de agosto de 2007, 17:20
 */

package ingrGast.gui;

import ingrGast.db.Connector;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author  Beñat
 */
public class LoginFrame extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -4826712175180267575L;
	
	/** Creates new form LoginFrame */
    public LoginFrame() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Código Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IngrGast Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/key_48x48.png")).getImage());
        setResizable(false);
        jLabel1.setText("Nombre de usuario:");

        jLabel2.setText("Contrase\u00f1a:");

        jButton1.setText("Aceptar");
        this.getRootPane().setDefaultButton(this.jButton1);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connector con = new Connector(jTextField1.getText(), String.valueOf(jPasswordField1.getPassword()));
            MainFrame mainForm = new MainFrame(con);
            mainForm.setLocationRelativeTo(null);
            mainForm.setExtendedState(MAXIMIZED_BOTH);
            this.setVisible(false);
            mainForm.setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            if(ex.getErrorCode() == 1045){
                JOptionPane jop = new JOptionPane("El nombre de usuario o la contraseña son incorrectos.", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/loginFailed_48x48.png")));
                jop.createDialog(null, "Conexión fallida").setVisible(true);
            }else if(ex.getErrorCode() == 1044){
                JOptionPane jop = new JOptionPane("Este usuario no tiene permisos para acceder al programa.", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/ingrGast/resources/loginFailed_48x48.png")));
                jop.createDialog(null, "Conexión fallida").setVisible(true);
            } else if (ex.getErrorCode() == 0){
                JOptionPane jop = new JOptionPane("MySQL no está en marcha.", JOptionPane.ERROR_MESSAGE);
                jop.createDialog(null, "Conexión fallida").setVisible(true);
            }
            jTextField1.setText("");
            jPasswordField1.setText("");
            jTextField1.requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
                LoginFrame login = new LoginFrame();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }
    
    // Declaración de varibales -no modificar//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // Fin de declaración de variables//GEN-END:variables
    
}
