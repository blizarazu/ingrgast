/*
 * BalanceAnualChart.java
 *
 * Created on 27 de agosto de 2007, 16:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ingrGast.gui.charts;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
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
public class BalanceAnualChart{
    
    private JFreeChart chart;
    private ChartPanel chartpanel;
    private DefaultCategoryDataset categorydataset1;
    private DefaultCategoryDataset categorydataset2;
    
    private final String[] months = new String[]{
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    /** Creates a new instance of BalanceAnualChart */
    public BalanceAnualChart(Vector<Double> vIngr, Vector<Double> vGast, Vector<Double> vSaldo) {
        categorydataset1 = new DefaultCategoryDataset();
        categorydataset2 = new DefaultCategoryDataset();
        int i;
        i = 0;
        for(Double value: vIngr){
            categorydataset1.addValue(value.doubleValue(), "Ingreso", months[i]);
            i++;
        }
        i = 0;
        for(Double value: vGast){
            categorydataset1.addValue(value.doubleValue(), "Gasto", months[i]);
            i++;
        }
        i = 0;
        for(Double value: vSaldo){
            categorydataset2.addValue(value.doubleValue(), "Saldo", months[i]);
            i++;
        }
        this.createChart();
    }
    
    public void updateValues(Vector<Double> vIngr, Vector<Double> vGast, Vector<Double> vSaldo){
        categorydataset1.clear();
        categorydataset2.clear();
        int i;
        i = 0;
        for(Double value: vIngr){
            categorydataset1.addValue(value.doubleValue(), "Ingreso", months[i]);
            i++;
        }
        i = 0;
        for(Double value: vGast){
            categorydataset1.addValue(value.doubleValue(), "Gasto", months[i]);
            i++;
        }
        i = 0;
        for(Double value: vSaldo){
            categorydataset2.addValue(value.doubleValue(), "Saldo", months[i]);
            i++;
        }
    }
    
    public void createChart(){
        chart = ChartFactory.createAreaChart("Balance Anual", "Meses", "Importe", categorydataset1, PlotOrientation.VERTICAL, true, true, false);
        
        CategoryPlot categoryplot = (CategoryPlot)chart.getPlot();
        categoryplot.setForegroundAlpha(0.5F);
        categoryplot.setAxisOffset(new RectangleInsets(5D, 5D, 5D, 5D));
        
        categoryplot.setDomainGridlinesVisible(true);
        
        categoryplot.setRangeGridlinesVisible(true);
        
        CategoryAxis categoryaxis = categoryplot.getDomainAxis();
        categoryaxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        categoryaxis.setLowerMargin(0.0D);
        categoryaxis.setUpperMargin(0.0D);
        
        categoryplot.getRenderer().setSeriesPaint(0, Color.GREEN);
        categoryplot.getRenderer().setSeriesPaint(1, Color.RED);
        
        NumberAxis numberaxis = (NumberAxis)categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        numberaxis.setLabelAngle(0.0D);
        
        categoryplot.setDataset(1, categorydataset2);
        categoryplot.mapDatasetToRangeAxis(1, 0);
        
        LineAndShapeRenderer linerenderer = new LineAndShapeRenderer();
        //linerenderer.setShapesVisible(true);
        linerenderer.setUseFillPaint(true);
        linerenderer.setBaseFillPaint(Color.white);
        linerenderer.setSeriesStroke(0, new BasicStroke(3F));
        linerenderer.setSeriesStroke(1, new BasicStroke(3F));
        linerenderer.setSeriesOutlineStroke(0, new BasicStroke(2.0F));
        linerenderer.setSeriesOutlineStroke(1, new BasicStroke(2.0F));
        linerenderer.setSeriesShape(0, new java.awt.geom.Ellipse2D.Double(-5D, -5D, 10D, 10D));
        linerenderer.setSeriesShape(1, new java.awt.geom.Ellipse2D.Double(-5D, -5D, 10D, 10D));
        linerenderer.setSeriesPaint(0, Color.blue);
        linerenderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        categoryplot.setRenderer(1, linerenderer);
        categoryplot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        
        chartpanel = new ChartPanel(chart);
    }
    
    public void setTitle(int año){
        //chart.clearSubtitles();
        TextTitle texttitle = new TextTitle("Balance del año " + String.valueOf(año));
        texttitle.setFont(new Font("SansSerif", 0, 12));
        texttitle.setPosition(RectangleEdge.TOP);
        texttitle.setPadding(new RectangleInsets(UnitType.RELATIVE, 0.050000000000000003D, 0.050000000000000003D, 0.050000000000000003D, 0.050000000000000003D));
        texttitle.setVerticalAlignment(VerticalAlignment.BOTTOM);
        chart.setTitle(texttitle);
    }
    
    public void setIngresosVisible(boolean flag){
        chart.getCategoryPlot().getRenderer().setSeriesVisible(0, flag);
    }
    
    public void setGastosVisible(boolean flag){
        chart.getCategoryPlot().getRenderer().setSeriesVisible(1, flag);
    }
    
    public void setSaldoVisible(boolean flag){
        chart.getCategoryPlot().getRenderer(1).setSeriesVisible(0, flag);
    }
    
    public JFreeChart getChart(){
        return chart;
    }
    
    public ChartPanel getChartPanel(){
        return chartpanel;
    }
}
