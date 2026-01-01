package com.bodyesthetic.studio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id_servicos;
    String Tipo_servico;
    String Nome_servico;
    double preco;

    public Servicos() {
    }

    public Servicos(int id_servicos, String tipo_servico, String nome_servico, double preco) {
        Id_servicos = id_servicos;
        Tipo_servico = tipo_servico;
        Nome_servico = nome_servico;
        this.preco = preco;
    }

    public int getId_servicos() {
        return Id_servicos;
    }

    public void setId_servicos(int id_servicos) {
        Id_servicos = id_servicos;
    }

    public String getTipo_servico() {
        return Tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        Tipo_servico = tipo_servico;
    }

    public String getNome_servico() {
        return Nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        Nome_servico = nome_servico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
