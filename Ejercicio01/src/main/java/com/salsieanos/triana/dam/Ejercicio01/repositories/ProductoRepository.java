package com.salsieanos.triana.dam.Ejercicio01.repositories;

import com.salsieanos.triana.dam.Ejercicio01.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
        extends JpaRepository<Producto, Long> {
}
