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
public class OtroEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
        
        ServicioAlumno.crear(alumnos);
        ServicioAlumno.mostrar(alumnos);
        ServicioAlumno.notaFinal(alumnos);
    }
    
}
