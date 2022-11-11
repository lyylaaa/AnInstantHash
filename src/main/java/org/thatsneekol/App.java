package org.thatsneekol;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.IOException;
import java.util.Objects;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    double x, y = 0;



    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/primary.fxml")));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("AnInstantHash");
        primaryStage.setFullScreenExitHint("Premi ESC per uscire dalla modalità a tutto schermo");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();


        root.setOnMousePressed( event -> {

            x = event.getSceneX();
            y = event.getSceneY();

        });

        root.setOnMouseDragged( event ->{
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        });

    }
/*
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
*/


    public static void main (String[]args){
        launch();
    }
}