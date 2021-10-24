package com.salsieanos.triana.dam.Ejercicio01;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.salsieanos.triana.dam.Ejercicio01.models.Categoria;
import com.salsieanos.triana.dam.Ejercicio01.models.Producto;
import com.salsieanos.triana.dam.Ejercicio01.services.CategoriaService;
import com.salsieanos.triana.dam.Ejercicio01.services.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@AllArgsConstructor
public class MainPrueba {
    private final CategoriaService categoriaService;
    private final ProductoService productoService;

    @PostConstruct
    public void test() {
        Producto p1 = new Producto("frigorífico", 125.50);
        productoService.save(p1);

        Categoria c1 = Categoria.builder()
                .nombre("Electrodomésticos")
                .build();
        categoriaService.save(c1);

        Categoria c2 = Categoria.builder()
                .nombre("electrónica")
                .build();
        categoriaService.save(c2);

        p1.addCategoria(c1);
        productoService.save(p1);

        //c1.addSubCategoria(c2);


        System.out.printf("%s, %s\n", p1.getNombre(), p1.getCategoria().getNombre());
        //System.out.println("Esta categoria tiene " + c1.getSubcategorias());

        //Tengo código comentado en la entidd categoria y en el main de prueba,
        //porque he intnetado hacer la asociación de categoria padre pero no lo he conseguido :(
    }
}
