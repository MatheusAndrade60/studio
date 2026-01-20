package com.bodyesthetic.studio.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField loginField;

    @FXML
    private PasswordField senhaField;

    @FXML
    public void entrar() {
        if (loginService.autenticar(login, senha)) {
            abrirTelaPrincipal();
        } else {
            mostrarErro();
        }
    }
}
