/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import View.ViewManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Malik
 */
public class LoginPage extends Stage{
    
    final Label labelUserName;
    final TextField textFiledUserName;
    final Label paLabel;
    final PasswordField passwordField;
    final Button buttonLogin;
    final ImageView imageView;
    final Image image;
    public Alert alert;
    public LoginPage(){
        image = new Image("/images/Login.png");
    imageView = new ImageView(image);
    
    labelUserName = new Label("User name");
    textFiledUserName = new TextField();
    textFiledUserName.setPromptText("User name");
    paLabel = new Label("Password");
    passwordField = new PasswordField();
    passwordField.setPromptText("Password");
    buttonLogin = new Button("Login");
    
    
    buttonLogin.setOnAction(new EventHandler<ActionEvent>() {
          String userName = "Malik";
          String Password = "123";
        @Override
        public void handle(ActionEvent e) {
     
            try {
                if(textFiledUserName.getText().equals(userName)&& passwordField.getText().equals(Password)){
                ViewManager.openSystemPage();
                ViewManager.closeLoginPage();
                alert.setContentText("Registration succeeded");
                alert.showAndWait();
                }else{
                     alert = new Alert(AlertType.CONFIRMATION);
                     alert.setTitle("Confirmation Dialog");
                     alert.setContentText("This data is invalid !?");
                     alert.showAndWait();
                }
               
            }catch (IOException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
    
        buttonLogin.setCursor(Cursor.HAND);
        buttonLogin.getStyleClass().add("btn");
        VBox vBox = new VBox(20, imageView ,labelUserName,textFiledUserName,paLabel,passwordField,buttonLogin);
        vBox.setAlignment(Pos.CENTER);
        FlowPane flowPane = new FlowPane(vBox);
        flowPane.setAlignment(Pos.CENTER);
      Scene scene = new Scene(flowPane ,315, 520);
       scene.getStylesheets().add("/css/StyleLoginPage.css");
      this.setScene(scene);
      this.setTitle("Login Page");
      this.setResizable(false);
      
        this.show();
        
    }
      
}
