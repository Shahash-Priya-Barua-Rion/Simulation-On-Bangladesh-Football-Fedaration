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
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class InventoryManagementController implements Initializable {

    @FXML
    private TableView<?> suppliesTableView;
    @FXML
    private TableColumn<?, ?> itemNameTableColumn;
    @FXML
    private TableColumn<?, ?> quantityTableColumn;
    @FXML
    private TableColumn<?, ?> availabilityTableColumn;
    @FXML
    private TextField requestTextField;
    @FXML
    private TextField itemNameTextField;
    @FXML
    private Spinner<?> quantitySpinner;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void requestSuppliesButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClicked(ActionEvent event) {
    }
    
}
