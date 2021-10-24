package com.salsieanos.triana.dam.Ejercicio02.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Profesor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String email;

    private double puntuacion;

    @Builder.Default
    @OneToMany(mappedBy = "profesor")
    private List<CursoOnline> cursos = new ArrayList<>();
}
