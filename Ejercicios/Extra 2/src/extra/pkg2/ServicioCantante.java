/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.pkg2;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ServicioCantante {
    
    public static void crear(CantanteFamoso c) {
        Scanner sc = new Scanner(System.in);     
                
        System.out.println("Ingrese un cantante");
        c.setNombre(sc.next());
        
        System.out.println("Ingrese su disco más vendido");
        c.setDiscoConMasVentas(sc.next());
        
        
    }
    
    
    
}
