/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.rizfirsy.inventory;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rizky Firman Syah
 */
public class WelcomeController  {
    
    @FXML
    public TextField username;
    @FXML
    public PasswordField password;
    @FXML
    public Button loginButton;
    @FXML
    public Button clearButton;
    
    @FXML
    private void initialize() {
        //disable button when input is empty
        loginButton.setDisable(true);
        clearButton.setDisable(true);
    }

   @FXML
    private void buttonHandler(ActionEvent e) throws IOException {
        
        if (username.getText().trim() != "" || password.getText().trim() == "") {
            loginButton.setDisable(false);
            clearButton.setDisable(false);
        }
        
        if(username.getText().trim().length() < 0 || password.getText().trim() == "") {
            loginButton.setDisable(true);
            clearButton.setDisable(true);
        }
        
        if(e.getSource().equals(loginButton)) {
                System.out.println("login lah bro");
                App.setRoot("dashboard");
            }
        
        if(e.getSource().equals(clearButton)) {
            username.setText("");
            password.setText("");
            System.out.println("clearead");
        }
    }  
    
    @FXML
    private void fieldKeyReleasedHandler () {
       boolean disableButton = username.getText().isEmpty() && password.getText().isEmpty();
        loginButton.setDisable(disableButton);
        clearButton.setDisable(disableButton);
    }
    
}
