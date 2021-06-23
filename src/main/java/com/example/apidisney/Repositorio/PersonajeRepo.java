package com.example.apidisney.Repositorio;

import com.example.apidisney.Entidad.Pelicula;
import com.example.apidisney.Entidad.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface PersonajeRepo extends JpaRepository<Personaje, Integer> {


    List<Personaje> findByIdpersonaje(Integer idpersonaje);

    List<Personaje> findPersonajeByNombre(String nombre);

    List<Personaje> findPersonajeByEdad(String edad);

    List<Personaje> findPersonajeByPeliculas(Integer idpersonaje);





}
