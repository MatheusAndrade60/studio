package com.bodyesthetic.studio.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_atendimento")
public class Atendimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atendimento")
    private Long id_atendimento;

    @Column(nullable = false, length = 100)
    private String cliente;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false, length = 100)
    private String servico;

    @Column(nullable = false)
    private Double preco;

    public Atendimento() {
    }

    public Atendimento(String cliente, LocalDate data, String servico, Double preco) {
        this.cliente = cliente;
        this.data = data;
        this.servico = servico;
        this.preco = preco;
    }

    public Long getIdAtendimento() {
        return id_atendimento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

