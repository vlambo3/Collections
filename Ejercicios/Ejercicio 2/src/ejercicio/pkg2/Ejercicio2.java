/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> razasDePerros = new ArrayList();

        String rta = "";

        System.out.println("Ingrese una raza de Perro");
        razasDePerros.add(sc.next());

        do {
            System.out.println("Desea ingresar otra raza de Perro (si/no)?");
            rta = sc.next();

            if (rta.equals("si")) {
                System.out.println("Ingrese la raza del Perro");
                razasDePerros.add(sc.next());
            }

        } while (rta.equalsIgnoreCase("si"));

        System.out.println("Las razas que se ingresaron fueron las siguientes:");

        for (String aux : razasDePerros) {
            System.out.println(aux);
        }

        // TODO acá arranca el ejercicio 2
        System.out.println("Ingrese una raza de Perro, si se encuentra en la lista, se eliminará");
        String ingRaza = sc.next();

//        for (int i = 0; i < razasDePerros.size(); i++) {
//
//            String razas = razasDePerros.get(i);
//            if (razas.equals(ingRaza)) {
//                razasDePerros.remove(ingRaza);
//            } 
//            else if (!razas.equals(ingRaza)) {
//                System.out.println("No se encontró la raza ingresada");
//            }
//        }
        Iterator<String> it = razasDePerros.iterator();

        int cont = 0;

        while (it.hasNext()) {
            if (it.next().equals(ingRaza)) {   
                cont ++; 
                it.remove();                
            } 
        }

        if (cont == 0) {
                    System.out.println("La raza ingresada no se encuentra en la lista");
                } 
        
        System.out.println("La lista de razas quedó de la sgt. manera:");

//            for (String aux2 : razasDePerros) {
//                System.out.println(aux2);
//            }
        razasDePerros.forEach((e) -> System.out.println(e)); // ésta forma reemplaza a las líneas 72-74

    }
}
