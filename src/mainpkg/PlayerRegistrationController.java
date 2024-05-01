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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class PlayerRegistrationController implements Initializable {

    @FXML
    private TextField playerNameTextField;
    @FXML
    private TextField playerIDTextField;
    @FXML
    private TextField playerAgeTextField;
    @FXML
    private TextField playerContactTextField;
    @FXML
    private TextField playerAddressTextField;
    @FXML
    private TextField playerBloodGroupTextField;
    @FXML
    private TableView<Player> playerRegistrationTableView;
    @FXML
    private TableColumn<Player, String> playerNameTableColumn;
    @FXML
    private TableColumn<Player, String> playerIDTableColumn;
    @FXML
    private TableColumn<Player, String> playerAgeTableColumn;
    @FXML
    private TableColumn<Player, String> playerContactTableColumn;
    @FXML
    private TableColumn<Player, String> playerAddressTableColumn;
    @FXML
    private TableColumn<Player, String> playerBloodGroupTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       playerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerName"));
       playerIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerId"));
       playerAgeTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerAge"));
       playerContactTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerContact"));
       playerAddressTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerAddress"));
       playerBloodGroupTableColumn.setCellValueFactory(new PropertyValueFactory<>("playerBloodGroup"));
    }    

    @FXML
    private void addPlayerButtonOnClicked(ActionEvent event) {

    }
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
