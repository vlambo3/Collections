/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otro.ejercicio.pkg5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class OtroEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<String> paisSet = new HashSet();
        
        String respuesta = " ";   
        
        do {
            System.out.println("Ingrese un país");
            String pais = sc.next();
            
            paisSet.add(pais);
            
            System.out.println("Desea ingresar otro país?");
            respuesta = sc.next();
            System.out.println(paisSet);
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("------------------");
        System.out.println("Los países ingresados son:"); 
        
        paisSet.forEach((e) -> System.out.println(e));   
        
        System.out.println("------------------");
        
        for (String aux1 : paisSet) {
            System.out.println(aux1);
        }
        
        System.out.println("------------------");
        System.out.println("Los países en orden alfabético son:"); 
        
        //IMPORTANTE para ordenar un HASHSET hay que convertirlo a LISTA primero
        
        ArrayList<String> lista = new ArrayList(paisSet);
        
        Collections.sort(lista);
        
        for (String aux : lista) {
            System.out.println(aux);
        }
        
        System.out.println("Ingrese un país a eliminar del conjunto");
        String otroPais = sc.next();
        
        Iterator<String> it = paisSet.iterator();
        Integer contador = 0;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(otroPais)) { 
                it.remove();
                contador ++;
            }
        }
        
        if (contador == 0) {
            System.out.println("No se encontró el país ingresado");
        }
        
        System.out.println("El conjunto quedó de la siguiente manera");
        
        ArrayList<String> lista2 = new ArrayList(paisSet);
        
        Collections.sort(lista2);
        
        for (String aux : lista2) {
            System.out.println(aux);
        }
    }
    
}
