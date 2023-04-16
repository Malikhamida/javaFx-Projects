/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.system;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author Malik
 */
public class SystemPageController implements Initializable {

    @FXML
    private Button LoginOUTBtn;
    @FXML
    private Label labelUSD;
    @FXML
    private Label LableNIS;
    @FXML
    private TextField TextFiledUSD;
    @FXML
    private TextField TextFiledNIS;
    @FXML
    private Button ConvertBtn;
    private final double DOLLAR_TO_SHEKEL_EXCHANGE_RATE = 3.67;
    @FXML
    private Button Restartbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoginOUTBtn(ActionEvent event) {
        
        ViewManager.closeSystemPage();
        ViewManager.openLoginPage();
    }

    @FXML
    private void ConvertUSDToNISBtn(ActionEvent event) {
        if (!TextFiledUSD.getText().isEmpty()) {
                // Convert dollars to shekels
                double dollars = Double.parseDouble(TextFiledUSD.getText());
                double shekels = dollars * DOLLAR_TO_SHEKEL_EXCHANGE_RATE;
                TextFiledNIS.setText(String.format("%.2f", shekels));
               
            } 
        
            else if (!TextFiledNIS.getText().isEmpty()) {
                // Convert shekels to dollars
                double shekels = Double.parseDouble(TextFiledNIS.getText());
                double dollars = shekels / DOLLAR_TO_SHEKEL_EXCHANGE_RATE;
                TextFiledUSD.setText(String.format("%.2f", dollars));
               
            }
        }

    @FXML
    private void Restartbtn(ActionEvent event) {
        TextFiledNIS.clear();
        TextFiledUSD.clear();
    }
    }
    

