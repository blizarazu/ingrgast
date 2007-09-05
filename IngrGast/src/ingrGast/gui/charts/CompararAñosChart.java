/*
 * CompararAñosChart.java
 *
 * Created on 27 de agosto de 2007, 23:31
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.gui.charts;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.VerticalAlignment;
import org.jfree.util.UnitType;

/**
 *
 * @author Beñat
 */
public class CompararAñosChart {
    
    private JFreeChart chart;
    private ChartPanel chartpanel;
    private DefaultCategoryDataset categorydataset1;
    private DefaultCategoryDataset categorydataset2;
    private DefaultCategoryDataset categorydataset3;
    
    private final String[] months = new String[]{
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    /** Creates a new instance of CompararAñosChart */
    public CompararAñosChart(int año1, Vector<Double> vIngr1, Vector<Double> vGast1, Vector<Double> vSaldo1, int año2, Vector<Double> vIngr2, Vector<Double> vGast2, Vector<Double> vSaldo2) {
        categorydataset1 = new DefaultCategoryDataset();
        categorydataset2 = new DefaultCategoryDataset();
        categorydataset3 = new DefaultCategoryDataset();
        int i;
        i = 0;
        for(Double value: vIngr1){
            categorydataset1.addValue(value.doubleValue(), String.valueOf(año1), months[i]);
            i++;
        }
        i = 0;
        for(Double value: vIngr2){
            categorydataset1.addValue(value.doubleValue(), String.valueOf(año2), months[i]);
            i++;
        }
        
        i = 0;
        for(Double value: vGast1){
            categorydataset2.addValue(value.doubleValue(), String.valueOf(año1), months[i]);
            i++;
        }
        i = 0;
        for(Double value: vGast2){
            categorydataset2.addValue(value.doubleValue(), String.valueOf(año2), months[i]);
            i++;
        }
        
        i = 0;
        for(Double value: vSaldo1){
            categorydataset3.addValue(value.doubleValue(), String.valueOf(año1), months[i]);
            i++;
        }
        i = 0;
        for(Double value: vSaldo2){
            categorydataset3.addValue(value.doubleValue(), String.valueOf(año2), months[i]);
            i++;
        }
        this.createChart();
    }
    
    private void createChart() {
        BarRenderer3D barrenderer3d1 = new BarRenderer3D();
        barrenderer3d1.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        barrenderer3d1.setDrawBarOutline(false);
        NumberAxis3D numberaxis1 = new NumberAxis3D("Ingresos");
        CategoryPlot categoryplot1 = new CategoryPlot(categorydataset1, null, numberaxis1, barrenderer3d1);
        categoryplot1.setDomainGridlinesVisible(true);
        categoryplot1.setForegroundAlpha(0.7F);
        categoryplot1.getRenderer().setSeriesPaint(0, Color.BLUE);
        categoryplot1.getRenderer().setSeriesPaint(1, Color.RED);
        
        BarRenderer3D barrenderer3d2 = new BarRenderer3D();
        barrenderer3d2.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        barrenderer3d2.setDrawBarOutline(false);
        NumberAxis3D numberaxis2 = new NumberAxis3D("Gastos");
        CategoryPlot categoryplot2 = new CategoryPlot(categorydataset2, null, numberaxis2, barrenderer3d2);
        categoryplot2.setDomainGridlinesVisible(true);
        categoryplot2.setForegroundAlpha(0.7F);
        categoryplot2.getRenderer().setSeriesPaint(0, Color.BLUE);
        categoryplot2.getRenderer().setSeriesPaint(1, Color.RED);
        
        BarRenderer3D barrenderer3d3 = new BarRenderer3D();
        barrenderer3d3.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        barrenderer3d3.setDrawBarOutline(false);
        NumberAxis3D numberaxis3 = new NumberAxis3D("Saldo");
        CategoryPlot categoryplot3 = new CategoryPlot(categorydataset3, null, numberaxis3, barrenderer3d3);
        categoryplot3.setDomainGridlinesVisible(true);
        categoryplot3.setForegroundAlpha(0.7F);
        categoryplot3.getRenderer().setSeriesPaint(0, Color.BLUE);
        categoryplot3.getRenderer().setSeriesPaint(1, Color.RED);
        
        CategoryAxis3D categoryaxis3d = new CategoryAxis3D("Meses");
        categoryaxis3d.setCategoryMargin(0.4D);
        categoryaxis3d.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        CombinedDomainCategoryPlot combineddomaincategoryplot = new CombinedDomainCategoryPlot(categoryaxis3d);
        combineddomaincategoryplot.add(categoryplot1, 1);
        combineddomaincategoryplot.add(categoryplot2, 1);
        combineddomaincategoryplot.add(categoryplot3, 1);
        
        chart = new JFreeChart("Comparativa anual", new Font("SansSerif", 1, 12), combineddomaincategoryplot, true);
        chartpanel = new ChartPanel(chart);
    }
    
    public void updateValues(int año1, Vector<Double> vIngr1, Vector<Double> vGast1, Vector<Double> vSaldo1, int año2, Vector<Double> vIngr2, Vector<Double> vGast2, Vector<Double> vSaldo2){
        categorydataset1.clear();
        categorydataset2.clear();
        categorydataset3.clear();
        int i;
        i = 0;
        for(Double value: vIngr1){
            categorydataset1.addValue(value.doubleValue(), String.valueOf(año1), months[i]);
            i++;
        }
        i = 0;
        for(Double value: vIngr2){
            categorydataset1.addValue(value.doubleValue(), String.valueOf(año2), months[i]);
            i++;
        }
        
        i = 0;
        for(Double value: vGast1){
            categorydataset2.addValue(value.doubleValue(), String.valueOf(año1), months[i]);
            i++;
        }
        i = 0;
        for(Double value: vGast2){
            categorydataset2.addValue(value.doubleValue(), String.valueOf(año2), months[i]);
            i++;
        }
        
        i = 0;
        for(Double value: vSaldo1){
            categorydataset3.addValue(value.doubleValue(), String.valueOf(año1), months[i]);
            i++;
        }
        i = 0;
        for(Double value: vSaldo2){
            categorydataset3.addValue(value.doubleValue(), String.valueOf(año2), months[i]);
            i++;
        }
    }
    
    public void setTitle(int año1, int año2){
        //chart.clearSubtitles();
        
        TextTitle texttitle = new TextTitle("Comparativa entre los años " + String.valueOf(año1) + " y " + String.valueOf(año2));
        texttitle.setFont(new Font("SansSerif", 0, 12));
        texttitle.setPosition(RectangleEdge.TOP);
        texttitle.setPadding(new RectangleInsets(UnitType.RELATIVE, 0.050000000000000003D, 0.050000000000000003D, 0.050000000000000003D, 0.050000000000000003D));
        texttitle.setVerticalAlignment(VerticalAlignment.BOTTOM);
        chart.setTitle(texttitle);
        //chart.addSubtitle(texttitle);
    }
    
    public void setIngresosVisible(boolean flag){
        //((CategoryPlot)((CombinedDomainCategoryPlot)chart.getCategoryPlot()).getSubplots().get(1)).setWeight(0);
        //((CategoryPlot)((CombinedDomainCategoryPlot)chart.getCategoryPlot()).getSubplots().get(1)).getRenderer().setSeriesVisible(0, flag);
    }
    
    public void setGastosVisible(boolean flag){
        //chart.getCategoryPlot().getRenderer().setSeriesVisible(1, flag);
    }
    
    public void setSaldoVisible(boolean flag){
        //chart.getCategoryPlot().getRenderer(1).setSeriesVisible(0, flag);
    }
    
    public JFreeChart getChart(){
        return chart;
    }
    
    public ChartPanel getChartPanel(){
        return chartpanel;
    }
}
