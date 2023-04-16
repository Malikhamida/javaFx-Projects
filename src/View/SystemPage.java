/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Malik
 */
public class SystemPage extends Stage{
private Scene SystemPage;
public SystemPage() throws IOException{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("SystemFXML/SystemPage.fxml"));
        AnchorPane root = loader.load();     
        SystemPage = new Scene(root);
        this.setScene(SystemPage);
        this.setResizable(false);
        this.setTitle("Currency Conversion System");
        this.show();
}
  
}
