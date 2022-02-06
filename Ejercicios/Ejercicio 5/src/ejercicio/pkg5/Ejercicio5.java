/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import static ejercicio.pkg5.ServicioPais.sc;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> paisSet = new HashSet();
        
//        String respuesta = "";
//        
//        do {
//            Pais p = new Pais(); //acá no debo generar un objeto
//
//            System.out.println("Ingrese el nombre de un país");                       
//            p.setNombre(sc.next());            
//            
//            paisSet.addAll(paisSet);
//
//            System.out.println("Quiere ingresar otro país?");
//            respuesta = sc.next();
//            System.out.println(paisSet);
//        } while (respuesta.equalsIgnoreCase("si"));      
//        
        
        ServicioPais.crear(paisSet);        
        ServicioPais.mostrar(paisSet);
        
        
    }
    
}
