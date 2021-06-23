package com.example.apidisney.Servicio;

import com.example.apidisney.Entidad.Pelicula;
import com.example.apidisney.Repositorio.PeliculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {
    public final PeliculaRepo peliculaRepo;

    @Autowired
    public PeliculaService(PeliculaRepo peliculaRepo) {
        this.peliculaRepo = peliculaRepo;
    }

    public List<Pelicula> getPeliculas(){
        return peliculaRepo.findAll();
    }

    public Pelicula save(Pelicula pelicula){
        return peliculaRepo.save(pelicula);
    }

    public void deleteById(Integer id){
        if (!peliculaRepo.existsById(id))
            throw new IllegalStateException("Pelicula no encontrada");
        peliculaRepo.deleteById(id);
    }

    public List<Pelicula> getPeliculaByIdpelicula(String idPelicula){
        Integer id;
        try {
            id = Integer.parseInt(idPelicula);
        }catch (NumberFormatException e){
            id = 0;
        }
        return peliculaRepo.findAllById(List.of(id));
    }

    public List<Pelicula> buscarPorGenero(Integer idpelicula){
        return peliculaRepo.findByGeneros(idpelicula);
    }

    public List<Pelicula> buscarPorTitulo(String titulo){
        return peliculaRepo.findByTitulo(titulo);
    }







}
