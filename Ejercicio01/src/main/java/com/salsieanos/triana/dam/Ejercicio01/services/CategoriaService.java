package com.salsieanos.triana.dam.Ejercicio01.services;

import com.salsieanos.triana.dam.Ejercicio01.models.Categoria;
import com.salsieanos.triana.dam.Ejercicio01.repositories.CategoriaRepository;
import com.salsieanos.triana.dam.Ejercicio01.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService
        extends BaseService<Categoria, Long, CategoriaRepository> {
}
