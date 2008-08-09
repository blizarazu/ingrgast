/*
 * CeirreAñoPanel.java
 *
 * Created on 27 de junio de 2008, 12:18
 */
package ingrGast.gui.mainInsidePanels;

import ingrGast.gui.MainFrame;
import ingrGast.interfaces.InsidePanel;
import ingrGast.management.Manager;
import ingrGast.objects.DatosCierreAño;
import java.awt.BorderLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author  Blizarazu
 */
public class CierreAñoPanel extends javax.swing.JPanel implements InsidePanel {

    private final URL reportPath = CierreAñoPanel.class.getResource("/ingrGast/resources/reports/CierreDeAñoReport.jasper");

    /** Creates new form CeirreAñoPanel */
    public CierreAñoPanel() {
        initComponents();
    }

    private void createReports(int año) {
        try {
            List<DatosCierreAño> gastosData = this.manager.getCierreAñoGastos(año);
            List<DatosCierreAño> ingresosData = this.manager.getCierreAñoIngresos(año);
            List<DatosCierreAño> totalesData = this.manager.getCierreAñoTotal(año);

            JRBeanCollectionDataSource datasourceG = new JRBeanCollectionDataSource(gastosData);
            JasperReport masterReportG = (JasperReport) JRLoader.loadObject(reportPath);

            Map masterParamsG = new HashMap();


            JRBeanCollectionDataSource datasourceI = new JRBeanCollectionDataSource(ingresosData);
            JasperReport masterReportI = (JasperReport) JRLoader.loadObject(reportPath);

            Map masterParamsI = new HashMap();


            JRBeanCollectionDataSource datasourceT = new JRBeanCollectionDataSource(totalesData);
            JasperReport masterReportT = (JasperReport) JRLoader.loadObject(reportPath);

            Map masterParamsT = new HashMap();


            JasperPrint jpG = JasperFillManager.fillReport(masterReportG, masterParamsG, datasourceG);
            jPanel1.remove(jrViewerGastos);
            jrViewerGastos.clear();
            jrViewerGastos = new JRViewer(jpG);
            jPanel1.add(jrViewerGastos, BorderLayout.CENTER);

            JasperPrint jpI = JasperFillManager.fillReport(masterReportI, masterParamsI, datasourceI);
            jPanel2.remove(jrViewerIngresos);
            jrViewerIngresos.clear();
            jrViewerIngresos = new JRViewer(jpI);
            jPanel2.add(jrViewerIngresos, BorderLayout.CENTER);

            JasperPrint jpT = JasperFillManager.fillReport(masterReportT, masterParamsT, datasourceT);
            jPanel3.remove(jrViewerTotales);
            jrViewerTotales.clear();
            jrViewerTotales = new JRViewer(jpT);
            jPanel3.add(jrViewerTotales, BorderLayout.CENTER);
        } catch (JRException ex) {
            Logger.getLogger(CierreAñoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    //jpGastos = JasperFillManager.fillReport(masterReportG, masterParamsG, datasourceG);
    //jpIngresos = JasperFillManager.fillReport(masterReportI, masterParamsI, datasourceI);
    //jpTotales = JasperFillManager.fillReport(masterReportT, masterParamsT, datasourceT);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cierre del Año"));

        jLabel1.setText("Año:");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jPanel2.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Ingresos", jPanel2);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Gastos", jPanel1);

        jPanel3.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Totales", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Totales");
    }// </editor-fold>//GEN-END:initComponents

private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
    if (jComboBox1.getSelectedItem() != null) {
        int año;
        if(jComboBox1.getSelectedItem() instanceof  String)
            año = -1;
        else
            año = ((Integer) jComboBox1.getSelectedItem()).intValue();
        createReports(año);
    }
}//GEN-LAST:event_jComboBox1ItemStateChanged

    public void initData(MainFrame parent) {
        this.owner = parent;
        this.manager = this.owner.getManager();
        try {
            // Erreportea hutsik erakusteko aurrekoa komentatu eta ondokoa
            // erabili.
            Collection<DatosCierreAño> list = new ArrayList<DatosCierreAño>();
            list.add(new DatosCierreAño());

            JRBeanCollectionDataSource gastosDatasource = new JRBeanCollectionDataSource(list);
            JRBeanCollectionDataSource ingresosDatasource = new JRBeanCollectionDataSource(list);
            JRBeanCollectionDataSource totalesDatasource = new JRBeanCollectionDataSource(list);

            JasperReport gastosReport = (JasperReport) JRLoader.loadObject(reportPath);
            JasperReport ingresosReport = (JasperReport) JRLoader.loadObject(reportPath);
            JasperReport totalesReport = (JasperReport) JRLoader.loadObject(reportPath);

            Map masterParams = new HashMap();

            jpGastos = JasperFillManager.fillReport(gastosReport, masterParams, gastosDatasource);
            jpIngresos = JasperFillManager.fillReport(ingresosReport, masterParams, ingresosDatasource);
            jpTotales = JasperFillManager.fillReport(totalesReport, masterParams, totalesDatasource);

            jrViewerGastos = new JRViewer(jpGastos);
            jrViewerIngresos = new JRViewer(jpIngresos);
            jrViewerTotales = new JRViewer(jpTotales);

            jPanel1.add(jrViewerGastos, BorderLayout.CENTER);
            jPanel2.add(jrViewerIngresos, BorderLayout.CENTER);
            jPanel3.add(jrViewerTotales, BorderLayout.CENTER);
        } catch (JRException ex) {
            Logger.getLogger(CierreAñoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.chargeComboBox();
    }

    public void updateData() {
        this.chargeComboBox();
    }

    public void disconnectResultSetTableModels() {
    }
    
    private void chargeComboBox(){
        Vector<Integer> vYears = this.manager.getAñosAsientos();
        this.jComboBox1.removeAllItems();
        jComboBox1.addItem("TODOS");
        for (Integer i: vYears)
            jComboBox1.addItem(i);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    private JRViewer jrViewerGastos;
    private JRViewer jrViewerIngresos;
    private JRViewer jrViewerTotales;
    private JasperPrint jpGastos;
    private JasperPrint jpTotales;
    private JasperPrint jpIngresos;
    private MainFrame owner;
    private Manager manager;
}
