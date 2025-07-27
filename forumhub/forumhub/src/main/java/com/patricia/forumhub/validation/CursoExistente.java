package com.patricia.forumhub.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CursoExistenteValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CursoExistente {
    String message() default "Curso não encontrado";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
