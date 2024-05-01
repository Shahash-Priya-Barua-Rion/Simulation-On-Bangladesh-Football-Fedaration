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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class FXMLPlayerListController implements Initializable {

    @FXML
    private TableView<?> playerListTableView;
    @FXML
    private TableColumn<?, ?> playerNameTableView;
    @FXML
    private TableColumn<?, ?> playerIdTableView;
    @FXML
    private TableColumn<?, ?> remarkTableView;
    @FXML
    private TableColumn<?, ?> performanceTableView;
    @FXML
    private TableColumn<?, ?> substituteTableView;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg1 = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg1); //to make mutually exclusive radio buttons
        femaleRadioButton.setToggleGroup(tg1);
        
    }    

    @FXML
    private void editOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLPlayerListEdit.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
       

        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void logOutOnClick(ActionEvent event) throws IOException {
        
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLogOutScene.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }
    
}
