package com.example.projectbackpack.controllers;

import com.example.projectbackpack.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController {

    private int indexPane = 3;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button GenetarateAnswerButton;

    @FXML
    private ColumnConstraints girdPane;

    @FXML
    private GridPane girdllPane;

    @FXML
    private TextField maxBackPackValue;

    @FXML
    private TextField maxBackPackValue1;

    @FXML
    private Menu menuButton;

    @FXML
    private ImageView minusButton;

    @FXML
    private Text name;

    @FXML
    private ImageView plusButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private MenuItem soloAdding;

    @FXML
    private MenuBar soloButtonAdding;

    @FXML
    private MenuItem soloRemove;



    @FXML
    void initialize() {
        plusButton.setOnMouseClicked(event -> {
            for(int i = 0; i < 5; i ++) {
                TextField textField = new TextField();
                textField.setStyle("-fx-background-color: 1");
                if(i != 0){
                    textField.setAlignment(Pos.CENTER);
                }
                girdllPane.add(textField, i, indexPane);
            }
            indexPane++;
        });
        minusButton.setOnMouseClicked(event -> {
        });
    }


}
