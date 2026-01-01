package com.bodyesthetic.studio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id_atendimento;
    String cliente;
    Date Data;
    String servico;
    double preco;

    public Atendimento() {
    }

    public Atendimento(int id_atendimento, String cliente, Date data, String servico, double preco) {
        Id_atendimento = id_atendimento;
        this.cliente = cliente;
        Data = data;
        this.servico = servico;
        this.preco = preco;
    }

    public int getId_atendimento() {
        return Id_atendimento;
    }

    public void setId_atendimento(int id_atendimento) {
        Id_atendimento = id_atendimento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
