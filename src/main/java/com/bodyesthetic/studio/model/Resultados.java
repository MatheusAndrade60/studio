package com.bodyesthetic.studio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    double Total_bruto;
    int N_agendamentos;
    int Novos_clientes;

    public Resultados() {
    }

    public Resultados(double total_bruto, int n_agendamentos, int novos_clientes) {
        Total_bruto = total_bruto;
        N_agendamentos = n_agendamentos;
        Novos_clientes = novos_clientes;
    }

    public double getTotal_bruto() {
        return Total_bruto;
    }

    public void setTotal_bruto(double total_bruto) {
        Total_bruto = total_bruto;
    }

    public int getN_agendamentos() {
        return N_agendamentos;
    }

    public void setN_agendamentos(int n_agendamentos) {
        N_agendamentos = n_agendamentos;
    }

    public int getNovos_clientes() {
        return Novos_clientes;
    }

    public void setNovos_clientes(int novos_clientes) {
        Novos_clientes = novos_clientes;
    }
}
