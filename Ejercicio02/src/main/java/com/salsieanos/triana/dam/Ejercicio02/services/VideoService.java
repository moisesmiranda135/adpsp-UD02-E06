package com.salsieanos.triana.dam.Ejercicio02.services;


import com.salsieanos.triana.dam.Ejercicio02.models.Video;
import com.salsieanos.triana.dam.Ejercicio02.repositories.VideoRepository;
import com.salsieanos.triana.dam.Ejercicio02.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class VideoService
        extends BaseService<Video, Long, VideoRepository> {
}
