package com.salsieanos.triana.dam.Ejercicio02;

import com.salsieanos.triana.dam.Ejercicio02.models.CursoOnline;
import com.salsieanos.triana.dam.Ejercicio02.models.Profesor;
import com.salsieanos.triana.dam.Ejercicio02.models.Video;
import com.salsieanos.triana.dam.Ejercicio02.services.CursoOnlineService;
import com.salsieanos.triana.dam.Ejercicio02.services.ProfesorService;
import com.salsieanos.triana.dam.Ejercicio02.services.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class MainPrueba {

    private final CursoOnlineService cursoOnlineService;
    private final ProfesorService profesorService;
    private final VideoService videoService;

    @PostConstruct
    public void tests (){
        Profesor p1 = Profesor.builder()
                .nombre("Luis Miguel López Magaña")
                .email("luismi.lopez@salesianos.edu")
                .puntuacion(4.8)
                .build();

        profesorService.save(p1);

        CursoOnline c1 = CursoOnline.builder()
                .nombre("JPA Spring Boot")
                .puntuacion(4.5)
                .build();

        cursoOnlineService.save(c1);
        c1.addProfesor(p1);
        cursoOnlineService.edit(c1);

        Video v1 = Video.builder()
                .orden("1")
                .titulo("Introducción a Spring Boot")
                .descripcion("Introducción a el curso")
                .url("https://www.youtube.com/watch?v=RAycjSAthcY")
                .build();

        videoService.save(v1);

        c1.addVideo(v1);
        cursoOnlineService.edit(c1);


        System.out.println("El curso que hemos añadido se llama " + c1.getNombre() + ", lo imparte Don " + c1.getProfesor().getNombre()
        + "y el video que hemos añadido tiene el siguiente enlace: " + c1.getVideos().get(0).getUrl() );

    }
}
