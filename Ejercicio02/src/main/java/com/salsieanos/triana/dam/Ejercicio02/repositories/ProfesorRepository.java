package com.salsieanos.triana.dam.Ejercicio02.repositories;

import com.salsieanos.triana.dam.Ejercicio02.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository
        extends JpaRepository<Profesor, Long> {
}
