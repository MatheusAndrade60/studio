package com.bodyesthetic.studio.ui.controller;

import com.bodyesthetic.studio.model.Resultados;
import com.bodyesthetic.studio.service.ResultadosService;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ResultadosController {

    private final ResultadosService service;

    public ResultadosController(ResultadosService service) {
        this.service = service;
    }

    @FXML
    private TableView<ResultadosController> tabela;

    @FXML
    public void salvar() {
        service.salvar(new Resultados());
    }
}
