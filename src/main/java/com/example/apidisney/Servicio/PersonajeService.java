package com.example.apidisney.Servicio;

import com.example.apidisney.Entidad.Personaje;
import com.example.apidisney.Repositorio.PersonajeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    public final PersonajeRepo personajeRepo;


    @Autowired
    public PersonajeService(PersonajeRepo personajeRepo) {
        this.personajeRepo = personajeRepo;
    }

    public List<Personaje> getPersonaje(){
        return  personajeRepo.findAll();
    }

    public  Personaje guardar(Personaje personaje){
        return personajeRepo.save(personaje);
    }



    public List<Personaje> getPersonajeByIdpersonaje(String idpersonaje){
        Integer id;
        try {
            id = Integer.parseInt(idpersonaje);
        }catch (NumberFormatException e){
            id = 0;
        }
        return personajeRepo.findAllById(List.of(id));
    }


    public void borrar(Integer id){
        if (!personajeRepo.existsById(id))
            throw new IllegalStateException("No se encontro el personaje");
        personajeRepo.deleteById(id);
    }


   public List<Personaje> buscarPorEdad(String edad){
        return personajeRepo.findPersonajeByEdad(edad);
   }

   public List<Personaje> buscarPorPelicula(Integer idpersonaje){
        return personajeRepo.findPersonajeByPeliculas(idpersonaje);
   }

    public List<Personaje> buscarNombre(String nombre) {
        return personajeRepo.findPersonajeByNombre(nombre);
    }

    public List<Personaje> buscarxId (Integer id){
        return personajeRepo.findByIdpersonaje(id);
    }
}
