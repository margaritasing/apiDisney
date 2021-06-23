package com.example.apidisney.Entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "personajes")
public class Personaje {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idpersonaje;
   private String imagen;
   private String nombre;
   private String edad;
   private String peso;
   private String historia;

   @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   private Pelicula peliculas;

   public Personaje() {

   }

   public Integer getIdpersonaje() {
      return idpersonaje;
   }

   public void setIdpersonaje(Integer idpersonaje) {
      this.idpersonaje = idpersonaje;
   }

   public String getImagen() {
      return imagen;
   }

   public void setImagen(String imagen) {
      this.imagen = imagen;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getEdad() {
      return edad;
   }

   public void setEdad(String edad) {
      this.edad = edad;
   }

   public String getPeso() {
      return peso;
   }

   public void setPeso(String peso) {
      this.peso = peso;
   }

   public String getHistoria() {
      return historia;
   }

   public void setHistoria(String historia) {
      this.historia = historia;
   }

   public Pelicula getPeliculas() {
      return peliculas;
   }

   public void setPeliculas(Pelicula peliculas) {
      this.peliculas = peliculas;
   }


}
