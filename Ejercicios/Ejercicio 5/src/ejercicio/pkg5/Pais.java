/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Objects;

/**
 *
 * @author Vanina
 */
public class Pais {
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 59 * hash + Objects.hashCode(this.nombre);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Pais other = (Pais) obj;
//        if (!Objects.equals(this.nombre, other.nombre)) {
//            return false;
//        }
//        return true;
//    }

    
    
    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }
    
    
    
    
}
