/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otro.ejercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ServicioAlumno {

    static Scanner sc = new Scanner(System.in);

    public static void crear(ArrayList<Alumno> alumnos) {

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
            a1.getNota().add(nota1);
            a1.getNota().add(nota2);
            a1.getNota().add(nota3);

            alumnos.add(a1);

            System.out.println("Quiere ingresar otro alumno?");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("si"));
    }

    public static void mostrar(ArrayList<Alumno> alumnos) {

        alumnos.forEach((e) -> System.out.println(e));
//        for (Alumno auxiliar : alumnos) { // Aca los mostramos en un for each//
//            System.out.println(auxiliar);//
//        }
    }

    public static void notaFinal(ArrayList<Alumno> alumnos) {
        //alumno.get(i).getNombre().equals(nom

//        int notaFinal = 0;        
        System.out.println("Ingrese el nombre del alumno, del cual desea conocer la nota final");
        String nombreAlumno = sc.next();

//        
//        
//        for (Alumno auxiliar : alumnos) {
//            Integer contador = 0;            
//            if (alumnos.get(contador).getNombre().equalsIgnoreCase(nombreAlumno)) {
//                
//            for (Integer aux : alumnos.get(contador).getNota()) {
//                System.out.println(aux);
//            }
//        }
        Integer acum = 0;
        Boolean encuentra;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombreAlumno)) {
                for (Integer aux : alumnos.get(i).getNota()) {
                    acum += aux;
                    encuentra = true;
                }
            }
            if (acum == 0) {
                System.out.println("El alumno ingresado no está en la lista");
            }
        }
        System.out.println("La nota final de " + nombreAlumno + " es " + (acum / 3));
    }

//    public int notaFinal() {
//        int notaFinal = (nota1 + nota2 + nota3) / 3;
//        return notaFinal;
}
