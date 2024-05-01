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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class MedicalNewPlayerRegistrationController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField contactTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField bloodGroupTextField;
    @FXML
    private TextField heightTextField;
    @FXML
    private TextField weightTextField;
    @FXML
    private TableView<?> medicalPlayerRegistrationTableView;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> idTableColumn;
    @FXML
    private TableColumn<?, ?> ageTableColumn;
    @FXML
    private TableColumn<?, ?> contactTableColumn;
    @FXML
    private TableColumn<?, ?> addressTableColumn;
    @FXML
    private TableColumn<?, ?> bloodGroupTableColumn;
    @FXML
    private TableColumn<?, ?> heightTableColumn;
    @FXML
    private TableColumn<?, ?> weightTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registerPlayerInfoButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClicked(ActionEvent event) {
    }
    
}
