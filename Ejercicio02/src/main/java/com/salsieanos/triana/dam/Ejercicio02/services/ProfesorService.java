package com.salsieanos.triana.dam.Ejercicio02.services;

import com.salsieanos.triana.dam.Ejercicio02.models.Profesor;
import com.salsieanos.triana.dam.Ejercicio02.repositories.ProfesorRepository;
import com.salsieanos.triana.dam.Ejercicio02.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService
        extends BaseService<Profesor, Long, ProfesorRepository> {
}
