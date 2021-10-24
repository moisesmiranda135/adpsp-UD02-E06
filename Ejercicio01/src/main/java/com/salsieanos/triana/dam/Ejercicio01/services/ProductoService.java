package com.salsieanos.triana.dam.Ejercicio01.services;

import com.salsieanos.triana.dam.Ejercicio01.models.Producto;
import com.salsieanos.triana.dam.Ejercicio01.repositories.ProductoRepository;
import com.salsieanos.triana.dam.Ejercicio01.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService
        extends BaseService<Producto, Long, ProductoRepository> {
}
