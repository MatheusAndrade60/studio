package com.bodyesthetic.studio.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_resultados")
public class Resultados implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resultados")
    private Long id_resultados;

    @Column(name = "total_bruto", nullable = false)
    private Double totalBruto;

    @Column(name = "n_agendamentos", nullable = false)
    private Integer numeroAgendamentos;

    @Column(name = "novos_clientes", nullable = false)
    private Integer novosClientes;

    public Resultados() {
    }

    public Resultados(Double totalBruto, Integer numeroAgendamentos, Integer novosClientes) {
        this.totalBruto = totalBruto;
        this.numeroAgendamentos = numeroAgendamentos;
        this.novosClientes = novosClientes;
    }

    public Long getId_resultados() {
        return id_resultados;
    }

    public Double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(Double totalBruto) {
        this.totalBruto = totalBruto;
    }

    public Integer getNumeroAgendamentos() {
        return numeroAgendamentos;
    }

    public void setNumeroAgendamentos(Integer numeroAgendamentos) {
        this.numeroAgendamentos = numeroAgendamentos;
    }

    public Integer getNovosClientes() {
        return novosClientes;
    }

    public void setNovosClientes(Integer novosClientes) {
        this.novosClientes = novosClientes;
    }
}