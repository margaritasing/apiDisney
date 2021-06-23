package com.example.apidisney.Controlador;

import com.example.apidisney.Entidad.Personaje;
import com.example.apidisney.Servicio.PeliculaService;
import com.example.apidisney.Servicio.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

    private final PersonajeService personajeService;
    private final PeliculaService peliculaService;



    @Autowired
    public PersonajeController(PersonajeService personajeService, PeliculaService peliculaService) {
        this.personajeService = personajeService;
        this.peliculaService = peliculaService;
    }

    @PostMapping("/guardar")
    public Personaje crear(@RequestBody Personaje personaje){
        personajeService.guardar(personaje);
        return personaje;
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Integer id){
        personajeService.borrar(id);
    }


    @GetMapping("/personajes")
    public List<Personaje> verTodos(){
        return personajeService.getPersonaje();
    }

    @GetMapping("buscar/name/{nombre}")
    public List<Personaje> buscarPorNombre(@PathVariable String nombre){
        return personajeService.buscarNombre(nombre);
    }

    @GetMapping("/buscar/id/{id}")
    public List<Personaje> buscarxId(@PathVariable Integer id){
        return personajeService.buscarxId(id);
    }



    @GetMapping("buscar/age/{edad}")
    public List<Personaje> buscarPorEdades(@PathVariable String edad){
        return personajeService.buscarPorEdad(edad);
    }

    @GetMapping("buscar/idmovie/{idpelicula}")
    public List<Personaje> buscarXPelicula(@PathVariable Integer idpelicula){
        return personajeService.buscarPorPelicula(idpelicula);
    }




}
