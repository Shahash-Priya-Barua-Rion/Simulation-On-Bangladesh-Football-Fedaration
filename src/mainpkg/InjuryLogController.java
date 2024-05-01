/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class InjuryLogController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField injuryTypeTextField;
    @FXML
    private TextField injuryLocationTextField;
    @FXML
    private Label confirmationLabel;
    @FXML
    private TableView<InjuryLogEntry> injuryLogTableView;
    @FXML
    private TableColumn<InjuryLogEntry, String> nameTableColumn;
    @FXML
    private TableColumn<InjuryLogEntry, String> idTableColumn;
    @FXML
    private TableColumn<InjuryLogEntry, String> injuryTypeTableColumn;
    @FXML
    private TableColumn<InjuryLogEntry, String> injuryLocationTableColumn;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
         nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerName"));
         idTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerId"));
         injuryTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("injuryType"));
         injuryLocationTableColumn.setCellValueFactory(new PropertyValueFactory<>("injuryLocation"));
         
    }    

    private void recordInjuryLogButtonOnClicked(ActionEvent event) {
        String playerName = nameTextField.getText();
        String playerId = idTextField.getText();
        String injuryType = injuryTypeTextField.getText();
        String injuryLocation = injuryLocationTextField.getText();
        

        InjuryLogEntry newInjuryLog = new InjuryLogEntry(playerName, playerId,injuryType,injuryLocation);
        InjuryLogEntry.getItems().add(newInjuryLog);

        // Clear input fields
        nameTextField.clear();
        idTextField.clear();
        injuryTypeTextField.clear();
        injuryLocationTextField.clear();
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