module com.example.recetario {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.desktop;
    requires javafx.media;


    opens audio;
    opens img;
    opens com.example.recetario to javafx.fxml;
    exports com.example.recetario;
}