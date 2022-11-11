package org.thatsneekol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {

    public Button bt_Hash;
    public Button bt_Def;
    public AnchorPane visualizza;

    @FXML
    private StackPane contentArea;
    @FXML
    Button minimizeButton = new Button();
    @FXML
    Stage stage;
    @FXML // fx:id="bt_def"
    private JFXButton bt_def; // Value injected by FXMLLoader

    @FXML // fx:id="bt_home"
    private JFXButton bt_home; // Value injected by FXMLLoader

    @FXML // fx:id="bt_def"
    private JFXButton bt_hash; // Value injected by FXMLLoader

    @FXML // fx:id="bt_home"
    private JFXButton bt_compare; // Value injected by FXMLLoader

    @FXML // fx:id="pane_defi"
    private Pane pane_defi; // Value injected by FXMLLoader

    @FXML // fx:id="pane_home"
    private Pane pane_home; // Value injected by FXMLLoader

    @FXML
    private Pane pane_hashAfile;

    @FXML
    private Pane pane_compareHashes;

    @FXML
    void onClickHome(ActionEvent event) {
        pane_home.setVisible(true);
        pane_defi.setVisible(false);
        pane_compareHashes.setVisible(false);
        pane_hashAfile.setVisible(false);
    }
    @FXML
    void onClickDef(ActionEvent event) {
        pane_home.setVisible(false);
        pane_defi.setVisible(true);
        pane_compareHashes.setVisible(false);
        pane_hashAfile.setVisible(false);
    }

    @FXML
    void onClickHash(ActionEvent event) {
        pane_home.setVisible(false);
        pane_defi.setVisible(false);
        pane_compareHashes.setVisible(false);
        pane_hashAfile.setVisible(true);
    }

    @FXML
    void onClickCompare(ActionEvent event) {
        pane_home.setVisible(false);
        pane_defi.setVisible(false);
        pane_compareHashes.setVisible(true);
        pane_hashAfile.setVisible(false);
    }




    @FXML
    //FIXA
    private void handleButtonAction(ActionEvent event){
            stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
            stage.close();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pane_home.setVisible(true);
        pane_defi.setVisible(false);
        pane_compareHashes.setVisible(false);
        pane_hashAfile.setVisible(false);

    }

}
