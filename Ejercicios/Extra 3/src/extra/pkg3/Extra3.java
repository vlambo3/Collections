/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.pkg3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Libro> libreria = new HashSet();
        Libro libros = new Libro();

        String respuesta = "";
        do {
            System.out.println("Ingrese el título del libro:");
            libros.setTitulo(sc.next());

            System.out.println("Ingrese el autor del libro:");
            libros.setAutor(sc.next());

            System.out.println("Ingrese la cantidad de ejemplares en stock en la librería:");
            int stock = 0;
            libros.setEjemplares(stock);

            int prest = 0;
            do {
                System.out.println("Ingrese la cantidad de ejemplares prestados");
                prest = sc.nextInt();

                if (prest > stock) {
                    System.out.println("La cant. prestada no puede superar el stock");
                }

            }  while (prest > stock);

            libros.setEjemplaresPrestados(prest);
            
            libreria.add(libros);
            
            System.out.println("Desea ingresar otro libro? (si/no)");
            respuesta = sc.next();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
    }
}
