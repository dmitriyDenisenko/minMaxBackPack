package com.example.projectbackpack.controllers;

import com.example.projectbackpack.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button StartButton;

    @FXML
    void initialize() {
        StartButton.setOnAction(event -> {
            StartButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Application.class.getResource("test.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("BackPack");
            stage.setScene(new Scene(root));
            stage.showAndWait();


        });

    }


}