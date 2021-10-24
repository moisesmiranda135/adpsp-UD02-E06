package com.salsieanos.triana.dam.Ejercicio02.services;

import com.salsieanos.triana.dam.Ejercicio02.models.CursoOnline;
import com.salsieanos.triana.dam.Ejercicio02.repositories.CursoOnlineReposiory;
import com.salsieanos.triana.dam.Ejercicio02.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CursoOnlineService
        extends BaseService<CursoOnline, Long, CursoOnlineReposiory> {
}
