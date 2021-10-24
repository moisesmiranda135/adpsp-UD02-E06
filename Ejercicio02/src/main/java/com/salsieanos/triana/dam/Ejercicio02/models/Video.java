package com.salsieanos.triana.dam.Ejercicio02.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Video implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String orden;

    private String titulo;

    @Lob
    private String descripcion;

    private String url;

    @ManyToOne
    @JoinColumn(name = "cursoOnline_id", foreignKey = @ForeignKey(name = "FK_VIDEO_CURSOONLINE"))
    private CursoOnline cursoOnline;


}