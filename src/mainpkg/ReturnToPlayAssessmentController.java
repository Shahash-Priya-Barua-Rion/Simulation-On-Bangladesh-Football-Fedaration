/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class ReturnToPlayAssessmentController implements Initializable {

    @FXML
    private TextField requestTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField injuryDetailsTextField;
    @FXML
    private TextArea assessmentResultTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void assessButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClicked(ActionEvent event) {
    }
    
}
