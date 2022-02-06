/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> razasDePerros = new ArrayList();
        String rta = "Si";

        System.out.println("Ingrese una raza de Perro");
        razasDePerros.add(sc.next());

        do {
            System.out.println("Desea ingresar otra raza de Perro (Si/No)?");
            rta = sc.next();

            if (rta.equals("Si")) {
                System.out.println("Ingrese la raza del Perro");
                razasDePerros.add(sc.next());
            } 

        } while (rta.equals("Si"));
        
        System.out.println("Las razas que se ingresaron fueron las siguientes:");
        
        for (String aux: razasDePerros) {
            System.out.println(aux);
        }
        
        
        
    }      

}
