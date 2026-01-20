package com.bodyesthetic.studio.service;

import com.bodyesthetic.studio.model.Servicos;
import com.bodyesthetic.studio.repository.ServicosRepository;
import java.util.List;

public class ServicosService {

    private final ServicosRepository repository;

    public ServicosService(ServicosRepository repository) {
        this.repository = repository;
    }

    public List<Servicos> listarTodos() {
        return repository.findAll();
    }

    public Servicos salvar(Servicos Servicos) {
        return repository.save(Servicos);
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
