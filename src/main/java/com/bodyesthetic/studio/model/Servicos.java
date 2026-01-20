package com.bodyesthetic.studio.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_servicos")
public class Servicos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servico")
    private Long id_servico;

    @Column(name = "tipo_servico", nullable = false, length = 100)
    private String tipoServico;

    @Column(name = "nome_servico", nullable = false, length = 100)
    private String nomeServico;

    @Column(nullable = false)
    private Double preco;

    public Servicos() {
    }

    public Servicos(String tipoServico, String nomeServico, Double preco) {
        this.tipoServico = tipoServico;
        this.nomeServico = nomeServico;
        this.preco = preco;
    }

    public Long getId_servico() {
        return id_servico;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}