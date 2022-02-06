/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.pkg1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> valoresNumericos = new ArrayList();

        int tope = -99;
        int n1;
        
        System.out.println("Todos los números serán ingresados a un ArrayList, hasta que digite -99");
        
        do {
            System.out.println("Ingrese un número");
            n1 = sc.nextInt();

            if (n1 != -99) {
                valoresNumericos.add(n1);
            }

        } while (n1 != tope);

        System.out.println("Los números ingresados son:");
        for (Integer lista : valoresNumericos) {
            System.out.println("[" + lista + "]");
        }

        int suma = 0;

        for (int i = 0; i < valoresNumericos.size(); i++) {
            suma += valoresNumericos.get(i);
        }

        System.out.println("La suma de los números ingresados es:" + suma);

        double media = suma / (valoresNumericos.size());

        System.out.println("El promedio de los números ingresados es: " + media);

    }
}
