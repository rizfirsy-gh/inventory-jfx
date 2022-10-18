/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.rizfirsy.inventory;

import javafx.scene.Scene;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ScrollPane;

/**
 * FXML Controller class
 *
 * @author Rizky Firman Syah
 */
public class DashboardController implements Initializable {

    public ScrollPane mainPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> countryChart = new BarChart<>(xAxis, yAxis);
        countryChart.setTitle("Country Chart");
        xAxis.setLabel("Negara");
        yAxis.setLabel("Value");
        
        XYChart.Series seriesAsia = new XYChart.Series();
        seriesAsia.setName("Asia");
        seriesAsia.getData().add(new XYChart.Data("Indonesia", 5000));
        seriesAsia.getData().add(new XYChart.Data("Japan", 1200));
        seriesAsia.getData().add(new XYChart.Data("China", 1000));
        seriesAsia.getData().add(new XYChart.Data("Singapore", 10000));
        
        XYChart.Series seriesEurope = new XYChart.Series();
        seriesEurope.setName("Europe");
        seriesEurope.getData().add(new XYChart.Data("France", 8000));
        seriesEurope.getData().add(new XYChart.Data("England", 7000));
        seriesEurope.getData().add(new XYChart.Data("Denmark", 2000));
        seriesEurope.getData().add(new XYChart.Data("Italy", 9000));
        
        countryChart.getData().addAll(seriesAsia, seriesEurope);
        
        mainPane.setContent(countryChart);
    }    
    
    
}
