package com.example.apidisney.Repositorio;

import com.example.apidisney.Entidad.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepo extends JpaRepository<Pelicula, Integer> {

    List<Pelicula> findByTitulo(String titulo);

    List<Pelicula> findByGeneros(Integer idpelicula);




}
