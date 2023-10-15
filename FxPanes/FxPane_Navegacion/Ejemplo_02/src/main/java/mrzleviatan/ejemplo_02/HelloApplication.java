package mrzleviatan.ejemplo_02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PanelPrincipal.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle("Ejemplo 02");
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("/Images/Logo.jpg")));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}