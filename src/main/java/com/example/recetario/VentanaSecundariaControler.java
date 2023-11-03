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
    private TextField cNombre;
    @javafx.fxml.FXML
    private ComboBox cDificultad;
    @javafx.fxml.FXML
    private ComboBox cTipo;
    @javafx.fxml.FXML
    private Spinner spinner2;
    @javafx.fxml.FXML
    private Label infoSecundaria;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        Receta r = Session.getRecetaActual();
        System.out.println(r);
        infoSecundaria.setText(r.toString());


        spinner2.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0,180,60,5));

        cDificultad.getItems().addAll("Fácil","Moderada","Difícil");
        cDificultad.setValue(r.getDificultad());

        cTipo.getItems().addAll("Desayuno","Segundo desayuno","Almuerzo","Sobrealmurezo","Merienda","Cena","Recena","Postcena");
        cTipo.setValue(r.getTipo());

        cNombre.setText(r.getNombre());


    }



    @javafx.fxml.FXML
    public void volver(ActionEvent actionEvent) {
        HelloApplication.loadFMXL("VentanaPrincipal.fxml");
    }
}