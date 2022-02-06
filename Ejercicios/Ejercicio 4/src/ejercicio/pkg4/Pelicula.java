/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Comparator;

/**
 *
 * @author Vanina
 */
public class Pelicula {

    public String titulo;
    public String director;
    public Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    public static void duracionPeliculas(Pelicula p1){        
        if (p1.getDuracion() > 1) {
            System.out.println(p1);
        }
}

    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e2, Pelicula e1) { // Le pasamos dos objetos a comparar
            return e1.getDuracion().compareTo(e2.getDuracion()); // Los comparamos usando el get y el compareTo
        }
    };    
    
    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e2, Pelicula e1) { // Le pasamos dos objetos a comparar
            return e2.getDuracion().compareTo(e1.getDuracion()); // Los comparamos usando el get y el compareTo
        }
    };
    
    public static Comparator<Pelicula> compararTituloAlfabeticamente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e2, Pelicula e1) { // Le pasamos dos objetos a comparar
            return e2.getTitulo().compareTo(e1.getTitulo()); // Los comparamos usando el get y el compareTo
        }
    };
    
    public static Comparator<Pelicula> compararDirectorAlfabeticamente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e2, Pelicula e1) { // Le pasamos dos objetos a comparar
            return e2.getDirector().compareTo(e1.getDirector()); // Los comparamos usando el get y el compareTo
        }
    };
}
