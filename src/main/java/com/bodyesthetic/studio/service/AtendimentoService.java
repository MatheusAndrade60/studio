package com.bodyesthetic.studio.service;

import com.bodyesthetic.studio.model.Atendimento;
import com.bodyesthetic.studio.repository.AtendimentoRepository;

import java.util.List;

public class AtendimentoService {

    private final AtendimentoRepository repository;

    public AtendimentoService(AtendimentoRepository repository) {
        this.repository = repository;
    }

    public List<Atendimento> listarTodos() {
        return repository.findAll();
    }

    public Atendimento salvar(Atendimento Atendimento) {
        return repository.save(Atendimento);
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
