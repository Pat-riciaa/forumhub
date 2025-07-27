package com.patricia.forumhub.repository;

import com.patricia.forumhub.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    // Método para buscar curso pelo nome
    Optional<Curso> findByNome(String nome);

}
