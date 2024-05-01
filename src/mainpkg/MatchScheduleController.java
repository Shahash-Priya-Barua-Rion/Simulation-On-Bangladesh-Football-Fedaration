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
public class MatchScheduleController implements Initializable {

    @FXML
    private TextField matchDateTextField;
    @FXML
    private TextField matchTimeTextField;
    @FXML
    private TextField matchLocationTextField;
    @FXML
    private TextField opponentNameTextField;
    @FXML
    private TableView<?> matchScheduleTableView;
    @FXML
    private TableColumn<?, ?> dateTableColumn;
    @FXML
    private TableColumn<?, ?> timeTableColumn;
    @FXML
    private TableColumn<?, ?> locationTableColumn;
    @FXML
    private TableColumn<?, ?> opponentTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addMatchScheduleButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClicked(ActionEvent event) {
    }
    
}
