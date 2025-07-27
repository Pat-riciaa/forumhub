package com.patricia.forumhub.dto;

import com.patricia.forumhub.model.Curso;
import com.patricia.forumhub.model.Topico;
import com.patricia.forumhub.repository.CursoRepository;
import com.patricia.forumhub.validation.CursoExistente;
import jakarta.validation.constraints.NotBlank;

public class TopicoForm {

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensagem;

    @NotBlank
    @CursoExistente // 👈 Aqui está a anotação personalizada
    private String nomeCurso;

    @NotBlank
    private String autor;

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso)
                .orElseThrow(() -> new IllegalArgumentException("Curso não encontrado: " + nomeCurso));
        return new Topico(titulo, mensagem, autor, curso);
    }

    // Getters e setters
}

