package com.bodyesthetic.studio.service;

import com.bodyesthetic.studio.model.Cliente;
import com.bodyesthetic.studio.repository.ClienteRepository;

import java.util.List;

public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
