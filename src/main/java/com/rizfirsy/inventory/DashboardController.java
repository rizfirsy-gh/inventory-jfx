/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.rizfirsy.inventory;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Rizky Firman Syah
 */
public class DashboardController implements Initializable {    
    @FXML
    private Label clockArea;
    @FXML
    public BarChart salesReport;
    
    private String timeString = ""; 
     
     private void generateWatch () {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");  
        printTime(formatter);
     }
     
     public void printTime(SimpleDateFormat formatter) {
        timeString = formatter.format( Calendar.getInstance().getTime() );  
        clockArea.setText(timeString);
        System.out.println(timeString);
        try { 
            Thread.sleep( 1000 );
        } catch (InterruptedException ex) {
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generateWatch ();
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        salesReport.setTitle("Sales Mingguan");
        xAxis.setLabel("Minggu 1");
        yAxis.setLabel("Minggu 2");
        
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Minggu 1");
        series1.getData().add(new XYChart.Data("Senin", 5000));
        series1.getData().add(new XYChart.Data("Selasa", 3000));
        series1.getData().add(new XYChart.Data("Rabu", 2400));
        series1.getData().add(new XYChart.Data("Kamis", 1200));
        series1.getData().add(new XYChart.Data("Jumat", 4500));

                        

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Minggu 2");
        series2.getData().add(new XYChart.Data("Senin", 2000));
        series2.getData().add(new XYChart.Data("Selasa", 1600));
        series2.getData().add(new XYChart.Data("Rabu", 7000));
        series2.getData().add(new XYChart.Data("Kamis", 2200));
        series2.getData().add(new XYChart.Data("Jumat", 4300));
        
        salesReport.getData().addAll(series1, series2);
    }    
    
    
}
