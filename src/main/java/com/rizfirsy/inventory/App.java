package com.rizfirsy.inventory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.chart.XYChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.CategoryAxis;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    
    private static Scene dashboardScene;
    private static int initialWidth = 1366;
    private static int initialHeight = 769;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       
        scene = new Scene(loadFXML("welcome"));
        stage.setWidth(initialWidth);
        stage.setHeight(initialHeight);
        stage.setScene(scene);
        stage.show();
                
        Scene myScene = stage.getScene();

    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    
    static Scene getScene() {
        return scene;
    }
    
    public static void setWidth (int width) {
        initialWidth = width;
    }
    
    public static void setHeight (int height) {
        initialHeight = height;
    }
    
    public static int getWidth () {
        System.out.println(initialWidth);
        return initialWidth;
    }
    
     public static int getHeight () { 
        System.out.println(initialHeight);
        return initialHeight;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}