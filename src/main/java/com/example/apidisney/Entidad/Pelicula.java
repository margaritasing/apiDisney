package com.example.apidisney.Entidad;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "peliculas")
public class Pelicula {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idpelicula;
   private String imagen;
   private String titulo;
   private String fechadecreacion;
   private String calificacion;

   @OneToMany(mappedBy = "peliculas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   private List<Personaje> personajes;


   @ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   private List<Genero> generos;

   public Pelicula() {
   }

   public Integer getIdpelicula() {
      return idpelicula;
   }

   public void setIdpelicula(Integer idpelicula) {
      this.idpelicula = idpelicula;
   }

   public String getImagen() {
      return imagen;
   }

   public void setImagen(String imagen) {
      this.imagen = imagen;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getFechadecreacion() {
      return fechadecreacion;
   }

   public void setFechadecreacion(String fechadecreacion) {
      this.fechadecreacion = fechadecreacion;
   }

   public String getCalificacion() {
      return calificacion;
   }

   public void setCalificacion(String calificacion) {
      this.calificacion = calificacion;
   }

   public List<Personaje> getPersonajes() {
      return personajes;
   }

   public void setPersonajes(List<Personaje> personajes) {
      this.personajes = personajes;
   }

   public List<Genero> getGeneros() {
      return generos;
   }

   public void setGeneros(List<Genero> generos) {
      this.generos = generos;
   }

   @Override
   public String toString() {
      return "Pelicula{" +
              "idpelicula=" + idpelicula +
              ", imagen='" + imagen + '\'' +
              ", titulo='" + titulo + '\'' +
              ", fechadecreacion='" + fechadecreacion + '\'' +
              ", calificacion='" + calificacion + '\'' +
              ", personajes=" + personajes +
              ", generos=" + generos +
              '}';
   }
}
