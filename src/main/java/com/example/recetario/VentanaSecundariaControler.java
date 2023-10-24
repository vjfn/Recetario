package com.example.recetario;

import com.example.recetario.models.Receta;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.SystemColor.info;

public class VentanaSecundariaControler implements Initializable{

    @javafx.fxml.FXML
    private Button btnVolver;
    @javafx.fxml.FXML
    private Label info;
    @javafx.fxml.FXML
    private Spinner<Double> spinner;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Receta r = Session.getRecetaActual();
        info.setText(r.toString());

        spinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0,10,5,0.25));
    }



    @javafx.fxml.FXML
    public void volver(ActionEvent actionEvent) {
        HelloApplication.loadFMXL("VentanaPrincipal.fxml");
    }
}