package com.salsieanos.triana.dam.Ejercicio02.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CursoOnline implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor_id", foreignKey = @ForeignKey(name = "FK_CURSOONLINE_PROFESOR"))
    private Profesor profesor;

    @Builder.Default
    @OneToMany(mappedBy="cursoOnline", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();


    //HELPERS PROFESOR

    public void addProfesor(Profesor p) {
        this.profesor = p;
        p.getCursos().add(this);
    }

    public void removeProfesor(Profesor p) {
        p.getCursos().remove(this);
        this.profesor = null;
    }


    //HELPERS VIDEO

    public void addVideo(Video v) {
        v.setCursoOnline(this);
        this.videos.add(v);
    }


    public void removeVideo(Video v) {
        this.videos.remove(v);
        v.setCursoOnline(null);
    }


}