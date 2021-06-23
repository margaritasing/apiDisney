package com.example.apidisney.Entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "generos")
public class Genero {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idgenero;
    private String nombre;
    private String imagen;

    @ManyToMany(mappedBy = "generos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pelicula> peliculas;

    public Genero() {
    }


    public Integer getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Integer idgenero) {
        this.idgenero = idgenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "idgenero=" + idgenero +
                ", nombre='" + nombre + '\'' +
                ", imagen='" + imagen + '\'' +
                ", peliculas=" + peliculas +
                '}';
    }
}
