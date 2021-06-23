package com.example.apidisney.Servicio;

import com.example.apidisney.Entidad.Genero;
import com.example.apidisney.Repositorio.GeneroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    public final GeneroRepo generoRepo;

    @Autowired
    public GeneroService(GeneroRepo generoRepo) {
        this.generoRepo = generoRepo;
    }

    public List<Genero> buscarPorPelicula(Integer idpelicula){
        return  generoRepo.findByPeliculas(idpelicula);
    }

    public List<Genero> buscarPorNombre(String nombre){
        return generoRepo.findByNombreContaining(nombre);
    }

}
