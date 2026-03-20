package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.ComboBox;
import java.net.URL;
import java.util.ResourceBundle;

public class OperacionesController implements Initializable {

    @FXML
    private BarChart<?, ?> graficoResolucion;

    @FXML
    private ComboBox<String> filtroComplejidad;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 1. Llenar el ComboBox de filtros
        filtroComplejidad.getItems().addAll("Todas", "Baja", "Media", "Alta");
        filtroComplejidad.getSelectionModel().selectFirst();

        // 2. Llamar a tu DAO para pedir los datos y pintar el gráfico
        cargarGrafico("Todas");
    }

    private void cargarGrafico(String complejidad) {
        // Aquí llamaremos a OperacionesDAO y llenaremos el BarChart
    }
}