package com.bodyesthetic.studio.ui.controller;

import com.bodyesthetic.studio.model.Cliente;
import com.bodyesthetic.studio.service.ClienteService;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import org.springframework.stereotype.Component;

@Component
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @FXML
    private TableView<ClienteController> tabela;

    @FXML
    public void initialize() {
        tabela.getItems().setAll(service.listar());
    }

    @FXML
    public void salvar() {
        service.salvar(new Cliente());
    }
}