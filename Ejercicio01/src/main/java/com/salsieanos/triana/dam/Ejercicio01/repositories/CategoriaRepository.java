package com.salsieanos.triana.dam.Ejercicio01.repositories;

import com.salsieanos.triana.dam.Ejercicio01.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository
            extends JpaRepository<Categoria,Long> {
}
