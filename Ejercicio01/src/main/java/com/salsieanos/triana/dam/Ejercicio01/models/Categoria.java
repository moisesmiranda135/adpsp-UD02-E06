package com.salsieanos.triana.dam.Ejercicio01.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Categoria implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @Builder.Default
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos = new ArrayList<>();

   /*@OneToMany(mappedBy = "categoria")
    private List<Categoria> subcategorias = new ArrayList<>();



    //HELPERS SUBCATEGORIA

    public void addSubCategoria(Categoria c) {
        this.subcategorias = new ArrayList<Categoria>((Collection<? extends Categoria>) c);
        c.getSubcategorias().add(this);
    }

    public void removeSubCategoria(Categoria c) {
        c.getProductos().remove(this);
        this.subcategorias = null;
    }*/

}
