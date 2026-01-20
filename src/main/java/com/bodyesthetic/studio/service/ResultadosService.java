package com.bodyesthetic.studio.service;

import com.bodyesthetic.studio.model.Resultados;
import com.bodyesthetic.studio.repository.ResultadosRepository;

import java.util.List;

public class ResultadosService {

    private final ResultadosRepository repository;

    public ResultadosService(ResultadosRepository repository) {
        this.repository = repository;
    }

    public List<Resultados> listarTodos() {
        return repository.findAll();
    }

    public Resultados salvar(Resultados Resultados) {
        return repository.save(Resultados);
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
