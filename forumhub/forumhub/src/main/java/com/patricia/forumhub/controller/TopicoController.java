package com.patricia.forumhub.controller;

import com.patricia.forumhub.model.Topico;
import com.patricia.forumhub.repository.TopicoRepository;
import com.patricia.forumhub.repository.CursoRepository;
import com.patricia.forumhub.dto.TopicoForm;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoRepository repository;
    private final CursoRepository cursoRepository;

    // 👉 Construtor com os dois repositórios
    public TopicoController(TopicoRepository repository, CursoRepository cursoRepository) {
        this.repository = repository;
        this.cursoRepository = cursoRepository;
    }

    @GetMapping
    public List<Topico> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Topico> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
        Topico topico = form.converter(cursoRepository);
        repository.save(topico);

        var uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(topico);
    }
}
