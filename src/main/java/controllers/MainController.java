package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class MainController {

    @FXML
    private StackPane areaContenido; // El lienzo en blanco del centro

    // Método genérico para cambiar la vista
    private void cargarVista(String archivoFxml) {
        try {
            // Carga el FXML que hizo tu compañero
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/" + archivoFxml));
            Node vista = loader.load();

            // Limpia el área central y pone la nueva vista
            areaContenido.getChildren().clear();
            areaContenido.getChildren().add(vista);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Eventos de los botones del menú lateral
    @FXML
    void mostrarFinanzas(ActionEvent event) {
        cargarVista("DashboardFinanzas.fxml");
    }

    @FXML
    void mostrarOperaciones(ActionEvent event) {
        cargarVista("DashboardOperaciones.fxml");
    }
}