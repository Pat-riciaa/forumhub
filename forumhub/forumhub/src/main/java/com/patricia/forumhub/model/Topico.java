package com.patricia.forumhub.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private StatusTopico status = StatusTopico.NAO_RESPONDIDO;

    private String autor;

    @ManyToOne
    private Curso curso;

    // Construtores
    public Topico() {}

    public Topico(String titulo, String mensagem, String autor, Curso curso) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.autor = autor;
        this.curso = curso;
    }

    // 👇 Adicione este getter aqui:
    public Long getId() {
        return id;
    }

    // (Aqui viriam outros getters e setters, se ainda não tiver feito todos)
}



