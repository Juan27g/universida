package co.edu.uniquindio.poo.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class cuentaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField apellidosTitular;

    @FXML
    private Button botonCrearCuenta;

    @FXML
    private TextField nombresTitular;

    @FXML
    private TextField numeroCuenta;

    @FXML
    private TextField saldo;

    @FXML
    private CheckBox tipoAhorros;

    @FXML
    private CheckBox tipoCorriente;

    @FXML
    void crearCuenta(ActionEvent event) {
        System.out.println("La cuenta ha sido creada.");

    }
    @FXML
    private void tipoUnicoCuenta() {
        if (tipoAhorros.isSelected()) {
            tipoCorriente.setSelected(false);
        } else if (tipoCorriente.isSelected()) {
            tipoAhorros.setSelected(false);
        }
    }

    @FXML
    void initialize() {
        assert apellidosTitular != null : "fx:id=\"apellidosTitular\" was not injected: check your FXML file 'CrearCuenta.fxml'.";
        assert botonCrearCuenta != null : "fx:id=\"botonCrearCuenta\" was not injected: check your FXML file 'CrearCuenta.fxml'.";
        assert nombresTitular != null : "fx:id=\"nombresTitular\" was not injected: check your FXML file 'CrearCuenta.fxml'.";
        assert numeroCuenta != null : "fx:id=\"numeroCuenta\" was not injected: check your FXML file 'CrearCuenta.fxml'.";
        assert saldo != null : "fx:id=\"saldo\" was not injected: check your FXML file 'CrearCuenta.fxml'.";
        assert tipoAhorros != null : "fx:id=\"tipoAhorros\" was not injected: check your FXML file 'CrearCuenta.fxml'.";
        assert tipoCorriente != null : "fx:id=\"tipoCorriente\" was not injected: check your FXML file 'CrearCuenta.fxml'.";

    }

}