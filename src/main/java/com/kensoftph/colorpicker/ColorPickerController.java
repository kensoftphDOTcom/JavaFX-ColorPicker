package com.kensoftph.colorpicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;


public class ColorPickerController {
    @FXML
    private StackPane layout;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    void colorPicker(ActionEvent event){
        layout.setBackground(new Background(new BackgroundFill(colorPicker.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
    }
}