package com.bodyesthetic.studio.ui.controller;

import com.bodyesthetic.studio.model.Atendimento;
import com.bodyesthetic.studio.service.AtendimentoService;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class AtendimentoController {

    private final AtendimentoService service;

    public AtendimentoController(AtendimentoService service) {
        this.service = service;
    }

    @FXML
    private TableView<AtendimentoController> tabela;

    @FXML
    public void initialize() {
        tabela.getItems().setAll(service.listar());
    }

    @FXML
    public void salvar() {
        service.salvar(new Atendimento());
    }
}
