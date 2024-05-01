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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class TransferController implements Initializable {
    @FXML
    private Label approvalStatusLabel;
    @FXML
    private TableView<?> transferTableView;
    @FXML
    private TableColumn<?, ?> playerTableColumn;
    @FXML
    private TableColumn<?, ?> fromClubTableColumn;
    @FXML
    private TableColumn<?, ?> toClubTableColumn;
    @FXML
    private TableColumn<?, ?> statusTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void approveTransferButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void rejectTransferButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClicked(ActionEvent event) {
    }
    
}
