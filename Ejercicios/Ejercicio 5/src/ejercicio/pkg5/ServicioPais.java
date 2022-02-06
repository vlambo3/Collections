/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ServicioPais {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void crear (HashSet<String> paisSet) {
        String respuesta = "";
        
        do {
//            Pais p = new Pais(); //acá no debo generar un objeto

            System.out.println("Ingrese el nombre de un país");                       
            String pais = sc.next();
            
            paisSet.add(pais);

            System.out.println("Quiere ingresar otro país?");
            respuesta = sc.next();
//            System.out.println(paisSet);
        } while (respuesta.equalsIgnoreCase("si"));        
        
    }
    
    public static void mostrar(HashSet<String> paisSet) {
        System.out.println("Los países ingresados son los siguientes:");
        
        //IMPORTANTE para ordenar un HASHSET hay que convertirlo a LISTA primero
        
        ArrayList<String> lista = new ArrayList(paisSet);
        
        Collections.sort(lista);
        
        for (String aux : paisSet) {
            System.out.println(aux);
        }
        
    }
    
    
}
