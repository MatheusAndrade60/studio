package com.bodyesthetic.studio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(unique = true)
    private String login;

    private String senha;
}