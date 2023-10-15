module mrzleviatan.ejemplo_02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mrzleviatan.ejemplo_02 to javafx.fxml;
    exports mrzleviatan.ejemplo_02;
    exports mrzleviatan.ejemplo_02.ViewController;
    opens mrzleviatan.ejemplo_02.ViewController to javafx.fxml;
}