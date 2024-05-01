/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class FXMLSendNotificationController implements Initializable {

    @FXML
    private ComboBox<String> selectComboBox;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextArea conferenceDetailsTextArea;
    @FXML
    private DatePicker dateDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    selectComboBox.getItems().addAll("Medical", "Player", "Competition", "Financial", "Media", "Coach", "Development" , "Executive"); 
    
    
    java.time.LocalDate selectedDate = dateDatePicker.getValue();
       
        System.out.println("Selected Date: " + selectedDate);
    }    

    @FXML
    private void goBackOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
       

        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void logoutOnClick(ActionEvent event) throws IOException {
         Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLLogout.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void sendOnClick(ActionEvent event) throws IOException {
          Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLSendNotificationNext.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }
    
}
