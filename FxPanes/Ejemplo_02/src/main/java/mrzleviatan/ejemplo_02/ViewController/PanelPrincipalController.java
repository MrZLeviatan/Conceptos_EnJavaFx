package mrzleviatan.ejemplo_02.ViewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PanelPrincipalController {

    @FXML
    private AnchorPane lienzo;

    @FXML
    void irVentana01(ActionEvent event) throws IOException {

        lienzo.getChildren().clear();
        Parent secondFxml = FXMLLoader.load(getClass().getResource("Vista01.fxml"));
        lienzo.getChildren().setAll(secondFxml);

    }

    @FXML
    void irVentana02(ActionEvent event) throws IOException {

        lienzo.getChildren().clear();
        Parent secondFxml = FXMLLoader.load(getClass().getResource("Vista02.fxml"));
        lienzo.getChildren().setAll(secondFxml);

    }

}