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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class ContractController implements Initializable {

    @FXML
    private TableColumn<?, ?> playerContractTableColumn;
    @FXML
    private TableColumn<?, ?> clubContractTableColumn;
    @FXML
    private TableColumn<?, ?> statusContractTableColumn;
    @FXML
    private Label statusContractLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void approveContractButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void rejectContractButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClicked(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
       

        stg.setScene(scene);
        stg.show();
    }
    
}
