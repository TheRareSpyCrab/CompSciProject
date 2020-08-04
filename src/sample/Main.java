package sample;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Stack;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ACNH-Helper");
        primaryStage.setScene(new Scene(root, 1920, 1056));
        // to stop resizing otherwise all the pictures mess up O.o
        primaryStage.setResizable(false);
        primaryStage.show();








    }



}
