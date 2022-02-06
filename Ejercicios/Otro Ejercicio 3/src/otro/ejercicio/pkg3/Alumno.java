/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otro.ejercicio.pkg3;

import java.util.ArrayList;

/**
 *
 * @author Vanina
 */
public class Alumno {
    private String nombre;
//    private ArrayList<Integer> nota = new ArrayList();  
    private ArrayList<Integer> nota;
    

//    public Alumno(String nombre, ArrayList<Integer> nota) {
//        this.nombre = nombre;
//        this.nota = nota;
//    }

    public Alumno() {
        this.nota= new ArrayList(); // instancio acá el array en lugar de instanciarlo en los atributos
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
