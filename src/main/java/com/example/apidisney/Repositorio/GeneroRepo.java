package com.example.apidisney.Repositorio;

import com.example.apidisney.Entidad.Genero;
import com.example.apidisney.Entidad.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepo extends JpaRepository<Genero, Integer> {

    public List<Genero> findByNombreContaining(String nombre);

    public  List<Genero> findByPeliculas(Integer idpelicula);
}
