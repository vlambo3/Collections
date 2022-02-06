/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Alumno> alumnos = new ArrayList();
        
        String respuesta = "";
        
        do {
            Alumno a1 = new Alumno();
            
            System.out.println("Ingrese el nombre del estudiante");
            String nombre = sc.next();

            System.out.println("Ingrese la nota 1");
            int nota1 = sc.nextInt();

            System.out.println("Ingrese la nota 2");
            int nota2 = sc.nextInt();
            
            System.out.println("Ingrese la nota 3");
            int nota3 = sc.nextInt();
            
            a1.setNombre(nombre); 
            a1.setNota1(nota1);
            a1.setNota2(nota2);
            a1.setNota3(nota3);
            
            alumnos.add(a1);
            
            System.out.println("Quiere ingresar otro alumno?");
            respuesta = sc.next();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        for (Alumno auxiliar : alumnos) { // Aca los mostramos en un for each

            System.out.println(auxiliar);

        }
               
//        alumnos.forEach((e) -> System.out.println(e));        
        
        System.out.println("Ingrese el nombre del alumno, del cual desea conocer la nota final");
        String nombreAlumno = sc.next();
        
        for (Alumno aux1 : alumnos) {
            
            if (aux1.getNombre().equalsIgnoreCase(nombreAlumno)) {
                
                System.out.println("La nota final de" + nombreAlumno + " es " + aux1.notaFinal());
            }
            
        }
        
        
        
        
        
        
    }   
    
    
    
}
