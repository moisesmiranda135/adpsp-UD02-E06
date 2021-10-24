package com.salsieanos.triana.dam.Ejercicio02.repositories;

import com.salsieanos.triana.dam.Ejercicio02.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository
        extends JpaRepository<Video, Long> {
}
