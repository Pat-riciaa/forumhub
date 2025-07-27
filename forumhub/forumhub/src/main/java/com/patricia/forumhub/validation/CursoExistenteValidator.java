package com.patricia.forumhub.validation;

import com.patricia.forumhub.repository.CursoRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CursoExistenteValidator implements ConstraintValidator<CursoExistente, String> {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public boolean isValid(String nomeCurso, ConstraintValidatorContext context) {
        if (nomeCurso == null || nomeCurso.isBlank()) {
            return false;
        }
        return cursoRepository.findByNome(nomeCurso).isPresent();
    }
}
