package com.bodyesthetic.studio.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id_cliente;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    public Cliente() {
    }

    public Cliente(Long id_cliente, String nome, Integer idade) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

