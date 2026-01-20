package com.bodyesthetic.studio.ui.controller;

import com.bodyesthetic.studio.model.Servicos;
import com.bodyesthetic.studio.service.ServicosService;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import org.springframework.stereotype.Component;

@Component
public class ServicosController {

    private final ServicosService service;

    public ServicosController(ServicosService service) {
        this.service = service;
    }

    @FXML
    private TableView<Servicos> tabela;

    @FXML
    public void initialize() {
        tabela.getItems().setAll(service.listar());
    }

    @FXML
    public void salvar() {
        service.salvar(new Servico("Exemplo", "Serviço Teste", 100.0));
        tabela.getItems().setAll(service.listar());
    }
}
