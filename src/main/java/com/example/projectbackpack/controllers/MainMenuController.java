package com.example.projectbackpack.controllers;

import com.example.projectbackpack.Item;
import com.example.projectbackpack.MainWorker;
import com.example.projectbackpack.improtExport.Importer;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainMenuController {
    MainWorker mainWorker = new MainWorker();

    @FXML
    private AnchorPane Pane;

    @FXML
    private Button ButtonRemove;


    @FXML
    private TextField ItemName;

    @FXML
    private MenuItem addFiles;

    @FXML
    private Button buttonAdd;

    @FXML
    private Menu helpBar;

    @FXML
    private TextField maxBackPackValue1;

    @FXML
    private TextField maxBackPackWeight;

    @FXML
    private Menu menuBar;

    @FXML
    private CheckBox significanceAnswer;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TextField volume;

    @FXML
    private TextField weight;

    @FXML
    private TableColumn<Item, String> nameColumn;

    @FXML
    private TableColumn<Item, Boolean> significanceColumn;

    @FXML
    private TableColumn<Item, Double> volumeColumn;

    @FXML
    private TableColumn<Item, Double> weightColumn;

    @FXML
    void added(ActionEvent event) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        volumeColumn.setCellValueFactory(new PropertyValueFactory<Item, Double>("volume"));
        weightColumn.setCellValueFactory(new PropertyValueFactory<Item, Double>("weight"));
        significanceColumn.setCellValueFactory(new PropertyValueFactory<Item, Boolean>("significance"));
        Item item = new Item(ItemName.getText(), weight.getText(),
                volume.getText(), significanceAnswer.isSelected());
        ObservableList<Item> items = (ObservableList<Item>) tableView.getItems();
        items.add(item);
        mainWorker.setItemsWeight(Double.parseDouble(weight.getText()));
        mainWorker.setItemsVolume(Double.parseDouble(volume.getText()));
        ItemName.clear();
        weight.clear();
        volume.clear();
        mainWorker.setItems(item);
        if (mainWorker.getMinWeight() < Double.parseDouble(weight.getText())) {
            mainWorker.setWeight(Double.parseDouble(weight.getText()));
        }
    }

    @FXML
    void remove(ActionEvent event) {
        int selectedId = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);

    }


    @FXML
    void GenerateAnswer(ActionEvent event) {
        mainWorker.setBackPack(Integer.parseInt(maxBackPackWeight.getText()));
        mainWorker.generateAnswer();
    }

    @FXML
    void initialize() {
        /*
        addFiles.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter xlsxFilter = new FileChooser.ExtensionFilter("xlsx files", "*.xlsx");
            fileChooser.getExtensionFilters().add(xlsxFilter);
            fileChooser.setTitle("Open");
            Stage stage = (Stage) Pane.getScene().getWindow();

            File file = fileChooser.showOpenDialog(stage);
        });

         */

}
}

