/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Pelicula> peliculas = new ArrayList();
        
        String respuesta = " ";
        
        do {
            Pelicula p1 = new Pelicula();
            
            System.out.println("Ingrese el título de una película");
            p1.setTitulo(sc.next());
            
            System.out.println("Ingrese el director de esa película");
            p1.setDirector(sc.next());
            
            System.out.println("Ingrese la duración en horas de dicha película");
            p1.setDuracion(sc.nextInt());
            
            peliculas.add(p1);
            
            System.out.println("Desea ingresar otra película?");
            respuesta = sc.next();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        //Muestra todas las películas
        for (Pelicula aux : peliculas) { 
            System.out.println(aux);
        }
        
        //Muestra todas las películas con una duración mayor a 1 hora
        System.out.println("--------------------------------------------------");
        System.out.println("Las películas con una duración mayor a 1 hora son:");
        
        
        for (Pelicula mayorUnaHora : peliculas) {
            Pelicula.duracionPeliculas(mayorUnaHora);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Las películas ordenadas de mayor a menor duracion:");
        
        Collections.sort(peliculas, Pelicula.compararDuracionAscendente);
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Las películas ordenadas de menor a mayor duracion:");
        
        Collections.sort(peliculas, Pelicula.compararDuracionDescendente);
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Las películas ordenadas por Título alfabeticamente:");
        
        Collections.sort(peliculas, Pelicula.compararTituloAlfabeticamente);
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Las películas ordenadas por Director alfabeticamente:");
        
        Collections.sort(peliculas, Pelicula.compararDirectorAlfabeticamente);
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
}
