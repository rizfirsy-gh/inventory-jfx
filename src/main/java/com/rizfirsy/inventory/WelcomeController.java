/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.rizfirsy.inventory;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Rizky Firman Syah
 */
public class WelcomeController  {

   @FXML
    private void switchToDashboard() throws IOException {
        App.setWidth(1920);
        App.setHeight(1080);
        
        App.setRoot("dashboard");
        App.getWidth();
        App.getHeight();
    }  
    
}
